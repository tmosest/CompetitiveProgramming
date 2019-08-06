package com.tmosest.competitiveprogramming.leetcode.medium;

class PrimePalindrome {

  /**
   * Prime palindrom.
   *
   * @param limit the limit.
   * @return the first palindrome prime less than the limit.
   */
  int primePalindrome(int limit) {
    for (int i = 1; i <= 5; ++i) {
      //Check for odd-length palindromes
      for (int root = (int) Math.pow(10, i - 1); root < (int) Math.pow(10, i); ++root) {
        StringBuilder sb = new StringBuilder(Integer.toString(root));
        for (int k = i - 2; k >= 0; --k) {
          sb.append(sb.charAt(k));
        }
        int temp = Integer.valueOf(sb.toString());
        if (temp >= limit && isPrime(temp)) {
          return temp;
        }
        //If we didn't check for even-length palindromes:
        //return N <= 11 ? min(x, 11) : x
      }

      //Check for even-length palindromes
      for (int root = (int) Math.pow(10, i - 1); root < (int) Math.pow(10, i); ++root) {
        StringBuilder sb = new StringBuilder(Integer.toString(root));
        for (int k = i - 1; k >= 0; --k) {
          sb.append(sb.charAt(k));
        }
        int temp = Integer.valueOf(sb.toString());
        if (temp >= limit && isPrime(temp)) {
          return temp;
        }
      }
    }

    throw null;
  }

  private boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    int root = (int) Math.sqrt(num);
    for (int d = 2; d <= root; ++d) {
      if (num % d == 0) {
        return false;
      }
    }
    return true;
  }
}
