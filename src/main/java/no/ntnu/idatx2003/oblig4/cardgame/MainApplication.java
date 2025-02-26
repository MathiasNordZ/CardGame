package no.ntnu.idatx2003.oblig4.cardgame;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            primaryStage.setScene(GameScene.getScene(primaryStage));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        primaryStage.setTitle("Card Game");
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
