package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.lists.MatrixListAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc186")
@DisplayName("LeetCode: 1424. Diagonal Traverse II")
class DiagonalTraverseTwoTest {

  private DiagonalTraverseTwo diagonalTraverseTwo = new DiagonalTraverseTwo();

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(
        new int[] {1,4,2,7,5,3,8,6,9},
        diagonalTraverseTwo.findDiagonalOrder(
            MatrixListAdapter.toList(new Integer[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            })
        )
    );
  }
}
