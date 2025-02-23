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
   * Function that deals a random hand of cards.
   *
   * @param n amount of cards to deal.
   * @return Immutable collection of cards.
   */
  public List<PlayingCard> dealHand(int n) {
    if(n < 0 || n > 52) {
      throw new IllegalArgumentException("Please provide a n between 1 and 52.");
    }
    List<PlayingCard> hand = new ArrayList<>();
    for(int i = 0; i <= n; i++) {
      hand.add(getCards().get(getRandomInt(1, 52)));
    }
    return Collections.unmodifiableList(hand);
  }

  private static int getRandomInt(int lower, int upper) {
    int range = upper - lower + 1;

    return (int)(Math.random() * range) + lower;
  }
}
