package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("dynamic")
@DisplayName("LeetCode: 337. House Robber III")
class HouseRobberThreeTest {

  private Codec codec = new Codec();
  private HouseRobberThree houseRobberThree = new HouseRobberThree();

  @Test
  void testCase0() {
    Assertions.assertEquals(7, houseRobberThree.rob(codec.deserialize("[3,2,3,null,3,null,1]")));
  }
}
