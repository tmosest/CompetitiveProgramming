package com.tmosest.competitiveprogramming.swing.game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public abstract class GamePanel extends JPanel implements KeyListener {

  @Override
  public void keyTyped(KeyEvent event) {
  }

  @Override
  public void keyPressed(KeyEvent event) {
  }

  @Override
  public void keyReleased(KeyEvent event) {
  }

  public abstract void paintGame(Graphics graphics);

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    paintGame(graphics);
  }
}
