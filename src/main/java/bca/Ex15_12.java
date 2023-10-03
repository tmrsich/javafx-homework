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

        Scene scene = new Scene(circle, 500, 500);
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

        // Initializes a text node to be used on the mouse event handlers
        Text text = new Text(175, 75, "You have neither entered nor exited the circle");

        // Creates the event handler for when the mouse enters the circle
        ellipse.setOnMouseEntered(event -> { text.setText("You have entered the circle"); });

        // Creates the event handler for when the mouse exits the circle
        ellipse.setOnMouseExited(event -> { text.setText("You have exited the circle"); });

        getChildren().addAll(ellipse, text);
    }
}
