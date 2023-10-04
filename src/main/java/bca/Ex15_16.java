package bca;

import javafx.application.Application;
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
        Pane pane = new Pane();
        Vertice v1 = new Vertice(100, 250, 50);
        Vertice v2 = new Vertice(400, 250, 50);
        
        // Calculates the coordinates of the two circles
        int v1centerX = v1.getCenterX();
        int v1centerY = v1.getCenterY();
        int v2centerX = v2.getCenterX();
        int v2centerY = v2.getCenterY();

        // Sets the x1, y1, x2, y2 values (aka startX, startY, endX, endY) to the values calculated previously
        Line line = getLine(v1centerX, v1centerY, v2centerX, v2centerY);
        // line.startXProperty() // Respass included
        pane.getChildren().addAll(v1, v2, line);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Exercise 15.6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        
    public Line getLine(int x1, int y1, int x2, int y2) {
        Line line = new Line();
        line.setStartX(x1);
        line.setStartY(y1);
        line.setEndX(x2);
        line.setEndY(y2);
        line.setStrokeWidth(10);
        line.setStroke(Color.BLACK);
        return line;
    }
}

class Vertice extends Pane {
    private int CenterX;
    private int CenterY;

    public Vertice(int x, int y, int r) {
        CenterX = x;
        CenterY = y;

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(x);
        ellipse.setCenterY(y);
        ellipse.setRadiusX(r);
        ellipse.setRadiusY(r);
        ellipse.setStrokeWidth(1);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.RED);
        getChildren().add(ellipse);
    }

    public int getCenterX() {
        return CenterX;
    }

    public int getCenterY() {
        return CenterY;
    }
}
