package com.tmosest.competitiveprogramming.utils.sprite;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class Sprite {

  private BufferedImage spriteSheet;

  public Sprite(String url) {
    spriteSheet = loadSpriteUrl(url);
  }

  private BufferedImage loadSpriteUrl(String url) {
    BufferedImage sprite = null;

    try {
      sprite = ImageIO.read(new URL(url));
    } catch (Exception e) {
      e.printStackTrace();
    }

    return sprite;
  }

  /**
   * Get a sprite sheet.
   * @return a BufferedImage.
   */
  public BufferedImage getSpriteSheet() {
    return spriteSheet;
  }

  /**
   * Get a sprite from the sprite sheet.
   * @param xcord The x location.
   * @param ycord The y location.
   * @param height The height of the sub image.
   * @param width The width of the sub image.
   * @return The sub imsage from the above location.
   */
  public BufferedImage getSprite(int xcord, int ycord, int height, int width) {
    return spriteSheet.getSubimage(xcord, ycord, width, height);
  }

  /**
   * Get a bunch of sprites from rows and cols.
   * @param xcord The starting x location.
   * @param ycord The starting y location.
   * @param rows The number of rows.
   * @param cols The numbers of cols.
   * @param spriteHeight The height of the individual sprite.
   * @param spriteWidth The width of the individual sprite.
   * @return The sprites in list by cols then rows.
   */
  public List<BufferedImage> getSprites(
      int xcord,
      int ycord,
      int rows,
      int cols,
      int spriteHeight,
      int spriteWidth
  ) {
    List<BufferedImage> sprites = new ArrayList<>();
    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < cols; x++) {
        sprites.add(getSprite(
            x * spriteWidth + xcord,
            y * spriteHeight + ycord,
            spriteHeight,
            spriteWidth
        ));
      }
    }
    return sprites;
  }
}
