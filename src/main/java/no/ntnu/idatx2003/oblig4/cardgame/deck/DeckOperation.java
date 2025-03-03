package no.ntnu.idatx2003.oblig4.cardgame.deck;

import java.util.List;
import no.ntnu.idatx2003.oblig4.cardgame.card.PlayingCard;

/**
 * Interface that declares dealHand, getHand and resetDeck.
 *
 * @author Mathias Erik Nord
 * @since 03.03.2025
 * @version 0.0.1
 */
public interface DeckOperation {
  /**
   * Method that deals a hand.
   *
   * @param numberOfCards amount of cards.
   */
  void dealHand(int numberOfCards);

  /**
   * Accessor method for hand.
   *
   * @return the hand.
   */
  List<PlayingCard> getHand();

  /**
   * Method to reset the deck.
   */
  void resetDeck();
}
