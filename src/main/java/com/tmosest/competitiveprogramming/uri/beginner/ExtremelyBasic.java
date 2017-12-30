package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class ExtremelyBasic {

  /**
   * Main Function.
   *
   * @param args Main String array
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    in.close();
    String result = "X = " + (num1 + num2);
    System.out.println(result);
  }
}
