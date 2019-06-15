package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 361. Bomb Enemy")
class BombEnemyTest {

  private BombEnemy bombEnemy = new BombEnemy();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    char[][] grid = {{'0', 'E', '0', '0'}, {'E', '0', 'W', 'E'}, {'0', 'E', '0', '0'}};
    Assertions.assertEquals(3, bombEnemy.maxKilledEnemies(grid));
  }
}
