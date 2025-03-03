package no.ntnu.idatx2003.oblig4.cardgame.card;

import java.util.List;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;

/**
 * The class handles the view of the cards and text when displaying hand.
 *
 * @author Mathias Erik Nord
 * @since 03.03.2025
 * @version 0.0.1
 */
public class CardView implements CardViewInterface {
  private final CardImage cardImage;
  private final BorderPane screenPane;
  private final CheckHand checkHand;

  /**
   * Constructor that instantiates cardImage, screenPane and checkHand.
   *
   * @param cardImage class that transforms cards to images.
   * @param screenPane the pane to display inside.
   */
  public CardView(CardImage cardImage, BorderPane screenPane) {
    this.cardImage = cardImage;
    this.screenPane = screenPane;
    this.checkHand = new CheckHand();
  }

  /**
   * Method that will display cards when 'deal hand' is pressed.
   *
   * @param hand the hand to display from.
   */
  @Override
  public void displayCards(List<PlayingCard> hand) {
    HBox cardBox = new HBox(10);
    cardBox.setPadding(new Insets(0, 0, 0, 50));
    for (PlayingCard card : hand) {
      ImageView cardView = new ImageView(cardImage.getCardImage(card));
      cardView.setFitHeight(110);
      cardView.setPreserveRatio(true);
      cardBox.getChildren().add(cardView);
      System.out.println("Displaying Card: " + card.getFace() + card.getSuit());
    }
    screenPane.setCenter(cardBox);
    cardBox.setAlignment(Pos.CENTER);
    System.out.println("Successfully dealt out hand of cards: " + hand);
  }

  /**
   * Method that shows the information when pressing 'display hand'.
   *
   * @param hand the hand to display from.
   */
  @Override
  public void displayHand(List<PlayingCard> hand) {
    TilePane tilePane = new TilePane();
    tilePane.setPadding(new Insets(0, 0, 20, 0));

    String amountOfHearts = checkHand.amountOfHearts(hand);
    int sumOfCards = checkHand.sumOfCards(hand);
    boolean flush = checkHand.flush(hand);
    String queenOfSpades = checkHand.queenOfSpades(hand);

    Label heartsLabel = new Label("Amount of hearts: " + amountOfHearts);
    Label sumLabel = new Label("Sum of Cards: " + sumOfCards);
    Label flushLabel = new Label("Flush: " + flush);
    Label queenLabel = new Label("Queen of Spades: " + queenOfSpades);

    String labelColor = "-fx-text-fill: white;";
    heartsLabel.setStyle(labelColor);
    sumLabel.setStyle(labelColor);
    queenLabel.setStyle(labelColor);
    flushLabel.setStyle(labelColor);

    tilePane.getChildren().addAll(heartsLabel, sumLabel, flushLabel, queenLabel);
    screenPane.setBottom(tilePane);

    System.out.println("Checking hand: " + hand);
  }
}
