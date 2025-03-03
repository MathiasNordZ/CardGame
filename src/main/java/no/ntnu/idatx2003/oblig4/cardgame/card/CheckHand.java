package no.ntnu.idatx2003.oblig4.cardgame.card;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that will handle the operations of the 'check hand' button.
 *
 * @author Mathias Erik Nord
 * @since 28.02.2025
 * @version 0.0.1
 */
public class CheckHand {
  private final String errorString;

  /**
   * Constructor, does set a common error string.
   */
  public CheckHand() {
    errorString = "The hand of cards is null/empty";
  }

  /**
   * Function that will return the total value of all cards on hand.
   *
   * @param handOfCards the hand of cards to sum.
   * @return sum of cards.
   */
  public int sumOfCards(List<PlayingCard> handOfCards) {
    if (handOfCards == null || handOfCards.isEmpty()) {
      throw new NoSuchElementException(errorString);
    }
    return handOfCards.stream().mapToInt(PlayingCard::getFace).sum();
  }

  /**
   * Function that will check if there is any hearts in the hand.
   *
   * @param handOfCards the hand of cards to check.
   * @return string of the cards 'H'.
   */
  public String amountOfHearts(List<PlayingCard> handOfCards) {
    if (handOfCards == null || handOfCards.isEmpty()) {
      throw new NoSuchElementException(errorString);
    }
    StringBuilder hearts = new StringBuilder();
    handOfCards.stream()
        .filter(card -> card.getSuit() == 'H')
        .forEach(card -> hearts.append(card.getSuit()).append(card.getFace()).append(" "));

    return hearts.toString().trim();
  }

  /**
   * Function that will check if there is a queen of spades in hand.
   *
   * @param handOfCards the hand of cards to check.
   * @return string with yes or no.
   */
  public String queenOfSpades(List<PlayingCard> handOfCards) {
    if (handOfCards == null || handOfCards.isEmpty()) {
      throw new NoSuchElementException(errorString);
    }
    return handOfCards.stream().anyMatch(card -> card.getSuit() == 'S' && card.getFace() == 12)
        ? "Yes"
        : "no";
  }

  /**
   * Function that will check if the hand is flush.
   *
   * @param handOfCards the hand of cards to check.
   * @return true if all cards are same suit, false otherwise.
   */
  public boolean flush(List<PlayingCard> handOfCards) {
    if (handOfCards == null || handOfCards.isEmpty()) {
      throw new NoSuchElementException(errorString);
    }
    char suit = handOfCards.getFirst().getSuit();
    return handOfCards.stream().allMatch(card -> card.getSuit() == suit);
  }
}
