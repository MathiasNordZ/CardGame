package no.ntnu.idatx2003.oblig4.cardgame.deck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
* Test class for {@code DeckOfCards}.
*
* @author Mathias Erik Nord
* @since 03.03.2025
* @version 0.0.1
*/
class DeckOfCardsTest {
  private DeckOfCards deckOfCards;

  /**
   * Setup method that instantiates a deck of cards.
   */
  @BeforeEach
  void setUp() {
    deckOfCards = new DeckOfCards();
  }

  /**
   * Test that asserts that the {@code getHand} returns correct amount of cards.
   */
  @Test
  void getHand() {
    deckOfCards.dealHand(5);
    assertEquals(5, deckOfCards.getHand().size());
  }

  /**
   * Test that asserts that the {@code dealHand} method deals correct amount of cards.
   */
  @Test
  void dealHandPositiveTest() {
    deckOfCards.dealHand(5);
    assertEquals(5, deckOfCards.getHand().size());
    assertEquals(47, deckOfCards.getCards().size());
  }

  /**
   * Test that asserts that exceptions are thrown if the {@code dealHand} parameters are illegal.
   */
  @Test
  void dealHandNegativeTest() {
    assertThrows(IllegalArgumentException.class, () -> deckOfCards.dealHand(0));
    assertThrows(IllegalArgumentException.class, () -> deckOfCards.dealHand(53));
  }

  /**
   * Test that asserts that the {@code resetDeck} method does reset the deck.
   */
  @Test
  void resetDeck() {
    deckOfCards.dealHand(10);
    deckOfCards.resetDeck();
    assertEquals(52, deckOfCards.getCards().size());
    assertEquals(0, deckOfCards.getHand().size());
    }
}