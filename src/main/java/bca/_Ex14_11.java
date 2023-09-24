package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class _Ex14_11 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane p = new Pane();
        p.getChildren().add(getBaseEllipse());
        p.getChildren().add(getEyePupil(250, 250));
        p.getChildren().add(getEyePupil(440, 250));
        p.getChildren().add(getNose(350, 300,  375, 400, 325, 400));
        
        Scene scene = new Scene(p, 700, 700);
        primaryStage.setTitle("Exercise 14.11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Ellipse getBaseEllipse() {
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(350);
        ellipse.setCenterY(350);
        ellipse.setRadiusX(250);
        ellipse.setRadiusY(250);
        ellipse.setStrokeWidth(20);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.WHITE);
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

    public Polygon getNose(double x1, double y1, double x2, double y2, double x3, double y3) {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(x1, y1, x2, y2, x3, y3);
        triangle.setFill(Color.BLACK);
        return triangle;
    }
}
