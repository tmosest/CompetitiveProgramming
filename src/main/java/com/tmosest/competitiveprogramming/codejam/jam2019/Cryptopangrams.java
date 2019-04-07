package com.tmosest.competitiveprogramming.codejam.jam2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Cryptopangrams {

  private static long findGcd(long one, long two) {
    if (two == 0) {
      return one;
    }
    return findGcd(two, one % two);
  }

  /**
   * Decrypt a message.
   * @param cap The max prime value.
   * @param numbers The values of the encryption.
   * @return The decrypted message.
   */
  public static String getMessage(int cap, long[] numbers) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Set<Long> primeCandidate = new HashSet<>();
    long[] primeSequence = new long[numbers.length + 1];
    for (int i = 1; i < numbers.length; i++) {
      long prevNumber = numbers[i - 1];
      long number = numbers[i];
      if (prevNumber == number) {
        continue;
      }
      long gcd = findGcd(number, prevNumber);
      primeCandidate.add(gcd);
      primeCandidate.add(number / gcd);
      primeCandidate.add(prevNumber / gcd);
      primeSequence[i] = gcd;
      for (int j = i - 1; j > 0 && primeSequence[j] == 0; j--) {
        primeSequence[j] = numbers[j] / primeSequence[j + 1];
      }
      for (int j = i + 1; j <= numbers.length && primeSequence[j] == 0; j++) {
        primeSequence[j] = numbers[j - 1] / primeSequence[j - 1];
      }
    }
    primeSequence[0] = numbers[0] / primeSequence[1];
    List<Long> primes = new ArrayList<>();
    primes.addAll(primeCandidate);
    Collections.sort(primes);
    StringBuilder stringBuilder = new StringBuilder();
    for (long prime : primeSequence) {
      stringBuilder.append(alphabet.charAt(primes.indexOf(prime)));
    }
    return stringBuilder.toString();
  }

  /**
   * Function to run the program.
   * @param args The args for the program.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = in.nextInt();
    for (int t = 1; t <= tests; ++t) {
      int cap = in.nextInt();
      int size = in.nextInt();
      long[] numbers = new long[size];
      for (int i = 0; i < numbers.length; i++) {
        numbers[i] = in.nextLong();
      }
      try {
        System.out.println("Case #" + t + ": " + getMessage(cap, numbers));
      } catch (Exception e) {
        System.out.println("Case #" + t + ": ");
      }
    }
  }
}
