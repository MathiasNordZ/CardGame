package no.ntnu.idatx2003.oblig4.cardgame;

import javafx.application.Application;
import javafx.stage.Stage;

/**
* The class where the application is run from.
*
* @author Mathias Erik Nord
* @since 03.03.2025
* @version 0.0.1
*/
public class MainApplication extends Application {
  GameScene gameScene = new GameScene();

  @Override
  public void start(Stage primaryStage) throws Exception {
    try {
      primaryStage.setScene(gameScene.getScene(primaryStage));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    primaryStage.setTitle("Card Game");
    primaryStage.show();
    primaryStage.setResizable(false);
  }
}
