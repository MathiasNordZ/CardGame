package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * The class that represents a deck of cards.
 *
 * @author Mathias Erik Nord
 * @version 0.0.1
 * @since 23.02.2025
 */
public class DeckOfCards {
  private final char[] suits = {'S', 'H', 'D', 'C'};
  private final List<PlayingCard> cards;
  private final List<PlayingCard> hand;

  /**
   * Constructor that instantiates 52 {@code PlayingCard} objects.
   * The 52 cards does represent a deck of cards.
   */
  public DeckOfCards() {
    cards = new ArrayList<>();
    for(char suit : getSuits()) {
      for(int i = 1; i <= 13; i++) {
        cards.add(new PlayingCard(suit, i));
      }
    }
    hand = new ArrayList<>();
  }

  /**
   * Accessor method for the suits of a card.
   *
   * @return the suit chars.
   */
  public char[] getSuits() {
    return this.suits;
  }

  /**
   * Accessor method for the deck of cards.
   *
   * @return immutable list containing cards.
   */
  public List<PlayingCard> getCards() {
    return Collections.unmodifiableList(this.cards);
  }

  /**
   * Accessor method for the hand of cards.
   *
   * @return immutable list containing hand of cards.
   */
  public List<PlayingCard> getHand() {
    return Collections.unmodifiableList(this.hand);
  }

  /**
   * Function that deals a random hand of cards.
   * The cards will be added into the hand.
   *
   * @param n amount of cards to deal.
   */
  public void dealHand(int n) {
    if(n < 0 || n > 52) {
      throw new IllegalArgumentException("Please provide a n between 1 and 52.");
    }
    for(int i = 0; i <= n; i++) {
      this.hand.add(getCards().get(getRandomInt(1, 52)));
    }
  }

  /**
   * Utility method to generate a random int in the range of lower and upper.
   *
   * @param lower upper bound.
   * @param upper lower bound.
   * @return random int.
   */
  private static int getRandomInt(int lower, int upper) {
    int range = upper - lower + 1;

    return (int)(Math.random() * range) + lower;
  }
}
