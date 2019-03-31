package com.tmosest.competitiveprogramming.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingExample {

  /**
   * Creates a basic hello world swing example.
   * @param args usual main args.
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JButton button = new JButton("click");
    button.setBounds(130,100,100, 40);
    frame.add(button);
    frame.setSize(400, 500);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
