package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc388")
@DisplayName("LeetCode: 3075. Maximize Happiness of Selected Children")
class MaximizeHappinessOfSelectedChildrenTest {
     private MaximizeHappinessOfSelectedChildren maximizeHappinessOfSelectedChildren;

     @BeforeEach
     void setup() {
          maximizeHappinessOfSelectedChildren = new MaximizeHappinessOfSelectedChildren();
     }

     private void test(long output, int[] happiness, int k) {
          Assertions.assertEquals(output, maximizeHappinessOfSelectedChildren.maximumHappinessSum(happiness, k));
     }

     @Test
     void test0() {
          test(4, new int[] { 1, 2, 3 }, 2);
     }

     @Test
     void test1() {
          test(53, new int[] { 12, 1, 42 }, 3);
     }
}
