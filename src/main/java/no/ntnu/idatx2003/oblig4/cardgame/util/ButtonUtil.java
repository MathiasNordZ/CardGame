package no.ntnu.idatx2003.oblig4.cardgame.util;

import javafx.scene.control.Button;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

/**
 * Utility class used for button properties.
 *
 * @author Mathias Erik Nord
 * @since 27.02.2025
 * @version 0.0.1
 */
public class ButtonUtil {
  private static final String DEFAULT_STYLE =
      "-fx-background-color: #D9D9D9; -fx-border-color: #D9D9D9;";
  public static final String BUTTON_EXCEPTION = "Provided button(s) cannot be null.";

  private ButtonUtil() {}

  /**
   * Method to set the size of button(s) to specified size.
   *
   * @param buttons button(s) to adjust.
   */
  public static void buttonSize(Button... buttons) {
    if (buttons == null) {
      throw new IllegalArgumentException(BUTTON_EXCEPTION);
    }
    for (Button button : buttons) {
      button.setMinSize(130, 50);
      button.setMaxSize(130, 50);
    }
  }

  /**
   * Method to set shadow effect for button(s).
   *
   * @param buttons button(s) to add shadow to.
   */
  public static void buttonShadow(Button... buttons) {
    if (buttons == null) {
      throw new IllegalArgumentException(BUTTON_EXCEPTION);
    }
    DropShadow dropShadow = new DropShadow();
    dropShadow.setColor(Color.BLACK);
    dropShadow.setBlurType(BlurType.GAUSSIAN);
    dropShadow.setOffsetX(1);
    dropShadow.setOffsetY(2);

    for (Button button : buttons) {
      button.setEffect(dropShadow);
    }
  }

  /**
   * Method to set the style of button(s).
   *
   * @param buttons button(s) to style.
   */
  public static void buttonStyle(Button... buttons) {
    if (buttons == null) {
      throw new IllegalArgumentException(BUTTON_EXCEPTION);
    }
    for (Button button : buttons) {
      button.setStyle(DEFAULT_STYLE);
      button.setOnMouseEntered(
          mouseEvent ->
              button.setStyle("-fx-background-color: #B1B1B1;  -fx-border-color: #B1B1B1;"));
      button.setOnMouseExited(mouseEvent -> button.setStyle(DEFAULT_STYLE));
    }
  }
}
