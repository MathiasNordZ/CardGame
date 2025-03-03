package no.ntnu.idatx2003.oblig4.cardgame.card;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
* Test class for {@code PlayingCard}.
*
* @author Mathias Erik Nord
* @since 03.03.2025
* @version 0.0.1
*/
class PlayingCardTest {
  private PlayingCard playingCard;

  /**
   * Setup method that creates an instance of {@code PlayingCard}.
   */
  @BeforeEach
  void setUp() {
    playingCard = new PlayingCard('H', 10);
  }

  /**
   * Test that asserts if the {@code getSuit} method returns the correct value.
   */
  @Test
  void getSuitPositive() {
    assertEquals('H', playingCard.getSuit());
  }

  /**
   * Test that asserts if the {@code getFace} method returns the correct value.
   */
  @Test
  void getFace() {
    assertEquals(10, playingCard.getFace());
  }
}