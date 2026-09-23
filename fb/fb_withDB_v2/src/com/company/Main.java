package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {



        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

        Image logo = new Image(
                getClass().getResourceAsStream("facebook_logo_icon_147291.png")
        );

        stage.getIcons().add(logo);

        stage.setTitle("Facebook");
        stage.setScene(scene);
        stage.show();
    }



}
