package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex14_12 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane p = new Pane();

        // Initializes the image view by calling the function
        ImageView view = getRectangularPrism();

        // Binds the image view's width and height properties to the width and height properties of its parent, the pane (p)
        view.fitWidthProperty().bind(p.widthProperty());
        view.fitHeightProperty().bind(p.heightProperty());

        // Adds the image view to the pane
        p.getChildren().add(view);

        // Basic javafx to create a new scene, set its title, and show the primaryStage
        Scene scene = new Scene(p, 425, 425);
        primaryStage.setTitle("Exercise 14.12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Simple method that creates an image view and sets it to the image of the rectangular prism for easy access
    public ImageView getRectangularPrism() {
        ImageView view = new ImageView();
        view.setImage(new Image("file:images/prism.jpg"));
        return view;
    }
}
