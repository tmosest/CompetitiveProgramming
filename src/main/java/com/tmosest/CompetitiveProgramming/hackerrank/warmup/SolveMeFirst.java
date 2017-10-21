package com.tmosest.CompetitiveProgramming.hackerrank.warmup;

import java.util.Scanner;

public class SolveMeFirst {

  private static int solveMeFirst(int a, int b) {
    return a + b;
  }
  
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int a;
    a = in.nextInt();
    int b;
    b = in.nextInt();
    in.close();
    int sum;
    sum = solveMeFirst(a, b);
    System.out.println(sum);
    return sum;
  }

  public static void main(String[] args) {
    solve();
  }

}
