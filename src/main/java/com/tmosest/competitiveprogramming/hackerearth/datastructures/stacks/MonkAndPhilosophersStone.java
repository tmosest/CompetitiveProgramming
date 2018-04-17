package com.tmosest.competitiveprogramming.hackerearth.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MonkAndPhilosophersStone {

  public static boolean debugMode = false;

  /**
   * Function to test the challenge.
   *
   * @return The number of coins in Monks Bag
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int coins = in.nextInt();
    int[] coinArray = new int[coins];
    for (int c = 0; c < coins; c++) {
      coinArray[c] = in.nextInt();
    }
    CoinBag coinBag = new CoinBag();
    int commands = in.nextInt();
    int goal = in.nextInt();
    int coinIndex = 0;
    for (int c = 0; c < commands; c++) {
      String command = in.next();
      if (command.equals("Harry")) {
        coinBag.add(coinArray[coinIndex++]);
      } else {
        coinBag.pop();
      }
      if (coinBag.getValue() == goal) {
        return coinBag.getBagCount();
      }
    }
    in.close();
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class CoinBag {

    int value;
    Stack<Integer> stack;

    CoinBag() {
      value = 0;
      stack = new Stack<Integer>();
    }

    public void add(int coin) {
      value += coin;
      stack.add(coin);
    }

    public void pop() {
      int pop = stack.pop();
      value -= pop;
    }

    public int getValue() {
      return value;
    }

    public int getBagCount() {
      return stack.size();
    }
  }
}
