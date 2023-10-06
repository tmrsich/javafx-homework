package bca;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

class Car extends BorderPane {
    public Car() {

        // Creates all the proper objects
        Rectangle r = getRectangle(0, 0, 250, 100);
        Circle c1 = getCircle1(50, 125, 30);
        Circle c2 = getCircle2(200, 125, 30);

        // Binds the rectangle layout properties to the borderpane
        layoutXProperty().bind(widthProperty().subtract(r.getWidth()).divide(1.5));
        layoutYProperty().bind(heightProperty().subtract(r.getHeight()).divide(1.5));

        // Gets the rectangle, circle1, and circle2 and adds them to the border pane
        getChildren().addAll(r, c1, c2);
    }

    public Rectangle getRectangle(int x, int y, int w, int h) {
        Rectangle r = new Rectangle();
        r.setWidth(w);
        r.setHeight(h);
        r.setLayoutX(x);
        r.setLayoutY(y);
        r.setStroke(Color.TRANSPARENT);
        r.setFill(Color.RED);
        return r;
    }

    public Circle getCircle1(int x, int y, int r) {
        Circle c = new Circle();
        c.setRadius(r);
        c.setCenterX(x);
        c.setCenterY(y);
        c.setStrokeWidth(3);
        c.setStroke(Color.BLACK);
        c.setFill(Color.BLACK);
        c.setOnMouseEntered(event -> {
            c.setFill(Color.RED);
        });
        c.setOnMouseExited(event -> {
            c.setFill(Color.BLACK);
        });
        return c;
    }

    public Circle getCircle2(int x, int y, int r) {
        Circle c = new Circle();
        c.setRadius(r);
        c.setCenterX(x);
        c.setCenterY(y);
        c.setStrokeWidth(3);
        c.setStroke(Color.BLACK);
        c.setFill(Color.BLACK);
        c.setOnMouseEntered(event -> {
            c.setFill(Color.BLUE);
        });
        c.setOnMouseExited(event -> {
            c.setFill(Color.BLACK);
        });
        return c;
    }
}
