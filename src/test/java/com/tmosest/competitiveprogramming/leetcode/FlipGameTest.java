package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 293. Flip Game")
public class FlipGameTest {

  FlipGame flipGame = new FlipGame();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    List<String> expected = new ArrayList<>();
    expected.add("--++");
    expected.add("+--+");
    expected.add("++--");

    List<String> actual = flipGame.generatePossibleNextMoves("++++");

    Assertions.assertEquals(expected.size(), actual.size());

    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }
}
