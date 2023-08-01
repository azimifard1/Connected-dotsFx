package com.example.connectdotsfx;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Vertex extends Circle {
    public static Pane pane;
    private Vertex next;

    public Vertex(double x,double y){
        super.setCenterX(x);
        super.setCenterY(y);
        super.setRadius(10);
        super.setOnMouseDragged(e->{
            super.setCenterX(e.getX());
            super.setCenterY(e.getY());
        });
    }
    public void connect(Vertex next){
            this.next = next;
            Line l = new Line(this.getCenterX(), this.getCenterY(), next.getCenterX(), next.getCenterY());
            l.startXProperty().bind(this.centerXProperty());
            l.startYProperty().bind(this.centerYProperty());
            l.setStrokeWidth(0.5);
            l.endXProperty().bind(next.centerXProperty());
            l.endYProperty().bind(next.centerYProperty());
            pane.getChildren().add(l);

    }

}
