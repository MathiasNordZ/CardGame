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

/**
* The class that represents the main scene of the game.
*
* @author Mathias Erik Nord
* @since 28.02.2025
* @version 0.0.1
*/
public class GameScene {
    private static final int SCENE_WIDTH = 800;
    private static final int SCENE_HEIGHT = 600;

    private final StackPane root;
    private final BorderPane screenPane;
    private final ImageView bg;
    private final DeckOperation deckOfCards;
    private final CardImage cardImage;

    /**
     * Constructor that instantiates necessary instances.
     * Does also set up the background of the scene.
     */
    public GameScene() {
        this.root = new StackPane();
        this.screenPane = new BorderPane();
        this.deckOfCards = new DeckOfCards();
        this.cardImage = new CardImage();
        this.bg = new ImageView(new Image("file:src/main/resources/CardBackground.jpg"));

        setUpBackground();
    }

    /**
     * Accessor method to retrieve the scene.
     *
     * @param stage the stage to retrieve the scene to.
     * @return a new scene.
     */
    public Scene getScene(Stage stage) {
        if(stage == null) {
            throw new IllegalArgumentException("Stage cannot be null.");
        }

        root.getChildren().add(bg);

        userInterfaceSetup();

        return new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
    }

    /**
     * Private method that does set up the background of the scene.
     */
    private void setUpBackground() {
        bg.setFitHeight(SCENE_HEIGHT);
        bg.setFitWidth(SCENE_WIDTH);
        bg.setPreserveRatio(true);
    }

    /**
     * Private method that does set up the user interface of the scene.
     */
    private void userInterfaceSetup() {
        Button dealHand = createButton("Deal Hand");
        Button checkHand = createButton("Check Hand");
        Button resetDeck = createButton("Reset Deck");

        CardViewInterface cardView = new CardView(cardImage, screenPane);
        PopupInterface popup = new Popup();
        ButtonController buttonController = new ButtonController(deckOfCards, cardView, popup);

        dealHand.setOnAction(buttonController);
        checkHand.setOnAction(buttonController);
        resetDeck.setOnAction(buttonController);

        VBox buttonBox = new VBox(25);
        buttonBox.getChildren().addAll(dealHand, checkHand, resetDeck);

        screenPane.setRight(buttonBox);
        buttonBox.setAlignment(Pos.CENTER_RIGHT);
        root.setPadding(new Insets(30));

        root.getChildren().add(screenPane);

        root.getChildren().addAll(buttonBox);
    }

    /**
     * Private method that creates buttons in a standard style.
     *
     * @param buttonText text of the button.
     * @return a button.
     */
    private Button createButton(String buttonText) {
        Button button = new Button(buttonText);
        buttonSize(button);
        buttonStyle(button);
        buttonShadow(button);
        return button;
    }
}
