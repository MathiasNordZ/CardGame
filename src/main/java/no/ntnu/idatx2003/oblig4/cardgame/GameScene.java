package no.ntnu.idatx2003.oblig4.cardgame;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameScene {
    private static final StackPane root = new StackPane();
    private static final GridPane gamePane = new GridPane();
    private static final BorderPane screenPane = new BorderPane();
    private static final Image background = new Image("C:\\Users\\mathi\\Desktop\\Programmering\\CardGame\\src\\main\\resources\\CardBackground.jpg");
    private static final ImageView bg = new ImageView(background);

    public GameScene() {
    }

    public static Scene getScene(Stage stage) {
        if(stage == null) {
            throw new IllegalArgumentException("Stage cannot be null.");
        }

        Button dealHand = new Button("Deal Hand");
        Button checkHand = new Button("Check Hand");

        gamePane.add(dealHand, 0, 10);
        gamePane.add(checkHand, 1, 10);
        gamePane.add(bg, 0, 4);

        root.getChildren().addAll(gamePane);

        return new Scene(root, 800, 600);
    }
}
