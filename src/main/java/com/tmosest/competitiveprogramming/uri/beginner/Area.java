package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

  private static final double pi = 3.14159;
  public static boolean debugMode = false;

  private static String roundTwoDecimals(double number) {
    DecimalFormat twoDForm = new DecimalFormat("#.000");
    return twoDForm.format(number);
  }

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    double numA = in.nextDouble();
    double numB = in.nextDouble();
    double numC = in.nextDouble();
    in.close();
    double triArea = .5 * numA * numC;
    double circleArea = pi * numC * numC;
    double trapArea = (numA + numB) / 2 * numC;
    double squareArea = numB * numB;
    double rectArea = numA * numB;
    String result = "TRIANGULO: " + roundTwoDecimals(triArea) + "\n"
        + "CIRCULO: "+ roundTwoDecimals(circleArea) + "\n"
        + "TRAPEZIO: " + roundTwoDecimals(trapArea) + "\n"
        + "QUADRADO: " + roundTwoDecimals(squareArea) + "\n"
        + "RETANGULO: " + roundTwoDecimals(rectArea);
    return result;
  }

  /**
   * Main function.
   *
   * @param args String array.
   */
  public static void main(String[] args) {
    System.out.println(solve());
  }

}
