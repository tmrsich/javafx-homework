package bca;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Ex15_3 extends Application {
    private Ellipse ellipse; // Respass - Initialized as a class variable

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        // Adds a borderpane, regular pane, and an HBox with a padding of 20 in between each "element," and all 4 buttons corresponding to each primary cardinal direction
        BorderPane borderpane = new BorderPane();
        Pane pane = new Pane();
        HBox hbox = new HBox(20);
        Button btn1 = new Button("Left");
        Button btn2 = new Button("Right");
        Button btn3 = new Button("Up");
        Button btn4 = new Button("Down");
        ellipse = getEllipse(); // Respass - Initializing a private class variable to later be called in the start method

        // Creates event handlers for the buttons, so that the CenterX and CenterY attributes of the ellipse are adjusted accordingly
        btn1.setOnAction(event -> moveEllipse(-10, 0));
        btn2.setOnAction(event -> moveEllipse(10, 0));
        btn3.setOnAction(event -> moveEllipse(0, -10));
        btn4.setOnAction(event -> moveEllipse(0, 10));
        
        // Sets insets for the buttons so they don't appear crushed at the bottom
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(0, 0, 100, 0));

        // Nests the pane within the borderpane, adds the ellipse within the regular pane, sets the HBox to the bottom of the borderpane, and adds all the buttons to the HBox
        borderpane.getChildren().add(pane);
        pane.getChildren().add(ellipse);
        borderpane.setBottom(hbox);
        hbox.getChildren().addAll(btn1, btn2, btn3, btn4);

        // Creates the scene and adds the borderpane to it, sets the title, sets the scene, and shows the primary stage
        Scene scene = new Scene(borderpane, 600, 600);
        primaryStage.setTitle("Exercise 15.3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Basic method to create an ellipse (really a circle at this point) and sets its properties
    public Ellipse getEllipse() {
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(300);
        ellipse.setCenterY(300);
        ellipse.setRadiusX(100);
        ellipse.setRadiusY(100);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(10);
        ellipse.setFill(Color.RED);
        return ellipse;
    }

    // Basic method to adjust the position of the ellipse, with a public void (since it will return nothing)
    public void moveEllipse(int x, int y) {
        ellipse.setCenterX(ellipse.getCenterX() + x);
        ellipse.setCenterY(ellipse.getCenterY() + y);
    }
}