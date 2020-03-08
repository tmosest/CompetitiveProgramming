package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("wc179")
@DisplayName("LeetCode: 5355. Frog Position After T Seconds")
class FrogPositionAfterSecondsTest {

  private FrogPositionAfterSeconds frogPositionAfterSeconds = new FrogPositionAfterSeconds();

  @Test
  void testCase0() {
    int[][] edges = {{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}};
    double actual = frogPositionAfterSeconds.frogPosition(7, edges, 2, 4);
    Assertions.assertTrue(0.15 < actual);
    Assertions.assertTrue(0.17 > actual);
  }

  @Test
  void testCase1() {
    int[][] edges = {{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}};
    double actual = frogPositionAfterSeconds.frogPosition(7, edges, 1, 7);
    Assertions.assertTrue(0.32 < actual);
    Assertions.assertTrue(0.34 > actual);
  }

  @Test
  void testCase2() {
    int[][] edges = {{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}};
    double actual = frogPositionAfterSeconds.frogPosition(7, edges, 20, 6);
    Assertions.assertTrue(0.15 < actual);
    Assertions.assertTrue(0.17 > actual);
  }

  @Test
  void testCase3() {
    int[][] edges = {{2,1},{3,2},{4,1},{5,1},{6,4},{7,1},{8,7}};
    double actual = frogPositionAfterSeconds.frogPosition(8, edges, 7, 7);
    Assertions.assertTrue(-0.1 < actual);
    Assertions.assertTrue(0.1 > actual);
  }

  @Test
  void testCase4() {
    int[][] edges = {{2,1},{3,2}};
    double actual = frogPositionAfterSeconds.frogPosition(3, edges, 1, 2);
    Assertions.assertTrue(0.9 < actual);
    Assertions.assertTrue(1.1 > actual);
  }

  @Test
  void testCase5() {
    int[][] edges = {{2,1},{3,2}};
    double actual = frogPositionAfterSeconds.frogPosition(3, edges, 1, 2);
    Assertions.assertTrue(0.9 < actual);
    Assertions.assertTrue(1.1 > actual);
  }

  @Test
  void testCase6() {
    int[][] edges = {{2,1},{3,2},{4,3},{5,3},{6,5},{7,3},{8,4},{9,5}};
    double actual = frogPositionAfterSeconds.frogPosition(9, edges, 9, 1);
    Assertions.assertTrue(-0.1 < actual);
    Assertions.assertTrue(0.1 > actual);
  }

  @Test
  void testCase7() {
    int[][] edges = 
      {{2,1},{3,1},{4,2},{5,2},{6,4},{7,4},{8,4},{9,3},{10,4},{11,4},{12,5},{13,8},{14,9},{15,10},{16,7},{17,7},{18,15},{19,9},{20,11},{21,16},{22,19}};
    double actual = frogPositionAfterSeconds.frogPosition(22, edges, 4, 7);
    System.out.printf("result: " + actual);
    Assertions.assertTrue(-0.005 < actual);
    Assertions.assertTrue(0.005 > actual);
  }
}
