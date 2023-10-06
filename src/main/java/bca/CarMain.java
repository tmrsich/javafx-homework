package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CarMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {
        Car car = new Car();
        Scene scene = new Scene(car, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test Prep");
        primaryStage.show();
    }
}