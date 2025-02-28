package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.List;

public interface DeckOperation {
  void dealHand(int numberOfCards);
  List<PlayingCard> getHand();
  void resetDeck();
}
