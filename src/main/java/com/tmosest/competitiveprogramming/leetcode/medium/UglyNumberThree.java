package com.tmosest.competitiveprogramming.leetcode.medium;

class UglyNumberThree {

  int nthUglyNumber(int index, int factor, int factorTwo, int factorThree) {
    long min = Math.min(Math.min(factor, factorTwo), factorThree);
    long res = 1;
    long pow = min * index;

    while (res <= pow) {
      long tmp = res + ((pow - res) / 2);
      long count = count(tmp, factor, factorTwo, factorThree);
      if (count == index) {
        return (int) Math.max(Math.max(tmp / factor * factor, tmp / factorTwo * factorTwo),
            tmp / factorThree * factorThree);
      } else if (count < index) {
        res = tmp + 1;
      } else {
        pow = tmp - 1;
      }

    }
    throw new IllegalArgumentException("n is too large");
  }

  private long count(long val, int one, int two, int three) {
    return val / one + val / two + val / three - countIntersection(val, one, two, one)
        - countIntersection(val, one, three, one)
        - countIntersection(val, two, three, two) + countIntersection(val, one, two, three);
  }

  private long countIntersection(long val, int one, int two, int three) {
    int twoX = two / gcd(one, two);
    int threeX = three / gcd(one, three);
    int fourX = gcd(twoX, threeX);
    long factor = (long) one * twoX * threeX;
    return fourX * val / factor;
  }

  private int gcd(int one, int two) {
    return two == 0 ? one : gcd(two, one % two);
  }
}
