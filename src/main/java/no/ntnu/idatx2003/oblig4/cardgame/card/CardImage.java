package no.ntnu.idatx2003.oblig4.cardgame.card;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.image.Image;

/**
 * Class that imports images of cards, and places them in a HashMap.
 *
 * @author Mathias Erik Nord
 * @since 28.02.2025
 * @version 0.0.1
 */
public class CardImage {
  private String cardPath;
  private String fileExtension;
  private final Map<String, Image> imageMap;

  /**
   * Constructor that will set the path and file extension of images. Does also initiate a HashMap
   * and the imageLoader function.
   */
  public CardImage() {
    setCardPath("file:src/main/resources/Cards/");
    setFileExtension(".png");
    imageMap = new HashMap<>();
    imageLoader();
  }

  /**
   * Accessor method for the cardPath.
   *
   * @return the card path.
   */
  public String getCardPath() {
    return cardPath;
  }

  /**
   * Mutator method for the cardPath.
   *
   * @param cardPath the card path.
   */
  public void setCardPath(String cardPath) {
    if (cardPath == null || cardPath.isBlank()) {
      throw new IllegalArgumentException("Card path cannot be blank or empty.");
    }
    this.cardPath = cardPath;
  }

  /**
   * Accessor method for the file extension.
   *
   * @return file extension.
   */
  public String getFileExtension() {
    return fileExtension;
  }

  /**
   * Method that sets the file extension.
   *
   * @param fileExtension file extension, ex. (.png, .jpg).
   */
  public void setFileExtension(String fileExtension) {
    if (fileExtension == null || fileExtension.isBlank()) {
      throw new IllegalArgumentException("File extension cannot be blank or empty.");
    }
    this.fileExtension = fileExtension;
  }

  /**
   * Accessor method used to retrieve the images stored in the path.
   *
   * @param card the card to display an image of.
   * @return a new image.
   */
  public Image getCardImage(PlayingCard card) {
    String imagePath = getCardPath() + card.getFace() + card.getSuit() + getFileExtension();
    return new Image(imagePath);
  }

  /**
   * Function that loads all images into a HashMap. The key represents the name of the file, and the
   * value is an image.
   */
  private void imageLoader() {
    File cardsFolder = new File(getCardPath());
    File[] cardFiles = cardsFolder.listFiles((dir, name) -> name.endsWith(fileExtension));

    if (cardFiles != null) {
      for (File card : cardFiles) {
        String fileName = card.getName();
        String key = fileName.replace(fileExtension, "");
        Image cardImage = new Image(card.toURI().toString());
        imageMap.put(key, cardImage);
        System.out.println("Loaded image: " + key);
      }
      System.out.println("Number of images: " + imageMap.size());
    }
  }
}
