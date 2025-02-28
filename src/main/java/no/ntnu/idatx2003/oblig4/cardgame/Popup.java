package no.ntnu.idatx2003.oblig4.cardgame;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Popup implements PopupInterface {
  private static final String RESET_DECK = "Reset Deck";

  /**
   * Method that will show a popup with a reset button, to reset the deck of cards.
   */
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
    if(result.isPresent() && result.get() == resetButton) {
      deckOperation.resetDeck();
      System.out.println("Deck has been reset.");
    }
  }

  /**
   * Method that wil show an alert, when the deck is empty.
   */
  @Override
  public void showAlert() {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText("Deck of Cards is empty.");
    alert.setContentText("The deck does not contain enough cards for another hand.");
    alert.showAndWait();
  }
}
