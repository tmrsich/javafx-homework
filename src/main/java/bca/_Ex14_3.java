package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class _Ex14_3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox();
            int randomNumber1 = (int)(Math.random()*52)+1;
            int randomNumber2 = (int)(Math.random()*52)+1;
            int randomNumber3 = (int)(Math.random()*52)+1;

            String[] cardPaths = {
                "file:images/card/" + randomNumber1 + ".png",
                "file:images/card/" + randomNumber2 + ".png",
                "file:images/card/" + randomNumber3 + ".png"
            };

        ImageView view1 = new ImageView();
        view1.setImage(new Image(cardPaths[randomNumber1]));

        ImageView view2 = new ImageView();
        view2.setImage(new Image(cardPaths[randomNumber2]));

        ImageView view3 = new ImageView();
        view3.setImage(new Image(cardPaths[randomNumber3]));

        hbox.getChildren().add(view1);
        hbox.getChildren().add(view2);
        hbox.getChildren().add(view3);

        Scene scene = new Scene(hbox, 600, 600);
        primaryStage.setTitle("Exercise 14.3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
