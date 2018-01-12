package com.tmosest.competitiveprogramming.hackerrank.woc.week35;

import java.util.Scanner;

/**
 * Contests -> Week of Code 35 -> Lucky Purchase Difficulty: Easy Score: 10 pts Sharon wants to buy
 * a laptop for programming. She wants the minimum prices laptop that contains only 4's and 7's in
 * the price and there must be an equal number of both. Constraints: 1 <= n <= 10^5, 1 <= length of
 * laptop name <= 10, name is in english, 1 <= price <= 10^9 Output: Name or -1. Sample Input 0: 4
 * HackerBook 777444 RankBook 3 TheBook 777 BestBook 47 Sample Output 0: BestBook link:
 * https://www.hackerrank.com/contests/w35/challenges/lucky-purchase.
 *
 * @author tmosest (Tyler Owen Moses)
 */
public class LuckyPurchase {

  public static boolean debugMode = false;

  /**
   * Main wrapper function.
   *
   * @return returns -1 or the name of the laptop.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    Laptop minimumLuckyLaptop = null;
    for (int i = 0; i < size; i++) {
      Laptop laptop = new Laptop(in.next(), in.nextInt());
      if (laptop.isLucky()
          && (minimumLuckyLaptop == null || laptop.price < minimumLuckyLaptop.price)) {
        minimumLuckyLaptop = laptop;
      }
    }
    in.close();
    return (minimumLuckyLaptop == null) ? "-1" : minimumLuckyLaptop.name;
  }

  /**
   * Main function.
   *
   * @param args Main string[]
   */
  public static void main(String[] args) {
    System.out.print(solve());
  }

  /**
   * Private static Laptop Class to represent a laptop.
   *
   * @author tmosest (Tyler Owen Moses)
   */
  private static class Laptop {

    /**
     * The name of the Laptop.
     */
    public String name;
    /**
     * The price of the Laptop.
     */
    public int price;

    /**
     * Function to create a new Laptop.
     *
     * @param name String The name of the Laptop.
     * @param price The price of the Laptop.
     */
    public Laptop(String name, int price) {
      this.name = name;
      this.price = price;
    }

    /**
     * Function to determine if the Laptop is "lucky": aka it consists of an equal number of 4's and
     * 7's only.
     */
    public boolean isLucky() {
      // Convert to a string to make life easier
      String price = Integer.toString(this.price);
      // If we have less that 2 characters then we can't have an equal count.
      // Also we need an even number of characters for there to be equal 4's and 7's
      if (price.length() < 2 || price.length() % 2 == 1) {
        return false;
      }
      // Other wise we start counting 4's and 7's
      int foursCount = 0; // 4's count
      int sevensCount = 0; // 7's count
      // Loop through
      for (int i = 0; i < price.length(); i++) {
        switch (price.charAt(i)) {
          case '4':
            foursCount++;
            break;
          case '7':
            sevensCount++;
            break;
          // If the digit is not a 4 or a 7 then we can fail.
          default:
            return false;
        }
      }
      return foursCount == sevensCount;
    }
  }

}
