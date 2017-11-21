package com.tmosest.CompetitiveProgramming.hackerrank.search;

import java.util.Scanner;

public class MinimumLoss {

  public static boolean debugMode = false;

  private static class MinimumLossFinder {
    private int minimumLose;
    
    public MinimumLossFinder(int[] prices) {
      minimumLose = brutForce(prices);
    }
    
    private int brutForce(int[] prices) {
      int minimumLoss = Integer.MIN_VALUE;
      for(int p = 0; p < prices.length -1 ; p++) {
        int price = prices[p];
        for(int q = p + 1; q < prices.length; q++) {
          int difference = prices[q] - price;
          minimumLoss = (difference < 0) ? Math.max(difference, minimumLoss) : minimumLoss;
        }
      }
      return -1 * minimumLoss;
    }
    
    public int getMinimumLose() {
      return minimumLose;
    }
  }

  public static int solve() {
    Scanner in = new Scanner(System.in);
    int[] prices = new int[in.nextInt()];
    for(int p = 0; p < prices.length; p++) {
      prices[p] = in.nextInt();
    }
    in.close();
    MinimumLossFinder finder = new MinimumLossFinder(prices);
    return finder.getMinimumLose();
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
