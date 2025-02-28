package no.ntnu.idatx2003.oblig4.cardgame.util;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import no.ntnu.idatx2003.oblig4.cardgame.card.CardViewInterface;
import no.ntnu.idatx2003.oblig4.cardgame.deck.DeckOperation;
import no.ntnu.idatx2003.oblig4.cardgame.popup.PopupInterface;

import java.util.NoSuchElementException;

/**
* Controller class that handles the events of the 'deal hand' and 'check hand' buttons.
*
* @author Mathias Erik Nord
* @since 28.02.2025
* @version 0.0.1
*/
public class ButtonController implements EventHandler<ActionEvent> {
  private static final String DEAL_HAND = "Deal Hand";
  private static final String CHECK_HAND = "Check Hand";
  private static final String RESET_DECK = "Reset Deck";

    private final DeckOperation deckOfCards;
    private final PopupInterface popup;
    private final CardViewInterface cardView;

    public ButtonController(DeckOperation deckOfCards, CardViewInterface cardView, PopupInterface popup) {
        this.deckOfCards = deckOfCards;
        this.cardView = cardView;
        this.popup = popup;
    }

  /**
   * Handle method that will handle events for given buttons.
   *
   * @param event the event.
   */
  @Override
    public void handle(ActionEvent event) {
        if (event.getSource() instanceof Button sourceButton) {
            switch (sourceButton.getText()) {
              case DEAL_HAND -> handleDealHand();
              case CHECK_HAND -> handleCheckHand();
              case RESET_DECK -> popup.showPopupReset(deckOfCards);
              default -> System.out.println("Unknown button action" + sourceButton.getText());
            }
        }
    }

  /**
   * The event handler for the 'deal hand' button.
   * Will display cards that are accessed through {@code deckOfCards.getHand()}.
   */
  private void handleDealHand() {
      try {
        deckOfCards.dealHand(5);
      } catch (NoSuchElementException e) {
        popup.showAlert();
        return;
      }
        cardView.displayCards(deckOfCards.getHand());
    }

  /**
   * The event handler for the 'check hand' button.
   */
  private void handleCheckHand() {
     cardView.displayHand(deckOfCards.getHand());
    }
}