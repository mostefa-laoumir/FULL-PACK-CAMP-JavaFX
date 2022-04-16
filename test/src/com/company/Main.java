package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

            Text text = new Text("Hello GDSC");
            Button button = new Button("Click me!");
            VBox root = new VBox();

            root.getChildren().add(text);
            root.getChildren().add(button);


            root.setMinSize(350,250);

            Scene scene = new Scene(root);

            primaryStage.setX(100);
            primaryStage.setY(200);

            primaryStage.setMinHeight(300);
            primaryStage.setMinWidth(400);

            primaryStage.setScene(scene);

        primaryStage.setTitle("Bonjour baguette!");

                primaryStage.show();





        }
}
