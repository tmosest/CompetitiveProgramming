package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BreakingSticks {

  public static boolean debugMode = false;

  // A function to print all prime factors
  // of a given number n
  private static ArrayList<Long> primeFactors(long number) {
    if (debugMode) {
      System.out.println("n: " + number);
    }
    ArrayList<Long> primes = new ArrayList<Long>();
    // Print the number of 2s that divide n
    while (number % 2 == 0) {
      if (debugMode) {
        System.out.print(2 + " ");
      }
      primes.add(2L);
      number /= 2;
    }

    // n must be odd at this point. So we can
    // skip one element (Note i = i +2)
    long divisor = 3;
    while (divisor * divisor <= number) {
      // While i divides n, print i and divide n
      while (number % divisor == 0) {
        if (debugMode) {
          System.out.print(divisor + " ");
        }
        primes.add(divisor);
        number /= divisor;
      }
      divisor += 2;
    }

    // This condition is to handle the case whien
    // n is a prime number greater than 2
    if (number > 2) {
      if (debugMode) {
        System.out.print(number);
      }
      primes.add(number);
    }
    if (debugMode) {
      System.out.println();
    }
    return primes;
  }

  /**
   * Function to test the problem.
   *
   * @return long result.
   */
  public static long solve() {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    long sum = 0;
    for (int i = 0; i < number; i++) {
      ArrayList<Long> primes = primeFactors(in.nextLong());
      Collections.sort(primes, Collections.reverseOrder());
      long divisorsSum = 1;
      long divisorsMult = 1;
      for (int p = 0; p < primes.size(); p++) {
        divisorsMult *= primes.get(p);
        divisorsSum += divisorsMult;
        if (debugMode) {
          System.out.println("divisorsMult: " + divisorsMult);
          System.out.println("divisorsSum: " + divisorsSum);
        }
      }
      sum += divisorsSum;
      if (debugMode) {
        System.out.println("sum: " + sum);
      }
    }
    in.close();
    return sum;
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
