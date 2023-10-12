package bca;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Authors - Thomas Mrsich & Mr. Respass - Advised to create 3 separate flowpanes to place everything in, then place them all in 1 vbox
public class test1 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    // Initializes a long sum
    private long sum = 0;

    public void start(Stage primaryStage) {
        // Initializes a label, "double" button, a flowpane to display the labels and buttons, a flowpane to display the cards, and a VBox to center everything
        Label label = new Label("Sum: " + sum);
        Button doubleBtn = new Button("Double");
        Button clearBtn = new Button("Clear");
        FlowPane cards = new FlowPane();
        FlowPane buttons = new FlowPane();
        FlowPane sumLabel = new FlowPane();
            cards.setMargin(doubleBtn, new Insets(0, 10, 0, 0));
        VBox vbox = new VBox();

        // Creates an array with the card paths
        String[] cardPaths = {
            "file:images/card/2.png",
            "file:images/card/3.png",
            "file:images/card/4.png",
            "file:images/card/5.png",
            "file:images/card/6.png"
        };

        // Creates imageviews and sets them to the appropriate card path; Could have also set it to the file names directly, but makes it harder to change in the future
        ImageView view1 = new ImageView(new Image(cardPaths[0]));
        ImageView view2 = new ImageView(new Image(cardPaths[1]));
        ImageView view3 = new ImageView(new Image(cardPaths[2]));
        ImageView view4 = new ImageView(new Image(cardPaths[3]));
        ImageView view5 = new ImageView(new Image(cardPaths[4]));

        // Mouse events to trigger when the buttons are clicked
        doubleBtn.setOnMouseClicked(event -> {
            sum *= 2;
            label.setText("Sum: " + sum);
        });
        clearBtn.setOnMouseClicked(event -> {
            sum = 0;
            label.setText("Sum: " + sum);
        });
        
        // Mouse events to trigger when the cards are clicked
        view1.setOnMouseClicked(event -> {
            sum += 2;
            label.setText("Sum: " + sum);
        });
        view2.setOnMouseClicked(event -> {
            sum += 3;
            label.setText("Sum: " + sum);
        });
        view3.setOnMouseClicked(event -> {
            sum += 4;
            label.setText("Sum: " + sum);
        });
        view4.setOnMouseClicked(event -> {
            sum += 5;
            label.setText("Sum: " + sum);
        });
        view5.setOnMouseClicked(event -> {
            sum += 6;
            label.setText("Sum: " + sum);
        });

        // Adds everything to their appropriate flowpane, and adds those flowpanes to 1 vbox, with the cards on the first line, buttons on the 2nd, and the label on the 3rd
        sumLabel.getChildren().addAll(label);
        buttons.getChildren().addAll(doubleBtn, clearBtn);
        cards.getChildren().addAll(view1, view2, view3, view4, view5);
        vbox.getChildren().addAll(cards, buttons, sumLabel);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setTitle("Test Question 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}