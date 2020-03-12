package com.tmosest.competitiveprogramming.leetcode.hard;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 51. N-Queens")
class NqueensTest {

  private Nqueens nqueens = new Nqueens();

  @Test
  void testCase0() {
    List<List<String>> expected = new ImmutableList.Builder<List<String>>()
        .add(
            new ImmutableList.Builder<String>()
              .add(".Q..")
              .add("...Q")
              .add("Q...")
              .add("..Q.")
              .build()
        )
        .add(
            new ImmutableList.Builder<String>()
                .add("..Q.")
                .add("Q...")
                .add("...Q")
                .add(".Q..")
                .build()
        )
        .build();

    Assertions.assertEquals(expected, nqueens.solveNQueens(4));
  }
}
