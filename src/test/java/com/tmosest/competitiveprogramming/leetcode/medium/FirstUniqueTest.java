package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("design")
@Tag("april30Day")
@DisplayName("LeetCode: x. First Unique Number")
class FirstUniqueTest {

  @Test
  void testCase0() {
    FirstUnique firstUnique = new FirstUnique(new int[] {2,3,5});
    Assertions.assertEquals(2, firstUnique.showFirstUnique()); // return 2
    firstUnique.add(5);            // the queue is now [2,3,5,5]
    Assertions.assertEquals(2, firstUnique.showFirstUnique()); // return 2
    firstUnique.add(2);            // the queue is now [2,3,5,5,2]
    Assertions.assertEquals(3, firstUnique.showFirstUnique()); // return 3
    firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
    Assertions.assertEquals(-1, firstUnique.showFirstUnique()); // return -1
  }

  @Test
  void testCase1() {
    FirstUnique firstUnique = new FirstUnique(new int[] {7,7,7,7,7,7});
    Assertions.assertEquals(-1, firstUnique.showFirstUnique()); // return -1
    firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
    firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
    firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
    firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
    firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
    Assertions.assertEquals(17, firstUnique.showFirstUnique()); // return 17
  }

  @Test
  void testCase2() {
    FirstUnique firstUnique = new FirstUnique(new int[] {809});
    Assertions.assertEquals(809, firstUnique.showFirstUnique());
    firstUnique.add(809);
    Assertions.assertEquals(-1, firstUnique.showFirstUnique());
  }
}
