package bca;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

class Car extends BorderPane {
    public Car() {
        getChildren().addAll(getRectangle(125, 200, 250, 100), getCircle1(175, 330, 30), getCircle2(315, 330, 30));
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
