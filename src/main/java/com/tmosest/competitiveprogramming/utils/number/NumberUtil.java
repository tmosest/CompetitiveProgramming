package com.tmosest.competitiveprogramming.utils.number;

public class NumberUtil {

  /**
   * Do (num ^ pow) % mod.
   *
   * @param num The number to multiply by.
   * @param pow The power to raise to.
   * @param mod The num to mod by.
   * @return Number to the power modded.
   */
  public static int pow(int num, int pow, int mod) {
    long res = 1;

    for (int j = 1; j <= pow; j++) {
      res *= num;
      res %= mod;
    }

    return (int) res;
  }
}
