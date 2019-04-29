package com.tmosest.competitiveprogramming.swing;

import com.tmosest.competitiveprogramming.leetcode.AaLeetCodeGenerator;

import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LeetCodeCreator {

  /**
   * Creates a basic hello world swing example.
   * @param args usual main args.
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame();

    int offset = 10;
    int width = 380;
    int height = 40;

    JLabel titleLabel = new JLabel("Title:");
    frame.add(titleLabel);
    titleLabel.setBounds(offset, 10, width, height);

    JTextField title = new JTextField("1036. Escape a Large Maze");
    title.setBounds(offset, 50, width, height);
    frame.add(title);

    JLabel functionTitle = new JLabel("Function Declaration:");
    functionTitle.setBounds(offset, 100, width, height);
    frame.add(functionTitle);

    JTextArea function =
        new JTextArea("boolean isEscapePossible(int i)");
    function.setBounds(offset, 150, width, height);
    frame.add(function);

    JLabel difficultyTitle = new JLabel("Difficulty:");
    difficultyTitle.setBounds(offset, 200, width, height);
    frame.add(difficultyTitle);

    JTextField difficulty = new JTextField("hard");
    difficulty.setBounds(offset, 250, width, height);
    frame.add(difficulty);

    JButton button = new JButton("create");
    button.setBounds(offset, 300, width, height);
    button.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent event) {
        try {
          AaLeetCodeGenerator.instance().createNewProblem(
              title.getText(),
              function.getText(),
              difficulty.getText()
          );
          button.setText(title.getText() + " Created");
        } catch (IOException exception) {
          button.setText("Error: " + exception.getMessage());
        }
      }
    });
    frame.add(button);

    frame.setSize(400, 500);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
