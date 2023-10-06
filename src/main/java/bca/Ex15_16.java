package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Authors: Thomas Mrsich, help provided by Mr. Respass, lines 42-52, ellipse and line method for restructuring into the main method

public class Ex15_16 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        // Creates a pane, 2 ellipses, and a line
        Pane pane = new Pane();
        Ellipse v1 = getVertice(100, 250, 50);
        Ellipse v2 = getVertice(400, 250, 50);

        Line line = new Line();
        line.setStrokeWidth(10);
        line.setStroke(Color.BLACK);

        Text text = new Text("Move the circles");
        text.xProperty().bind((line.startXProperty().add(line.endXProperty())).divide(2).subtract(30));
        text.yProperty().bind((line.startYProperty().add(line.endYProperty())).divide(2).subtract(10));

        // Binds the line's starting x and y values to the x and y values of the 1st ellipse
        line.startXProperty().bind(v1.centerXProperty());
        line.startYProperty().bind(v1.centerYProperty());
        
        // Binds the line's starting x and y values to the x and y values of the 2nd ellipse
        line.endXProperty().bind(v2.centerXProperty());
        line.endYProperty().bind(v2.centerYProperty());

        v1.setOnMouseDragged(event -> {
            v1.setCenterX(event.getX()); 
            v1.setCenterY(event.getY());
            lineDistance(text, v1, v2);
        });

        v2.setOnMouseDragged(event -> {
            v2.setCenterX(event.getX());
            v2.setCenterY(event.getY());
            lineDistance(text, v1, v2);
        });

        // Adds everything to the pane, creates a scene 500x500, sets the title, sets the primaryStage to a specific scene, and shows it
        pane.getChildren().addAll(line, v1, v2, text);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Exercise 15.6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Private method that returns nothing but sets the text to the calculated distance variable
    private void lineDistance(Text text, Ellipse v1, Ellipse v2) {
        double distance = Math.sqrt(Math.pow(v2.getCenterX() - v1.getCenterX(), 2) + Math.pow(v2.getCenterY() - v1.getCenterY(), 2));
        text.setText("Distance: " + String.format("%.2f", distance) + "Units");
    }

    // Method to initialize a vertice
    public Ellipse getVertice(int x, int y, int r) {
        Ellipse ellipse = new Ellipse();

        // Sets the various different properties of the vertice
        ellipse.setCenterX(x);
        ellipse.setCenterY(y);
        ellipse.setRadiusX(r);
        ellipse.setRadiusY(r);
        ellipse.setStrokeWidth(1);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.RED);

        // Mouse event to trigger whenever the vertices are dragged
        ellipse.setOnMouseDragged(event -> {
            ellipse.setCenterX(event.getSceneX());
            ellipse.setCenterY(event.getSceneY());
        });
        return ellipse;
    }
}