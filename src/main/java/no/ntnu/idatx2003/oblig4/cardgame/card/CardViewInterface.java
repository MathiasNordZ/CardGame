package no.ntnu.idatx2003.oblig4.cardgame.card;

import java.util.List;

public interface CardViewInterface {
  void displayCards(List<PlayingCard> hand);
  void displayHand(List<PlayingCard> hand);
}
