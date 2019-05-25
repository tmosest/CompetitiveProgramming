package com.tmosest.competitiveprogramming.swing.game;

import javax.swing.JFrame;

public abstract class GameFrame extends JFrame {

  int height = 400;
  int width = 300;
  boolean running = true;
  public GamePanel gamePanel;

  /**
   * Create a GameFrame
   * @param title The title of the frame.
   * @param panel The panel that is on the frame.
   * @throws InterruptedException throws.
   */
  public GameFrame(String title, GamePanel panel) throws InterruptedException {
    super(title);
    gamePanel = panel;
    add(panel);
    setSize(width, height);
    setVisible(true);
    addKeyListener(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    run();
  }

  /**
   * Create a GameFrame.
   * @param title The title of the frame.
   * @param panel The panel.
   * @param size The size (height && width).
   * @throws InterruptedException throws.
   */
  public GameFrame(String title, GamePanel panel, int size) throws InterruptedException {
    super(title);
    height = size;
    width = size;
    gamePanel = panel;
    add(panel);
    setSize(width, height);
    setVisible(true);
    addKeyListener(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    run();
  }

  /**
   * Run the game.
   * @throws InterruptedException throws.
   */
  public void run() throws InterruptedException  {
    while (running) {
      gameLoop();
      repaint();
      Thread.sleep(10);
    }
  }

  /**
   * Ran within the game cycle.
   */
  public abstract void gameLoop();
}
