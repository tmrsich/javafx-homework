package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_1 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Flags flags = new Flags();
        GridPane gp = new GridPane();

        Scene scene = new Scene(flags);
        primaryStage.setTitle("Exercise 14.1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class Flags extends GridPane {
    public Flags() {

        // Initializes an array containing the flag paths that I want to display
        ImageView[] flagViews = new ImageView[4];
        String[] flagPaths = {
            "file:images/us.gif",
            "file:images/uk.gif",
            "file:images/ca.gif",
            "file:images/china.gif"
        };

        // Initializes rows and columns for later loops
        int row = 0;
        int col = 0;

        // For each iteration that i is increased by 1, a new image view is created with flagPaths[i]
        for (int i = 0; i < 4; i++) {
            flagViews[i] = new ImageView(new Image(flagPaths[i]));
            flagViews[i].setFitWidth(415);
            flagViews[i].setFitHeight(250);
            add(flagViews[i], row, col);

            // Easy method to create a 2x2 grid
            col++;
            if (col > 1) {
                col = 0;
                row++;
            }
        }
    }
}