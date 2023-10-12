package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


// Initializes a pane, flowpane, borderpane, hbox, vbox
    /*
    Pane p = new Pane();
    StackPane sp = new StackPane();
    GridPane gp = new GridPane();
    FlowPane fp = new FlowPane();
    BorderPane bp = new BorderPane();
    HBox hbox = new HBox();
    VBox vbox = new VBox();
    */

// Initializes shapes
    /*
    Line l = new Line(startX, startY, endX, endY);
    Rectangle r = new Rectangle(x-coordinate of upper-left corner, y-coordinate, width, height);
    Ellipse e = new Ellipse(centerX, centerY, radiusX, radiusY);
    Arc a = new Arc();
    Circle c = new Circle(centerX, centerY, radiusValue);
    Polygon poly = new Polygon(Double_Array); <-- Define the double array BEFORE you initialize a new polygon with it.
        For example:
            double[] double_array = {
                0.0, 0.0,
                100.0, 200.0,
                200.0, 100.0
            };
            Polygon poly = new Polygon(doubles);
    */

// Various properties of shapes
    /*
    shape.setStrokeWidth(5);
    shape.setStroke(Color.BLACK);
    shape.setFill(Color.BLACK);
    */

public class cheatSheet extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {
        Pane p = new Pane();

        
        double[] doubles = {
            0.0, 0.0,
            100.0, 200.0,
            200.0, 100.0
        };
        
        Polygon basic = new Polygon(doubles);
        basic.setStroke(Color.BLACK);
        basic.setStrokeWidth(5);
        basic.setFill(Color.TRANSPARENT);

        p.getChildren().add(basic);
        Scene scene = new Scene(p, 500, 500);
        primaryStage.setTitle("Base");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}





// Sample program
    // public class cheatSheet extends Application {
    //     public static void main(String[] args) {
    //         Application.launch(args);
    //     }
    
    //     public void start(Stage primaryStage) {
    
    //         // Creates a new pane
    //         Pane p = new Pane();
    
    //         // Initializes the object and fills in the parameters
    //         newObject no = new newObject(250, 250, 100);
    
    //         // Boilerplate code for initializing the code
    //         Scene scene = new Scene(no, 500, 500);
    //         primaryStage.setTitle("Sample Exercise");
    //         primaryStage.setScene(scene);
    //         primaryStage.show();
    //     }
    // }
    
    // // Creates a new object called "newObject" that calls the method newObject that takes 3 parameters to create the ellipse
    // class newObject extends Pane {
    //     public newObject(int x, int y, int r) {
    //         Ellipse e = new Ellipse();
    //         e.setCenterX(x);
    //         e.setCenterY(y);
    //         e.setRadiusX(r);
    //         e.setRadiusY(r);
    //         e.setStrokeWidth(10);
    //         e.setStroke(Color.BLACK);
    //         e.setFill(Color.RED);
    //         getChildren().add(e);
    
    //         // Simple mouse events that trigger when the cursor enters the target, exits the target, and drags the target
    //         e.setOnMouseEntered(event -> {
    //             e.setFill(Color.BLUE);
    //         });
    //         e.setOnMouseExited(event -> {
    //             e.setFill(Color.RED);
    //         });
    //         e.setOnMouseDragged(event -> {
    //             e.setCenterX(event.getX());
    //             e.setCenterY(event.getY());
    //         });
    //     }
    // }