package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class _Ex14_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        
                ImageView[] flagViews = new ImageView[4];
                String[] flagPaths = {
                    "file:images/us.gif",
                    "file:images/uk.gif",
                    "file:images/ca.gif",
                    "file:images/china.gif",
                };

                int row = 0;
                int col = 0;

                for (int i = 0; i < 4; i++) {
                    flagViews[i] = new ImageView(new Image(flagPaths[i]));
                    flagViews[i].setFitWidth(415);
                    flagViews[i].setFitHeight(250);
                    gridpane.add(flagViews[i], row, col);
                    
                    col++;
                    if (col > 1) {
                        col = 0;
                        row++;
                    }
                }

    Scene scene = new Scene(gridpane);
    primaryStage.setTitle("Exercise 14.1");
    primaryStage.setScene(scene);
    primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
