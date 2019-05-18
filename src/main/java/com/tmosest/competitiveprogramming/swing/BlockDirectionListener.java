package com.tmosest.competitiveprogramming.swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class BlockDirectionListener extends JFrame implements KeyListener {

  private static int size = 1000;
  private static int blockSize = 200;

  private Canvas canvas;
  private int posX = size / 2;
  private int posY = size / 2;

  private BlockDirectionListener() {
    super("Move the Block!");
    canvas = new Canvas();
    canvas.setBackground(Color.white);
    canvas.addKeyListener(this);
    setSize(size, size);
    add(canvas);
    show();
    drawBlock(posX, posY);
  }

  private void drawBlock(int row, int col) {
    Graphics graphics = canvas.getGraphics();
    graphics.setColor(Color.black);
    graphics.clearRect(0,0, size, size);
    graphics.drawRect(row, col, blockSize, blockSize);
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
    writeText(String.valueOf(key.getKeyCode()));
    int keyCode = key.getKeyCode();
    switch (keyCode) {
      case 37:
        posX -= 10;
        break;
      case 38:
        posY -= 10;
        break;
      case 39:
        posX += 10;
        break;
      case 40:
        posY += 10;
        break;
      default:
    }
    drawBlock(posX, posY);
  }

  @Override
  public void keyReleased(KeyEvent key) {
  }

  /**
   * Function to test things
   * @param args Command-line args.
   */
  public static void main(String[] args) {
    new BlockDirectionListener();
  }
}
