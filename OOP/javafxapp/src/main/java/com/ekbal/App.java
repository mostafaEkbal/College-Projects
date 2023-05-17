package com.ekbal;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FlowPane container = new FlowPane(Orientation.VERTICAL, 0, 20);
        container.setAlignment(Pos.CENTER);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setFill(Color.YELLOWGREEN);
        circle.setStroke(Color.AZURE);
        hbox.getChildren().add(0, circle);

        HBox btnContainer = new HBox(5);
        Button btnEnlarge = new Button("Enlarge");
        Button btnShrink = new Button("Shrink");
        btnContainer.getChildren().addAll(btnEnlarge, btnShrink);
        container.getChildren().addAll(hbox, btnContainer);

        btnEnlarge.setOnAction(e -> {
            circle.setRadius(circle.getRadius() + 2);
        });
        btnShrink.setOnAction(e -> {
            circle.setRadius(circle.getRadius() - 2);
        });

        scene = new Scene(container, 500, 400);
        stage.setScene(scene);
        stage.setTitle("revolutionary Project");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}