package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Ex14_11 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane p = new Pane();

        p.getChildren().add(getFace());
        p.getChildren().add(getEyeball(250, 250));
        p.getChildren().add(getEyeball(440, 250));
        p.getChildren().add(getEyePupil(250, 250));
        p.getChildren().add(getEyePupil(440, 250));
        p.getChildren().add(getNose(350, 300,  375, 400, 325, 400));
        p.getChildren().add(getSmile(350, 460));

        Scene scene = new Scene(p, 700, 700);
        primaryStage.setTitle("Exercise 14.11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Ellipse getFace() {
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(350);
        ellipse.setCenterY(350);
        ellipse.setRadiusX(250);
        ellipse.setRadiusY(250);
        ellipse.setStrokeWidth(20);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.YELLOW);
        return ellipse;
    }

    public Ellipse getEyePupil(int x, int y) {
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(x);
        ellipse.setCenterY(y);
        ellipse.setRadiusX(20);
        ellipse.setRadiusY(20);
        ellipse.setFill(Color.BLACK);
        return ellipse;
    }

    public Ellipse getEyeball(int x, int y) {
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(x);
        ellipse.setCenterY(y);
        ellipse.setRadiusX(50);
        ellipse.setRadiusY(40);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(5);
        ellipse.setFill(Color.WHITE);
        return ellipse;
    }

    public Arc getSmile(int x, int y) {
        Arc topArc = new Arc();
        topArc.setCenterX(x);
        topArc.setCenterY(y);
        topArc.setRadiusX(100);
        topArc.setRadiusY(75);
        topArc.setStartAngle(180);
        topArc.setLength(180);
        topArc.setType(ArcType.CHORD);
        topArc.setStroke(Color.BLACK);
        topArc.setFill(Color.BROWN);
        topArc.setStrokeWidth(10);
        return topArc;
    }

    public Polygon getNose(double x1, double y1, double x2, double y2, double x3, double y3) {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(x1, y1, x2, y2, x3, y3);
        triangle.setFill(Color.BLACK);
        return triangle;
    }
}
