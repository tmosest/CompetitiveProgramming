package com.tmosest.competitiveprogramming.swing.pokemon.sprites;

import com.tmosest.competitiveprogramming.utils.sprite.Sprite;

import java.awt.image.BufferedImage;
import java.util.List;

public class PlayerSheet extends Sprite {

  private static final String PLAYER_SHEET_URL =
      "https://www.spriters-resource.com/resources/sheets/9/9084.png";
  private static PlayerSheet instance = new PlayerSheet();
  private List<BufferedImage> sprites;

  private PlayerSheet() {
    super(PLAYER_SHEET_URL);
    sprites = getSprites(0, 0, 1, 10, 20, 15);
  }

  public static PlayerSheet instance() {
    return instance;
  }

  public BufferedImage getRightStanding() {
    return sprites.get(0);
  }

  public BufferedImage getRightMoving() {
    return sprites.get(1);
  }

  public BufferedImage getLeftStanding() {
    return sprites.get(2);
  }

  public BufferedImage getLeftMoving() {
    return sprites.get(3);
  }

  public BufferedImage getDownFacing() {
    return sprites.get(4);
  }

  public BufferedImage getDownMoving() {
    return sprites.get(5);
  }

  public BufferedImage getDownMovingTwo() {
    return sprites.get(6);
  }

  public BufferedImage getUpFacing() {
    return sprites.get(7);
  }

  public BufferedImage getUpMoving() {
    return sprites.get(8);
  }

  public BufferedImage getUpMovingTwo() {
    return sprites.get(9);
  }
}
