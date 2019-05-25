package com.tmosest.competitiveprogramming.swing.pokemon.entity;

import com.tmosest.competitiveprogramming.swing.pokemon.sprites.PlayerSheet;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {

  private int xcord = 0;
  private int ycord = 0;
  private int xvel = 10;
  private int yvel = 10;
  private int[] vals = {0, 0, 0, 0};
  private PlayerSheet playerSheet = PlayerSheet.instance();
  private BufferedImage imageState = playerSheet.getRightStanding();

  private int startX = 50;
  private int startY = 50;
  private int wallWidth = 25;
  private int playerWidth = 15;
  private int playerHeight = 20;
  private BufferedImage background;

  /**
   * Draws the player with the back ground moving.
   * @param graphics The graphics to draw width.
   * @param background The background image we are moving.
   */
  public void drawWithMovingBackground(Graphics graphics, BufferedImage background) {
    this.background = background;
    graphics.drawImage(background, -xcord, -ycord, null);
    graphics.drawImage(imageState, startX, startY, null);
  }

  /**
   * Move the character left.
   */
  public void moveLeft() {
    if (vals[0] == 0) {
      imageState = playerSheet.getLeftStanding();
      vals[0]++;
    } else if (vals[0] == 1) {
      imageState = playerSheet.getLeftMoving();
      vals[0] = 0;
    }
    vals[1] = 0;
    vals[2] = 0;
    vals[3] = 0;
    if (xcord < -startX + wallWidth) {
      return;
    }
    xcord -= xvel;
  }

  /**
   * Move the character right.
   */
  public void moveRight() {
    if (vals[1] == 0) {
      imageState = playerSheet.getRightStanding();
      vals[1]++;
    } else if (vals[1] == 1) {
      imageState = playerSheet.getRightMoving();
      vals[1] = 0;
    }
    vals[0] = 0;
    vals[2] = 0;
    vals[3] = 0;
    if (xcord + playerWidth + wallWidth + startX > background.getWidth()) {
      return;
    }
    xcord += xvel;
  }

  /**
   * Move the character down.
   */
  public void moveDown() {
    if (vals[2] == 0) {
      imageState = playerSheet.getDownFacing();
      vals[2]++;
    } else if (vals[2] == 1) {
      imageState = playerSheet.getDownMoving();
      vals[2]++;
    } else {
      imageState = playerSheet.getDownMovingTwo();
      vals[2] = 0;
    }
    vals[0] = 0;
    vals[1] = 0;
    vals[3] = 0;
    if (ycord + playerHeight  + wallWidth + startY > background.getHeight()) {
      return;
    }
    ycord += yvel;
  }

  /**
   * Move the character up.
   */
  public void moveUp() {
    if (vals[3] == 0) {
      imageState = playerSheet.getUpFacing();
      vals[3]++;
    } else if (vals[3] == 1) {
      imageState = playerSheet.getUpMoving();
      vals[3]++;
    } else {
      imageState = playerSheet.getUpMovingTwo();
      vals[3] = 0;
    }
    vals[0] = 0;
    vals[1] = 0;
    vals[2] = 0;
    if (ycord < -startY + wallWidth) {
      return;
    }
    ycord -= yvel;
  }
}
