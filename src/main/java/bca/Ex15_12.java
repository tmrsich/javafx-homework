package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex15_12 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {
        circleWithText circle = new circleWithText();

        Scene scene = new Scene(circle, 400, 400);
        primaryStage.setTitle("Exercise 15.12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class circleWithText extends Pane {
    public circleWithText() {
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(100);
        ellipse.setCenterY(60);
        ellipse.setRadiusX(50);
        ellipse.setRadiusY(50);
        ellipse.setStrokeWidth(10);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.RED);
        getChildren().addAll(ellipse, getText());
    }

    public Text getText() {
        Text text = new Text(200, 200, "Outside the circle");

        return text;
    }
}
