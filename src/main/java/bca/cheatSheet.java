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

// To add rows and columns to a gridpane easily, simply add whichever elements you want to a specific row by using addRow or addColumn
    /*
    For example,
    GridPane gp = new GridPane();
    Rectangle r = new Rectangle(50, 50, 100, 50);
    Rectangle r1 = new Rectangle(50, 200, 100, 50);
    gp.addRow(r, r1); <-- Adds the 2 rectangle in a single row
    gp.addColumn(r, r1); <-- Adds the 2 rectangles in a single column
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

// Initializes some text
    /*
    Text t = new Text(String_Value);
    t.setText(newString_Value);
    */

// Initializes some JavaFX UI Components
    /*
    Label label = new Label(String_Value);
    label.setText(newString_Value);

    Button btn = new Button(String_Value);

// Two methods that do something when the mouse cursor enters and exits the buttons
    btn.setOnMouseEntered(event -> {
        btn.setText("You have entered the button");
    });

    btn.setOnMouseExited(event -> {
        btn.setText("You have exited the button");
    });
    */

// Initializes an ImageView and sets an image to it
    /*
        ImageView view = new ImageView(new Image("file:images/picture.png"); 
    */
// Initializes binding properties; Let's say for instance you want to bind the width and height of a rectangle you just created to the width and height of the window you created, and you want it to be scalable
    /*
        Rectangle r = new Rectangle(100, 100, 0, 0); <-- Rectangle positioned at 100, 100 with width and height properties of 0, since they will be "binded" (made identical) to the pane widths and heights
        r.widthProperty().bind(p.widthProperty().subtract(200));
        r.heightProperty().bind(p.heightProperty().subtract(200));
    */

// To get the coordinates of the mouse cursor in an event handler, use the constructor methods to do this: event.getX() AND event.getY()

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

        p.getChildren().addAll(basic);
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