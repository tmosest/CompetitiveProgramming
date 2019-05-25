package com.tmosest.competitiveprogramming.swing.ball;

import com.tmosest.competitiveprogramming.swing.game.GamePanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;

public class BallGamePanel extends GamePanel {
  Ball ball;

  /**
   * Create a new ball game panel.
   */
  public BallGamePanel() {
    ball = new Ball(this);
  }

  @Override
  public void paintGame(Graphics graphics) {
    Graphics2D g2d = (Graphics2D) graphics;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
    ball.paint(g2d);
  }

  @Override
  public void keyPressed(KeyEvent event) {
    super.keyPressed(event);
  }
}
