package com.tmosest.competitiveprogramming.swing.ball;

import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Ball {
  int xcord = 0;
  int ycord = 0;
  int xvel = 1;
  int yvel = 1;
  private JPanel game;

  /**
   * Create a new ball.
   * @param game The Jpanel game.
   */
  public Ball(JPanel game) {
    this.game = game;
  }

  void move() {
    if (xcord + xvel < 0) {
      xvel = 1;
    }
    if (xcord + xvel > game.getWidth() - 30) {
      xvel = -1;
    }
    if (ycord + yvel < 0) {
      yvel = 1;
    }
    if (ycord + yvel > game.getHeight() - 30) {
      yvel = -1;
    }
    xcord = xcord + xvel;
    ycord = ycord + yvel;
  }

  public void down() {
    xvel = 0;
    yvel = -1;
  }

  /**
   * Paint the ball on the scree.
   * @param graphics thee graphics.
   */
  public void paint(Graphics2D graphics) {
    graphics.fillOval(xcord, ycord, 30, 30);
  }
}
