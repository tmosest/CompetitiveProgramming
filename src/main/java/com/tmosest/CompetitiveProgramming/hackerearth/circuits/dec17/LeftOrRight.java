package com.tmosest.CompetitiveProgramming.hackerearth.circuits.dec17;

import java.util.Scanner;

public class LeftOrRight {

  public static boolean debugMode = false;

  private static int countSteps(int[] cities, int startCityIndex, int cityType, char direction) {
    int steps = -1;
    int N = cities.length;
    int index = startCityIndex;
    for (int i = 0; i < N; i++) {
      if (i > 0)
        index = (direction == 'R') ? (index + 1) % N : (index - 1 + N) % N;
      if (cities[index] == cityType) {
        steps = i;
        break;
      }
    }
    return steps;
  }

  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int citiesSize = in.nextInt();
    int querySize = in.nextInt();
    int[] cities = new int[citiesSize];
    for (int i = 0; i < citiesSize; i++)
      cities[i] = in.nextInt();
    if(debugMode) {
      for(int i = 0; i < citiesSize; i++) {
        System.out.println("i: " + i + " <- " + ((i - 1 + citiesSize) % citiesSize) + " -> " + (i + 1));
      }
    }
    int[] results = new int[querySize];
    for (int i = 0; i < querySize; i++) {
      results[i] = countSteps(cities, in.nextInt(), in.nextInt(), in.next().charAt(0));
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    int[] results = solve();
    for (int i : results)
      System.out.println(i);
  }
}
