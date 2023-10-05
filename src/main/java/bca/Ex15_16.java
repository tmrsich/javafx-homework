package bca;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex15_16 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        // Creates a pane, 2 ellipses, and a line
        Pane pane = new Pane();
        Vertice v1 = new Vertice(100, 250, 50);
        Vertice v2 = new Vertice(400, 250, 50);
        Line line = getLine();

        // Binds the line's starting x and y values to the x and y values of the 1st ellipse
        line.startXProperty().bind(v1.centerXProperty());
        line.startYProperty().bind(v1.centerYProperty());
        
        // Binds the line's starting x and y values to the x and y values of the 2nd ellipse
        line.endXProperty().bind(v2.centerXProperty());
        line.endYProperty().bind(v2.centerYProperty());

        // Adds everything to the pane, creates a scene 500x500, sets the title, sets the primaryStage to a specific scene, and shows it
        pane.getChildren().addAll(line, v1, v2);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Exercise 15.6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to create a line
    public Line getLine() {
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(0);
        line.setEndX(0);
        line.setEndY(0);
        line.setStrokeWidth(10);
        line.setStroke(Color.BLACK);
        return line;
    }
}

// Class to create a "vertice" or in this case an ellipse and adds it to the pane
class Vertice extends Pane {
    private Ellipse ellipse;
    public Vertice(int x, int y, int r) {
        ellipse = new Ellipse();
        ellipse.setCenterX(x);
        ellipse.setCenterY(y);
        ellipse.setRadiusX(r);
        ellipse.setRadiusY(r);
        ellipse.setStrokeWidth(1);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.RED);

        ellipse.setOnMousePressed(event -> {
            ellipse.setCenterX(event.getSceneX());
            ellipse.setCenterY(event.getSceneY());
        });

        ellipse.setOnMouseDragged(event -> {
            ellipse.setCenterX(event.getSceneX());
            ellipse.setCenterY(event.getSceneY());
        });

        getChildren().add(ellipse);
    }

    // Custom methods to make the ellipse center x and y properties accessible outside of the vertices class
    public DoubleProperty centerXProperty() {
        return ellipse.centerXProperty();
    }

    public DoubleProperty centerYProperty() {
        return ellipse.centerYProperty();
    }
}
