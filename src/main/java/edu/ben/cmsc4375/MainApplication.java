package edu.ben.cmsc4375;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class MainApplication extends Application {

    Button button;
    public static void main(String[] args) {
        launch(args);
        System.out.println("Choose Wisely");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Choose Your Adventure LIAM");
       Button button = new Button();
       button.setLabel("Click");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,400,400);
        scene.getStylesheets();
        primaryStage.setScene(scene);
        primaryStage.show();
//        button.setText("Click me");

        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//    primaryStage
        System.out.println("LIAM LEVELS UP!");
    }
}
