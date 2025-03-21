# Oblig 4 - Card Game

Mandatory assignment in the course Programming 2 @ Norwegian University of Technology and Science.

The whole idea behind this project is to learn how to make a GUI application in JavaFX. The application is has a GUI, where the user is able to deal a hand of 5 cards from a deck of 52 cards. The 5 random cards are then displayed on the screen. The user is hen able to click the "Check Hand" button, which displays various facts about the cards in hand.

# GUI
![img.png](img.png)

# How To Run
```
git clone git@github.com:MathiasNordZ/CardGame.git
mvn clean install
mvn javafx:run
```

# Project Structure
```
.
├── CardGame.iml
├── README.md
├── img.png
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── no
│   │   │       └── ntnu
│   │   │           └── idatx2003
│   │   │               └── oblig4
│   │   │                   └── cardgame
│   │   │                       ├── GameScene.java
│   │   │                       ├── MainApplication.java
│   │   │                       ├── card
│   │   │                       │   ├── CardImage.java
│   │   │                       │   ├── CardView.java
│   │   │                       │   ├── CardViewInterface.java
│   │   │                       │   ├── CheckHand.java
│   │   │                       │   └── PlayingCard.java
│   │   │                       ├── deck
│   │   │                       │   ├── DeckOfCards.java
│   │   │                       │   └── DeckOperation.java
│   │   │                       ├── popup
│   │   │                       │   ├── Popup.java
│   │   │                       │   └── PopupInterface.java
│   │   │                       └── util
│   │   │                           ├── ButtonController.java
│   │   │                           └── ButtonUtil.java
│   │   └── resources
│   │       ├── CardBackground.jpg
│   │       └── Cards
│   │           ├── 10C.png
│   │           ├── 10D.png
│   │           ├── 10H.png
│   │           ├── 10S.png
│   │           ├── 11C.png
│   │           ├── 11D.png
│   │           ├── 11H.png
│   │           ├── 11S.png
│   │           ├── 12C.png
│   │           ├── 12D.png
│   │           ├── 12H.png
│   │           ├── 12S.png
│   │           ├── 13C.png
│   │           ├── 13D.png
│   │           ├── 13H.png
│   │           ├── 13S.png
│   │           ├── 1C.png
│   │           ├── 1D.png
│   │           ├── 1H.png
│   │           ├── 1S.png
│   │           ├── 2C.png
│   │           ├── 2D.png
│   │           ├── 2H.png
│   │           ├── 2S.png
│   │           ├── 3C.png
│   │           ├── 3D.png
│   │           ├── 3H.png
│   │           ├── 3S.png
│   │           ├── 4C.png
│   │           ├── 4D.png
│   │           ├── 4H.png
│   │           ├── 4S.png
│   │           ├── 5C.png
│   │           ├── 5D.png
│   │           ├── 5H.png
│   │           ├── 5S.png
│   │           ├── 6C.png
│   │           ├── 6D.png
│   │           ├── 6H.png
│   │           ├── 6S.png
│   │           ├── 7C.png
│   │           ├── 7D.png
│   │           ├── 7H.png
│   │           ├── 7S.png
│   │           ├── 8C.png
│   │           ├── 8D.png
│   │           ├── 8H.png
│   │           ├── 8S.png
│   │           ├── 9C.png
│   │           ├── 9D.png
│   │           ├── 9H.png
│   │           ├── 9S.png
│   │           └── BACK.png
│   └── test
│       └── java
│           └── no
│               └── ntnu
│                   └── idatx2003
│                       └── oblig4
│                           └── cardgame
│                               ├── card
│                               │   └── PlayingCardTest.java
│                               └── deck
│                                   └── DeckOfCardsTest.java
└── target
    ├── classes
    │   ├── CardBackground.jpg
    │   ├── Cards
    │   │   ├── 10C.png
    │   │   ├── 10D.png
    │   │   ├── 10H.png
    │   │   ├── 10S.png
    │   │   ├── 11C.png
    │   │   ├── 11D.png
    │   │   ├── 11H.png
    │   │   ├── 11S.png
    │   │   ├── 12C.png
    │   │   ├── 12D.png
    │   │   ├── 12H.png
    │   │   ├── 12S.png
    │   │   ├── 13C.png
    │   │   ├── 13D.png
    │   │   ├── 13H.png
    │   │   ├── 13S.png
    │   │   ├── 1C.png
    │   │   ├── 1D.png
    │   │   ├── 1H.png
    │   │   ├── 1S.png
    │   │   ├── 2C.png
    │   │   ├── 2D.png
    │   │   ├── 2H.png
    │   │   ├── 2S.png
    │   │   ├── 3C.png
    │   │   ├── 3D.png
    │   │   ├── 3H.png
    │   │   ├── 3S.png
    │   │   ├── 4C.png
    │   │   ├── 4D.png
    │   │   ├── 4H.png
    │   │   ├── 4S.png
    │   │   ├── 5C.png
    │   │   ├── 5D.png
    │   │   ├── 5H.png
    │   │   ├── 5S.png
    │   │   ├── 6C.png
    │   │   ├── 6D.png
    │   │   ├── 6H.png
    │   │   ├── 6S.png
    │   │   ├── 7C.png
    │   │   ├── 7D.png
    │   │   ├── 7H.png
    │   │   ├── 7S.png
    │   │   ├── 8C.png
    │   │   ├── 8D.png
    │   │   ├── 8H.png
    │   │   ├── 8S.png
    │   │   ├── 9C.png
    │   │   ├── 9D.png
    │   │   ├── 9H.png
    │   │   ├── 9S.png
    │   │   └── BACK.png
    │   └── no
    │       └── ntnu
    │           └── idatx2003
    │               └── oblig4
    │                   └── cardgame
    │                       ├── GameScene.class
    │                       ├── MainApplication.class
    │                       ├── card
    │                       │   ├── CardImage.class
    │                       │   ├── CardView.class
    │                       │   ├── CardViewInterface.class
    │                       │   ├── CheckHand.class
    │                       │   └── PlayingCard.class
    │                       ├── deck
    │                       │   ├── DeckOfCards.class
    │                       │   └── DeckOperation.class
    │                       ├── popup
    │                       │   ├── Popup.class
    │                       │   └── PopupInterface.class
    │                       └── util
    │                           ├── ButtonController.class
    │                           └── ButtonUtil.class
    ├── generated-sources
    │   └── annotations
    └── maven-status
        └── maven-compiler-plugin
            └── compile
                └── default-compile
                    ├── createdFiles.lst
                    └── inputFiles.lst
```