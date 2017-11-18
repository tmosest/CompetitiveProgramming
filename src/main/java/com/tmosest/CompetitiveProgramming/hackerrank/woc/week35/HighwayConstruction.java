package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.math.BigInteger;
import java.util.Scanner;

public class HighwayConstruction {

  public static boolean debugMode = false;

  private static class HighwayCostCalculator {

    private long cities;
    private int cost;
    private BigInteger totalCost;
    private static BigInteger prime = new BigInteger("1000000009");

    public HighwayCostCalculator(long cities, int cost) {
      this.cities = cities;
      this.cost = cost;
      calculateCost();
    }

    private void calculateCost() {
      BigInteger sum = BigInteger.ZERO;
      long counter = 0;
      while (counter < cities - 2) {
        counter++;
        BigInteger toAdd = BigInteger.valueOf(cities - counter);
        if(debugMode) {
          System.out.println("toAdd: " + toAdd);
        }
        toAdd = toAdd.pow(cost).mod(prime);
        if(debugMode) {
          System.out.println("toAdd to the " + cost + " power: " + toAdd);
        }
        sum = sum.add(toAdd);
        if(debugMode) {
          System.out.println("sum: " + sum);
        }
        sum = sum.mod(prime);
        if(debugMode) {
          System.out.println("sum: " + sum + " mod: " +  prime);
        }
      }
      totalCost = sum;
    }

    public BigInteger getCost() {
      return this.totalCost;
    }
  }

  public static BigInteger[] solve() {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    BigInteger[] result = new BigInteger[q];
    for (int i = 0; i < q; i++) {
      result[i] = new HighwayCostCalculator(in.nextLong(), in.nextInt()).getCost();
      System.out.println(result[i]);
    }
    in.close();
    return result;
  }

  public static void main(String[] args) {
    solve();
  }

}
