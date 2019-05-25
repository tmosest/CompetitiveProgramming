package com.tmosest.competitiveprogramming.swing.ball;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel implements KeyListener {

  private Ball ball = new Ball(this);

  private void move() {
    ball.move();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    Graphics2D g2d = (Graphics2D) graphics;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
    ball.paint(g2d);
  }

  @Override
  public void keyTyped(KeyEvent event) {
  }

  @Override
  public void keyPressed(KeyEvent event) {
    ball.down();
  }

  @Override
  public void keyReleased(KeyEvent event) {
  }

  /**
   * Manual testing.
   * @param args The usual command line args.
   * @throws InterruptedException throws.
   */
  public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame("Mini Tennis");
    Game game = new Game();
    frame.add(game);
    frame.setSize(300, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addKeyListener(game);

    while (true) {
      game.move();
      game.repaint();
      Thread.sleep(10);
    }
  }
}
