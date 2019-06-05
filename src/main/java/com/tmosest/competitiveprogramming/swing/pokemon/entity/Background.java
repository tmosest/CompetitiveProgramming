package com.tmosest.competitiveprogramming.swing.pokemon.entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Background {

  private BufferedImage bufferedImage;
  private List<Obstacle> obstacles = new ArrayList<>();
  private int xcord;
  private int ycord;

  /**
   * Create a background.
   * @param bufferedImage Background image.
   */
  public Background(BufferedImage bufferedImage) {
    this.bufferedImage = bufferedImage;
  }

  BufferedImage getBufferedImage() {
    return bufferedImage;
  }

  List<Obstacle> getObstacles() {
    return obstacles;
  }

  int getXcord() {
    return xcord;
  }

  int getYcord() {
    return ycord;
  }

  void setXcord(int xcord) {
    this.xcord = xcord;
  }

  void setYcord(int ycord) {
    this.ycord = ycord;
  }

  void addObstacle(int xcord, int ycord, int width, int height) {
    this.obstacles.add(new Obstacle(xcord, ycord, height, width));
  }

  boolean collides(Obstacle obstacle) {
    for (Obstacle obst : obstacles) {
      if (obst.collides(obstacle)) {
        return true;
      }
    }
    return false;
  }

  void draw(Graphics graphics) {
    graphics.drawImage(getBufferedImage(), xcord, ycord, null);
    for (Obstacle obstacle : getObstacles()) {
      obstacle.draw(graphics, this);
    }
  }
}
