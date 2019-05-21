package com.tmosest.competitiveprogramming.swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class DirectionListener extends JFrame implements KeyListener {

  // create a canvas
  private Canvas canvas;

  private DirectionListener() {
    super("KeyBoard Listener");
    canvas = new Canvas();
    canvas.setBackground(Color.white);
    canvas.addKeyListener(this);
    add(canvas);
    setSize(1000, 1000);
    show();
    writeText("Press a key");
  }

  private void writeText(String key) {
    Graphics graphics = canvas.getGraphics();
    graphics.setColor(Color.BLACK);
    graphics.clearRect(0,0,1000,1000);
    graphics.drawString(key, 0, 100);
  }

  @Override
  public void keyTyped(KeyEvent key) {

  }

  @Override
  public void keyPressed(KeyEvent key) {
    writeText("key: " + key.getKeyChar() + " code: " + key.getKeyCode());
  }

  @Override
  public void keyReleased(KeyEvent key) {

  }

  /**
   * Manual testing.
   * @param args Command line args.
   */
  public static void main(String[] args) {
    new DirectionListener();
  }
}
