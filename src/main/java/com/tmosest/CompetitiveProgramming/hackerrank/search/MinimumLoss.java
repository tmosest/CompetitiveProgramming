package com.tmosest.CompetitiveProgramming.hackerrank.search;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumLoss {

  public static boolean debugMode = false;

  private static class MinimumLossFinder {
    private long minimumLose;
    
    private static class PriceTouple implements Comparable<PriceTouple> {
      private long index;
      private long price;
      
      public PriceTouple(long index, long price) {
        this.index = index;
        this.price = price;
      }

      @Override
      public int compareTo(PriceTouple o) {
        if(this.price < o.price)
          return -1;
        if(this.price > o.price)
          return 1;
        return 0;
      }
      
    }
    
    private long sortedForce(long prices[]) {
      long minimumLoss = Long.MAX_VALUE;
      PriceTouple[] touples = new PriceTouple[prices.length];
      for(int i = 0; i < prices.length; i++) {
        touples[i] = new PriceTouple(i, prices[i]);
      }
      Arrays.sort(touples);
      for(int i = 0; i < prices.length - 1; i++) {
        long difference = touples[i + 1].price - touples[i].price;
        if(debugMode) {
          System.out.println("difference: " + difference);
        }
        if(touples[i + 1].index < touples[i].index && difference < minimumLoss && difference > 0) {
          minimumLoss = difference;
        }
      }
      return minimumLoss;
    }
    
    public MinimumLossFinder(long[] prices) {
      // minimumLose = brutForce(prices);
      minimumLose = sortedForce(prices);
    }
    
    private long brutForce(long[] prices) {
      long minimumLoss = Long.MIN_VALUE;
      for(int p = 0; p < prices.length -1 ; p++) {
        long price = prices[p];
        for(int q = p + 1; q < prices.length; q++) {
          long difference = prices[q] - price;
          minimumLoss = (difference < 0) ? Math.max(difference, minimumLoss) : minimumLoss;
        }
      }
      return -1 * minimumLoss;
    }
    
    public long getMinimumLose() {
      return minimumLose;
    }
  }

  public static long solve() {
    Scanner in = new Scanner(System.in);
    long[] prices = new long[in.nextInt()];
    for(int p = 0; p < prices.length; p++) {
      prices[p] = in.nextLong();
    }
    in.close();
    MinimumLossFinder finder = new MinimumLossFinder(prices);
    return finder.getMinimumLose();
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
