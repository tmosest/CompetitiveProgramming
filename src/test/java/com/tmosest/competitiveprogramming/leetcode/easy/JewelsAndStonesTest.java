package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("april30Day")
@DisplayName("LeetCode: 771. Jewels and Stones")
class JewelsAndStonesTest {

  private JewelsAndStones jewelsAndStones = new JewelsAndStones();

  private void test(String testCase) {
    String[] inputs = testCase.split("\n");
    Assertions.assertEquals(Integer.parseInt(inputs[2]),
        jewelsAndStones.numJewelsInStones(inputs[0], inputs[1]));
  }

  @Test
  void testCase0() {
    test("aA\naAAbbbb\n3");
  }

  @Test
  void testCase1() {
    test("z\nZZ\n0");
  }
}
