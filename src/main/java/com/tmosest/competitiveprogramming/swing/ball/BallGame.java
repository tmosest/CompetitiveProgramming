package com.tmosest.competitiveprogramming.swing.ball;

import com.tmosest.competitiveprogramming.swing.game.GameFrame;

public class BallGame extends GameFrame {

  public BallGame(BallGamePanel gamePanel) throws InterruptedException {
    super("Ball Game", gamePanel);
  }

  @Override
  public void gameLoop() {
    try {
      ((BallGamePanel) gamePanel).ball.move();
    } catch (Exception e) {
      System.out.print("Error " + e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Manual testing.
   * @param args Command line args.
   */
  public static void main(String[] args) {
    try {
      new BallGame(new BallGamePanel());
    } catch (Exception e) {
      System.out.print("Error: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
