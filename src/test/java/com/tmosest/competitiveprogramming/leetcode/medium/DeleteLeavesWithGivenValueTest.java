package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 1325. Delete Leaves With a Given Value")
class DeleteLeavesWithGivenValueTest {

  private Codec codec = new Codec();
  private DeleteLeavesWithGivenValue deleteLeavesWithGivenValue =
      new DeleteLeavesWithGivenValue();

  private void test(String input) {
    String[] lines = input.split("\n");
    Assertions.assertEquals(lines[2], codec.serialize(deleteLeavesWithGivenValue.removeLeafNodes(
        codec.deserialize(lines[0]),
        Integer.valueOf(lines[1])
    )));
  }

  @Test
  void testCase0() {
    test("[1,2,3,2,null,2,4]\n2\n[1,null,3,null,null,null,4]");
  }

  @Test
  void testCase1() {
    test("[1,3,3,3,2]\n3\n[1,3,null,null,2,null,null]");
  }

  @Test
  void testCase2() {
    test("[1,2,null,2,null,2]\n2\n[1]");
  }

  @Test
  void testCase3() {
    test("[1,1,1]\n1\n[null]");
  }

  @Test
  void testCase4() {
    test("[1,2,3]\n1\n[1,2,3]");
  }
}
