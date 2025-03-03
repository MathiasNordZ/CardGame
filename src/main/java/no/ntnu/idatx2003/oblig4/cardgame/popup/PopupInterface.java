package no.ntnu.idatx2003.oblig4.cardgame.popup;

import no.ntnu.idatx2003.oblig4.cardgame.deck.DeckOperation;

/**
 * Interface that declares showPopupReset and showAlert.
 *
 * @author Mathias Erik Nord
 * @since 03.03.2025
 * @version 0.0.1
 */
public interface PopupInterface {
  /**
   * Method that shows a reset popup.
   *
   * @param deckOperation the operation done on a deck.
   */
  void showPopupReset(DeckOperation deckOperation);

  /**
   * Method that shows an alert.
   */
  void showAlert();
}
