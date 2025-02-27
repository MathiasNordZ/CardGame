package no.ntnu.idatx2003.oblig4.cardgame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import static no.ntnu.idatx2003.oblig4.cardgame.util.ButtonUtil.*;

public class GameScene {
    private static final StackPane root = new StackPane();
    private static final BorderPane screenPane = new BorderPane();
    private static final Image background = new Image("file:src\\main\\resources\\CardBackground.jpg");
    private static final ImageView bg = new ImageView(background);
    private static final DeckOfCards deckOfCards = new DeckOfCards();

    public GameScene() {
    }

    public static Scene getScene(Stage stage) {
        if(stage == null) {
            throw new IllegalArgumentException("Stage cannot be null.");
        }

        bg.setFitHeight(600);
        bg.setFitWidth(800);
        bg.setPreserveRatio(true);
        root.getChildren().add(bg);

        Button dealHand = new Button("Deal Hand");
        Button checkHand = new Button("Check Hand");

        buttonSize(dealHand, checkHand);
        buttonShadow(dealHand, checkHand);
        buttonStyle(dealHand, checkHand);

        dealHand.setOnAction(event -> {
            deckOfCards.dealHand(5);
            System.out.println("Successfully dealt out hand of cards." + deckOfCards.getHand());
        });

        VBox buttonBox = new VBox(25);
        buttonBox.getChildren().addAll(dealHand, checkHand);

        screenPane.setCenter(buttonBox);
        buttonBox.setAlignment(Pos.CENTER_RIGHT);
        root.setPadding(new Insets(30));

        root.getChildren().addAll(buttonBox);

        return new Scene(root, 800, 600);
    }
}
