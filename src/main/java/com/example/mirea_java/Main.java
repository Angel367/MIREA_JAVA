package com.example.mirea_java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage компонент) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Application.fxml"));
        Scene сцена = new Scene(fxmlLoader.load());
        компонент.setResizable(false);
        компонент.setTitle("Дикий блокнот");
        компонент.setScene(сцена);
        компонент.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
