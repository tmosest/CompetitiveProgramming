package com.tmosest.competitiveprogramming.swing.pokemon.entity;

import java.awt.Color;
import java.awt.Graphics;

class Obstacle {

  private int xcord;
  private int ycord;
  private int height;
  private int width;
  private Color color = Color.red;

  Obstacle(int xcord, int ycord, int height, int width) {
    this.xcord = xcord;
    this.ycord = ycord;
    this.height = height;
    this.width = width;
  }

  int getXcord() {
    return xcord;
  }

  void setXcord(int xcord) {
    this.xcord = xcord;
  }

  int getYcord() {
    return ycord;
  }

  void setYcord(int ycord) {
    this.ycord = ycord;
  }

  int getHeight() {
    return height;
  }

  int getWidth() {
    return width;
  }

  void draw(Graphics graphics, Background background) {
    graphics.setColor(color);
    graphics.drawRect(xcord + background.getXcord(), ycord + background.getYcord(), width, height);
  }

  boolean collides(Obstacle obstacle) {
    // return false;
    // Determine if this is inside obstacle horizontally.
    boolean horizontalCollision =
        (this.getXcord() <= obstacle.getXcord() && obstacle.getXcord() <= this.getXcord() + this
            .getWidth())
            || (this.getXcord() <= obstacle.getXcord() + obstacle.getWidth()
            && obstacle.getXcord() + obstacle.getWidth() <= this.getXcord() + this.getWidth());
    boolean verticalCollision =
        (this.getYcord() <= obstacle.getYcord() && obstacle.getYcord() <= this.getYcord() + this
            .getHeight())
            || (this.getYcord() <= obstacle.getYcord() + obstacle.getHeight()
            && obstacle.getYcord() + obstacle.getHeight() <= this.getYcord() + this.getHeight());
    color = (horizontalCollision && verticalCollision) ? Color.black
        : horizontalCollision || verticalCollision ? Color.yellow : Color.red;
    return horizontalCollision && verticalCollision;
  }
}