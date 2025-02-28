package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The class that represents a deck of cards.
 *
 * @author Mathias Erik Nord
 * @version 0.0.1
 * @since 23.02.2025
 */
public class DeckOfCards implements DeckOperation {
  private final List<PlayingCard> cards;
  private final List<PlayingCard> hand;

  /**
   * Constructor that instantiates 52 {@code PlayingCard} objects.
   * The 52 cards does represent a deck of cards.
   */
  public DeckOfCards() {
    this.cards = new ArrayList<>();
    this.hand = new ArrayList<>();
    resetDeck();
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
  @Override
  public List<PlayingCard> getHand() {
    return new ArrayList<>(hand);
  }

  /**
   * Function that deals a random hand of cards.
   * The cards will be added into the hand.
   *
   * @param n amount of cards to deal.
   */
  @Override
  public void dealHand(int n) {
    if(n < 1 || n > 52) {
      throw new IllegalArgumentException("Please provide a n between 1 and 52.");
    } else if(cards.size() < n) {
      throw new NoSuchElementException("The deck doesn't contain enough cards.");
    }
    this.hand.clear();
    Collections.shuffle(cards);
    for(int i = 0; i < n; i++) {
      this.hand.add(cards.removeFirst());
    }
  }

  /**
   * Function that will reset the deck.
   */
  @Override
  public void resetDeck() {
    cards.clear();
    for(char suit : new char[]{'S', 'H', 'D', 'C'}) {
      for(int i = 1; i <= 13; i++) {
        cards.add(new PlayingCard(suit, i));
      }
    }
    hand.clear();
  }
}
