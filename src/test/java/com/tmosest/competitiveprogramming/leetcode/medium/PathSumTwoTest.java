package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 113. Path Sum II")
class PathSumTwoTest {

  private Codec codec = new Codec();
  private PathSumTwo pathSumTwo = new PathSumTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = codec.deserialize("[5,4,8,11,null,13,4,7,2,null,null,5,1]");
    int expectedSum = 22;
    List<List<Integer>> actual = pathSumTwo.pathSum(root, expectedSum);
    Assertions.assertEquals(2, actual.size());
    for (List<Integer> list : actual) {
      int sum = 0;
      for (Integer i : list) {
        sum += i;
      }
      Assertions.assertEquals(expectedSum, sum);
    }
  }
}
