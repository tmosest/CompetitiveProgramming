package com.tmosest.competitiveprogramming.codejam.jam2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cryptopangrams {

  private static ArrayList<Pair> pairs;

  private static class Pair {
    long one;
    long two;

    private Pair(long one, long two) {
      this.one = one;
      this.two = two;
    }
  }

  private static ArrayList<Long> findUsedPrimes(int cap, long[] numbers) {
    ArrayList<Long> usedPrimed = new ArrayList<>();
    ArrayList<Integer> allPrimes = findPrimes(cap);
    Pair previousPair = new Pair(0, 0);
    pairs = new ArrayList<>();
    for (int prime : allPrimes) {
      if (numbers[0] % prime == 0) {
        previousPair.one = prime;
        previousPair.two = numbers[0] / prime;
        usedPrimed.add(previousPair.one);
        usedPrimed.add(previousPair.two);
        pairs.add(previousPair);
        break;
      }
    }
    for (int i = 1; i < numbers.length; i++) {
      Pair pair = new Pair(0, 0);
      long num = numbers[i];
      if (num % previousPair.one == 0) {
        pair.one = previousPair.one;
        pair.two = num / previousPair.one;
      } else {
        pair.one = previousPair.two;
        pair.two = num / previousPair.two;
      }
      if (!usedPrimed.contains(pair.two)) {
        usedPrimed.add(pair.two);
      }
      pairs.add(pair);
      previousPair = pair;
    }
    Collections.sort(usedPrimed);
    return usedPrimed;
  }

  /**
   * Find all the primes up to a number.
   * @param num The limiting number.
   * @return List of primes.
   */
  public static ArrayList<Integer> findPrimes(int num) {
    ArrayList<Integer> primes = new ArrayList<>();
    boolean[] prime = new boolean[num + 1];
    for (int i = 0; i < prime.length; i++) {
      prime[i] = true;
    }
    for (int p = 2; p * p <= num; p++) {
      if (prime[p]) {
        for (int i = p * p; i <= num; i += p) {
          prime[i] = false;
        }
      }
    }
    for (int i = 2; i <= num; i++) {
      if (prime[i]) {
        primes.add(i);
      }
    }
    return primes;
  }

  /**
   * Decrypt a message.
   * @param cap The max prime value.
   * @param numbers The values of the encryption.
   * @return The decrypted message.
   */
  public static String getMessage(int cap, long[] numbers) {
    StringBuilder stringBuilder = new StringBuilder();
    ArrayList<Long> primes = findUsedPrimes(cap, numbers);
    for (int i = 0; i < numbers.length - 1; i++) {
      if (i + 1 < pairs.size()) {
        Pair pair = pairs.get(i);
        Pair nextPair = pairs.get(i + 1);
        long prime = pair.one;
        if (pair.two != nextPair.one && pair.two != nextPair.two) {
          prime = pair.two;
        }
        int primeIndex = primes.indexOf(prime);
        stringBuilder.append((char) ('A' + primeIndex));
      }
    }
    Pair lastPair = pairs.get(numbers.length - 1);
    stringBuilder.append((char) ('A' + primes.indexOf(lastPair.one)));
    stringBuilder.append((char) ('A' + primes.indexOf(lastPair.two)));
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
      System.out.println("Case #" + t + ": " + getMessage(cap, numbers));
    }
  }
}
