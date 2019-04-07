package com.tmosest.competitiveprogramming.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for finding primes.
 */
public class PrimeUtil {

  /**
   * Gets all primes up to and including a limit.
   * @param limit The prime limit.
   * @return A list of primes elements.
   */
  public static List<Integer> findPrimes(int limit) {
    List<Integer> primes = new ArrayList<>();
    boolean[] isCompositeNumber = new boolean[limit + 1];
    // could do i * i for checking if prime but this will add all the primes to the list.
    for (int i = 2; i <= limit; i++) {
      if (!isCompositeNumber[i]) {
        primes.add(i);
        for (int j = 2; j * i <= limit; j++) {
          isCompositeNumber[i * j] = true;
        }
      }
    }
    return primes;
  }

  /**
   * Determines the gcd of two numbers.
   * @param one First number.
   * @param two Second number.
   * @return The gcd of the two numbers.
   */
  public static long findGcd(long one, long two) {
    if (two == 0) {
      return one;
    }
    return findGcd(two, one % two);
  }
}
