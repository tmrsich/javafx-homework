package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class cheatSheet extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        // Creates a new pane
        Pane p = new Pane();

        // Initializes the object and fills in the parameters
        newObject no = new newObject(250, 250, 100);

        // Boilerplate code for initializing the code
        Scene scene = new Scene(no, 500, 500);
        primaryStage.setTitle("Sample Exercise");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// Creates a new object called "newObject" that calls the method newObject that takes 3 parameters to create the ellipse
class newObject extends Pane {
    public newObject(int x, int y, int r) {
        Ellipse e = new Ellipse();
        e.setCenterX(x);
        e.setCenterY(y);
        e.setRadiusX(r);
        e.setRadiusY(r);
        e.setStrokeWidth(10);
        e.setStroke(Color.BLACK);
        e.setFill(Color.RED);
        getChildren().add(e);

        // Simple mouse events that trigger when the cursor enters the target, exits the target, and drags the target
        e.setOnMouseEntered(event -> {
            e.setFill(Color.BLUE);
        });
        e.setOnMouseExited(event -> {
            e.setFill(Color.RED);
        });
        e.setOnMouseDragged(event -> {
            e.setCenterX(event.getX());
            e.setCenterY(event.getY());
        });
    }
}