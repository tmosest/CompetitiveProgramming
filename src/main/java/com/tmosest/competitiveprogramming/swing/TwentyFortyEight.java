package com.tmosest.competitiveprogramming.swing;

import com.tmosest.competitiveprogramming.kata.twentyfourtyeight.TwentyFortyEightGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class TwentyFortyEight extends JFrame implements KeyListener {

  private static int size = 1000;
  private Canvas canvas;
  private TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame();

  /**
   * Create a new 2048 swing game.
   */
  public TwentyFortyEight() {
    super("Twenty Forty Eight!");
    canvas = new Canvas();
    canvas.setBackground(Color.white);
    canvas.addKeyListener(this);
    setSize(size, size);
    add(canvas);
    show();
    drawBoard();
  }

  private void writeText(String key, int posX, int posY) {
    Graphics graphics = canvas.getGraphics();
    graphics.setColor(Color.BLACK);
    graphics.drawString(key, posX, posY);
  }

  private void drawBoard() {
    canvas.getGraphics().clearRect(0, 0, size, size);
    int posY = 100;
    writeText("Score: " + twentyFortyEightGame.getScore(), 100, posY);
    posY += 100;
    int[][] board = twentyFortyEightGame.getBoard();
    for (int[] row : board) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("[");
      for (int num : row) {
        stringBuilder.append(String.format("% 10d", num));
        stringBuilder.append(",");
      }
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      stringBuilder.append("]\n");
      writeText(stringBuilder.toString(), 100, posY);
      posY += 100;
    }
  }

  @Override
  public void keyTyped(KeyEvent key) {
  }

  @Override
  public void keyPressed(KeyEvent key) {
    if (!twentyFortyEightGame.isGameOver()) {
      int keyCode = key.getKeyCode();
      switch (keyCode) {
        case 37:
          twentyFortyEightGame.moveLeft();
          break;
        case 38:
          twentyFortyEightGame.moveUp();
          break;
        case 39:
          twentyFortyEightGame.moveRight();
          break;
        case 40:
          twentyFortyEightGame.moveDown();
          break;
        default:
      }
    }
    drawBoard();
  }

  @Override
  public void keyReleased(KeyEvent key) {
  }

  /**
   * Test things.
   * @param args The command line args.
   */
  public static void main(String[] args) {
    new TwentyFortyEight();
  }
}
