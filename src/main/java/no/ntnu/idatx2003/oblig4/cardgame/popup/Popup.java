package no.ntnu.idatx2003.oblig4.cardgame.popup;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import no.ntnu.idatx2003.oblig4.cardgame.deck.DeckOperation;

/**
 * The class that holds the popup message functions.
 *
 * @author Mathias Erik Nord
 * @since 03.03.2025
 * @version 0.0.1
 */
public class Popup implements PopupInterface {
  private static final String RESET_DECK = "Reset Deck";
  private final BorderPane screenPane;

  /**
   * Constructor that holds the screenPane.
   *
   * @param screenPane screenPane to link the popup to.
   */
  public Popup(BorderPane screenPane) {
    this.screenPane = screenPane;
  }

  /** Method that will show a popup with a reset button, to reset the deck of cards. */
  @Override
  public void showPopupReset(DeckOperation deckOperation) {
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle(RESET_DECK);
    alert.setHeaderText("Do you want to reset the deck?");
    alert.setContentText("This wil shuffle and reset the deck.");

    ButtonType resetButton = new ButtonType(RESET_DECK);
    ButtonType cancelButton = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

    alert.getButtonTypes().setAll(resetButton, cancelButton);

    Optional<ButtonType> result = alert.showAndWait();
    if (result.isPresent() && result.get() == resetButton) {
      deckOperation.resetDeck();
      screenPane.setCenter(null);
      System.out.println("Deck has been reset.");
    }
  }

  /** Method that wil show an alert, when the deck is empty. */
  @Override
  public void showAlert() {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText("Deck of Cards is empty.");
    alert.setContentText("The deck does not contain enough cards for another hand.");
    alert.showAndWait();
  }
}
