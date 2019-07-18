package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.PriorityQueue;

class SuperUglyNumber {

  /**
   * Find the nth super ugly number.
   *
   * @param num The index.
   * @param primes The primes we are allowed to use.
   */
  int nthSuperUglyNumber(int num, int[] primes) {
    int[] ugly = new int[num];
    ugly[0] = 1;

    PriorityQueue<Candidate> queue = new PriorityQueue<>();
    for (int prime : primes) {
      queue.add(new Candidate(prime, prime, 1));
    }

    for (int i = 1; i < num; i++) {
      ugly[i] = queue.peek().val;
      while (queue.peek().val == ugly[i]) {
        Candidate cur = queue.poll();
        queue.add(new Candidate(ugly[cur.cur] * cur.base, cur.base, cur.cur + 1));
      }
    }
    return ugly[num - 1];
  }

  private class Candidate implements Comparable<Candidate> {

    int val;
    int base;
    int cur;

    private Candidate(int val, int base, int cur) {
      this.val = val;
      this.base = base;
      this.cur = cur;
    }

    @Override
    public int compareTo(Candidate that) {
      return this.val - that.val;
    }
  }
}
