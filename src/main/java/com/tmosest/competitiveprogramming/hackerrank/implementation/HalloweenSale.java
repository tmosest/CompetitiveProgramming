package com.tmosest.competitiveprogramming.hackerrank.implementation;

import java.util.Scanner;

public class HalloweenSale {

  public static boolean debugMode = false;

  /**
   * Determines the number of games that you can buy.
   *
   * @param price Initial price of the game.
   * @param decrement How much the cost decreases with each purchase.
   * @param floor The lowest possible cost of a game.
   * @param wallet The amount of money you have.
   * @return The number of games you can buy.
   */
  static int howManyGames(int price, int decrement, int floor, int wallet) {
    int count = 0;
    // Loop until we are out of money
    while (wallet > 0) {
      // Determine cost based on count sold
      int cost = price - decrement * count;
      // Check if floor is greater
      cost = Math.max(floor, cost);
      // Decrement cost.
      wallet -= cost;
      // If we could afford it then increment the count
      if (wallet >= 0) {
        count++;
      }
    }
    return count;
  }

  /**
   * Public method for testing.
   *
   * @return The number of games you can play.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int price = in.nextInt();
    int decrement = in.nextInt();
    int floor = in.nextInt();
    int wallet = in.nextInt();
    in.close();
    return howManyGames(price, decrement, floor, wallet);
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
