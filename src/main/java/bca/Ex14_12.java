package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex14_12 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        





        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 14.12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
