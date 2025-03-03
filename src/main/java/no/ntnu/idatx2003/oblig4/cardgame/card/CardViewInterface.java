package no.ntnu.idatx2003.oblig4.cardgame.card;

import java.util.List;

/**
 * Interface that defines the abstract methods displayCards and displayHand.
 *
 * @author Mathias Erik Nord
 * @since 03.03.2025
 * @version 0.0.1
 */
public interface CardViewInterface {

  /**
   * Abstract method that displays cards.
   *
   * @param hand the hand to display from.
   */
  void displayCards(List<PlayingCard> hand);

  /**
   * Abstract method that displays the hand.
   *
   * @param hand the hand to display from.
   */
  void displayHand(List<PlayingCard> hand);
}
