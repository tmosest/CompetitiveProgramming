package com.tmosest.competitiveprogramming.leetcode.easy;

class PrimeArrangements {

  int numPrimeArrangements(int num) {
    int primeCount = primeCount(num);

    long remain = 1;
    for (int i = 2; i <= primeCount; ++i) {
      remain = remain * i;
      remain %= 1000000007;
    }
    for (int i = 2; i <= num - primeCount; ++i) {
      remain = remain * i;
      remain %= 1000000007;
    }

    return (int) remain;
  }

  // find how many prime numbers in [1, n]
  private int primeCount(int num) {
    if (num < 2) {
      return 0;
    }
    int count = 1;
    for (int i = 3; i <= num; ++i) {
      boolean isPrime = true;
      for (int j = 2; j * j <= i; ++j) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        ++count;
      }
    }

    return count;
  }
}
