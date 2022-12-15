package com.lemoentjiez.mastermind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;


public class HelloApplication extends Application {

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage mainStage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("main.fxml")));
        MScene scene = new MScene(root);

        Image img = new Image("logo.jpg");

        mainStage.setTitle("Mastermind");
        mainStage.getIcons().add(img);
        mainStage.setWidth(500);
        mainStage.setHeight(900);
        mainStage.setResizable(false);
        mainStage.setScene(scene);
        mainStage.show();
    }
}