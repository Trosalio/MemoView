package client;

import client.controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;


import java.io.IOException;

public class ClientMain extends Application {

    private static Stage primaryStage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        ClientMain.primaryStage = stage;
        MainController mc = new MainController();
        mc.handleLoad();
        mc.start();
    }

    public static Stage getPrimaryStage(){
        return primaryStage;
    }
}
