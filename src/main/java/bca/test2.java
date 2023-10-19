package bca;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class test2 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    public void start(Stage primaryStage) {
        Pane p = new Pane();
        p.getChildren().addAll(getAll());

        Scene scene = new Scene(p, 800, 800);
        primaryStage.setTitle("Alternate Test Question #2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public VBox getAll() {

    // Main vertical box to make everything centered in addition to the other main vertical boxes
    VBox main = new VBox();
    FlowPane inputsFlowpane = new FlowPane();
    FlowPane graphFlowpane = new FlowPane();
        graphFlowpane.setPrefWidth(800);
    
    // Other secondary boxes that are created
    VBox names = new VBox();
    VBox numInputs = new VBox();
    VBox rectangleVBox = new VBox();
    VBox graphLabels = new VBox();

    // Primary labels created
    Label label = new Label("Label:");
    Label values = new Label("Values:");
    Button show = new Button("Show");

    // Creation of textfields
    TextField tf1 = new TextField();
    TextField tf2 = new TextField();
    TextField tf3 = new TextField();
    TextField tf4 = new TextField();
    TextField tf5 = new TextField();
    TextField tf6 = new TextField();
    
    // Creation of labels that will be used in displaying the text that is inputted by the user
    Label L1 = new Label();
    Label L2 = new Label();
    Label L3 = new Label();

    // Creation of rectangles
    Rectangle R1 = new Rectangle(0, 0);
    Rectangle R2 = new Rectangle(0, 0);
    Rectangle R3 = new Rectangle(0, 0);

    // Sets "insets"/padding/margins to make the labels more "visually appealing"
    L1.setPadding(new Insets(50, 0, 0, 50));
    L2.setPadding(new Insets(75, 0, 0, 50));
    L3.setPadding(new Insets(75, 0, 0, 50));
    
    // Only rectangles and resets the label texts whenever the "show" button is clicked
    show.setOnMouseClicked(event -> {
        L1.setText(tf1.getText());
        L2.setText(tf2.getText());
        L3.setText(tf3.getText());
        
        R1.setWidth(Double.parseDouble(tf4.getText()));
        R1.setHeight(100);
        R1.setFill(Color.BLACK);
        
        R2.setWidth(Double.parseDouble(tf5.getText()));
        R2.setHeight(100);
        R2.setFill(Color.RED);
    
        R3.setWidth(Double.parseDouble(tf6.getText()));
        R3.setHeight(100);
        R3.setFill(Color.BLUE);
    });

    
    // Rectangle mouse events to trigger color changes
    R1.setOnMouseEntered(event -> {
        R1.setFill(Color.BROWN);
    });
    R1.setOnMouseExited(event -> {
        R1.setFill(Color.BLACK);
    });

    R2.setOnMouseEntered(event -> {
        R2.setFill(Color.ORANGE);
    });
    R2.setOnMouseExited(event -> {
        R2.setFill(Color.RED);
    });    

    R3.setOnMouseEntered(event -> {
        R3.setFill(Color.PURPLE);
    });
    R3.setOnMouseExited(event -> {
        R3.setFill(Color.BLUE);
    });

    // Flowpanes that add individual components
    names.getChildren().addAll(label, tf1, tf2, tf3);
    numInputs.getChildren().addAll(values, tf4, tf5, tf6, show);
    graphLabels.getChildren().addAll(L1, L2, L3);
    rectangleVBox.getChildren().addAll(R1, R2, R3);

    // Separate flowpanes to be added on in a single VBox
    inputsFlowpane.getChildren().addAll(names, numInputs);
    graphFlowpane.getChildren().addAll(graphLabels, rectangleVBox);

    // Main VBox where everything else is visible on the screen
    main.getChildren().addAll(inputsFlowpane, graphFlowpane);
    return main;
    }
}
