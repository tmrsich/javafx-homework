package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex14_3 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

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

        /* Used for debugging, originally I had 
        view1.setImage(new Image(cardPaths[randomNumber1]));
        
        when instead I should have had:
        view1.setImage(new Image(cardPaths[0])); as this line would reference the cardPaths array which would THEN take the random number generated from Math.random() and display the card

        In layman's terms, I was attempting to set a view to a new image, referencing an element in the cardPaths array that didn't exist, because it only had 3 elements.
        i.e. cardPaths[randomNumber1] let's say the random number is 43, then, cardPaths[43] would attempt to find element 42 (0 indexing) in my cardPaths array, but since I only had 3 elements in
        my cardPaths[] array it would throw me an out of bounds error for an array.

        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        System.out.println("file:images/card/" + randomNumber1 + ".png");
        System.out.println(cardPaths[1]);
        ImageView view = new ImageView();
        view.setImage(new Image(cardPaths[0]));
        hbox.getChildren().add(view);
        */

        ImageView view1 = new ImageView();
        view1.setImage(new Image(cardPaths[0]));

        ImageView view2 = new ImageView();
        view2.setImage(new Image(cardPaths[1]));

        ImageView view3 = new ImageView();
        view3.setImage(new Image(cardPaths[2]));

        hbox.getChildren().add(view1);
        hbox.getChildren().add(view2);
        hbox.getChildren().add(view3);

        Scene scene = new Scene(hbox, 600, 600);
        primaryStage.setTitle("Exercise 14.3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// package bca;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.HBox;
// import javafx.stage.Stage;

// public class Ex14_3 extends Application {
//     public static void main(String[] args) {
//         Application.launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) {
//         Cards cards = new Cards();
     
//         // Barebones javafx to create a stage, set its title, and display it
//         Scene scene = new Scene(cards, 600, 600);
//         primaryStage.setTitle("Exercise 14.3");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }
// }

// class Cards extends HBox {
//     public Cards() {
        
//         // Generates 3 random numbers to pick from an array of cards
//         int randomNumber1 = (int)(Math.random()*52)+1;
//         int randomNumber2 = (int)(Math.random()*52)+1;
//         int randomNumber3 = (int)(Math.random()*52)+1;

//         // Contains the filepaths of each card, filling in the random number with the file extension .png to ensure each card is selected properly
//         String[] cardPaths = {
//             "file:images/card/" + randomNumber1 + ".png",
//             "file:images/card/" + randomNumber2 + ".png",
//             "file:images/card/" + randomNumber3 + ".png"
//         };

//         ImageView view1 = new ImageView();
//         view1.setImage(new Image(cardPaths[randomNumber1]));

//         ImageView view2 = new ImageView();
//         view2.setImage(new Image(cardPaths[randomNumber2]));

//         ImageView view3 = new ImageView();
//         view3.setImage(new Image(cardPaths[randomNumber3]));

//         getChildren().addAll(
//             view1,
//             view2,
//             view3
//         );
//     }
// }
