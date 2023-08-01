package com.example.connectdotsfx;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Window extends Pane {
    private Button addDot;
    private List<Vertex> vertexList = new ArrayList<>();
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private Random r = new Random();
    public Window() {
        Vertex.pane = this;
        this.addDot = new Button("Add");
        this.addDot.setPrefSize(100, 30);
        this.addDot.setTranslateX(WIDTH/2 - this.addDot.getPrefWidth()/2 );
        this.addDot.setTranslateY(HEIGHT - (this.addDot.getPrefHeight()/2+20));
        super.setPrefSize(WIDTH, HEIGHT);

        Vertex v1 = new Vertex(100,100);
        Vertex v2 = new Vertex(100,150);
        v1.connect(v2);
        vertexList.add(v1);
        vertexList.add(v2);

        super.getChildren().addAll(addDot,v1,v2);

        addDot.setOnMouseClicked(e -> addVertex(e));

    }

    public void addVertex(MouseEvent e) {
        Vertex c = new Vertex(r.nextInt(WIDTH),r.nextInt(HEIGHT));
        c.connect(vertexList.get(0));
        vertexList.add(c);
        super.getChildren().add(c);
    }

}
