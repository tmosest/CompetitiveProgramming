package com.tmosest.competitiveprogramming.interview;

import com.tmosest.competitiveprogramming.leetcode.medium.Codec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdjacentDuplicatesTest {

  private AdjacentDuplicates adjacentDuplicates = new AdjacentDuplicates();

  private void test(int output, int[] input) {
    Assertions.assertEquals(output, adjacentDuplicates.longestSequence(input));
  }

  @Test
  void testCase0() {
    test(0, new int[] {});
  }

  @Test
  void testCase1() {
    test(1, new int[] { 1 });
  }

  @Test
  void testCase2() {
    test(1, new int[] { 1, 2 , 1});
  }

  @Test
  void testCase3() {
    test(2, new int[] { 1, 1 , 2});
  }

  @Test
  void testCase4() {
    test(5, new int[] { 1, 0 , 2, 3, 3, 3, 3, 3, 1});
  }

  private void test(int output, String tree) {
    Assertions.assertEquals(output, adjacentDuplicates.longestSequence(new Codec().deserialize(tree)));
  }

  @Test
  void testCase5() {
    test(1, "[1,2,3,4]");
  }

  @Test
  void testCase6() {
    test(2, "[1,1,3,4]");
  }

  @Test
  void testCase7() {
    test(3, "[1,1,3,1]");
  }

  @Test
  void testCase8() {
    test(3, "[1,1,1,1]");
  }

  @Test
  void testCase9() {
    test(2, "[0,1,1,1,1]");
  }
}
