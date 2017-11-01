package com.tmosest.CompetitiveProgramming.hackerrank.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk {

  private static long calculateCalories(long cupCakeCalcories, int numCupCakes) {
    long result = 1;
    for (int i = 1; i <= numCupCakes; i++) {
      result *= 2;
    }
    return cupCakeCalcories * result;
  }

  public static long solve() {
    Scanner in = new Scanner(System.in);
    int totalCupCakes = in.nextInt();

    int[] cupcakes = new int[totalCupCakes];

    for (int i = 0; i < totalCupCakes; i++)
      cupcakes[i] = in.nextInt();

    in.close();

    Arrays.sort(cupcakes);

    long calories = 0;
    int count = 0;
    for (int i = totalCupCakes - 1; i >= 0; i--) {
      calories += calculateCalories(cupcakes[i], count++);
    }
    System.out.println(calories);
    return calories;
  }

  public static void main(String[] args) {
    solve();
  }

}
