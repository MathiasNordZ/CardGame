package no.ntnu.idatx2003.oblig4.cardgame.deck;

import no.ntnu.idatx2003.oblig4.cardgame.card.PlayingCard;

import java.util.List;

public interface DeckOperation {
  void dealHand(int numberOfCards);
  List<PlayingCard> getHand();
  void resetDeck();
}
