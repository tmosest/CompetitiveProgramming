package com.tmosest.competitiveprogramming.kata.twentyfourtyeight;

import java.util.Scanner;

public class TwentyFortyEightCommandLineGame {

  /**
   * Manual testing.
   * @param args Command line args.
   */
  public static void main(String[] args) {
    TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame();
    Scanner scanner = new Scanner(System.in);
    while (!twentyFortyEightGame.isGameOver()) {
      System.out.print(twentyFortyEightGame.toString());
      System.out.println("Move which way? (u,d,l,r)");
      String input = scanner.next();
      switch (input.trim().toLowerCase()) {
        case "u":
          twentyFortyEightGame.moveUp();
          break;
        case "d":
          twentyFortyEightGame.moveDown();
          break;
        case "l":
          twentyFortyEightGame.moveLeft();
          break;
        case "r":
          twentyFortyEightGame.moveRight();
          break;
        default:
          System.out.println("Unknown direction");
      }
    }
    System.out.println("!!!!!!!!!!GAME OVER!!!!!!!!!!");
    System.out.print(twentyFortyEightGame.toString());
  }
}
