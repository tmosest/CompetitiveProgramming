package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 243. Shortest Word Distance")
public class ShortestWordDistanceTest {

  ShortestWordDistance shortestWordDistance = new ShortestWordDistance();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {"practice", "makes", "perfect", "coding", "makes"};
    String word1 = "coding";
    String word2 = "practice";
    Assertions.assertEquals(3, shortestWordDistance.shortestDistance(words, word1, word2));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] words = {"practice", "makes", "perfect", "coding", "makes"};
    String word1 = "coding";
    String word2 = "makes";
    Assertions.assertEquals(1, shortestWordDistance.shortestDistance(words, word1, word2));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] words = {"a","c","b","b","a"};
    String word1 = "b";
    String word2 = "a";
    Assertions.assertEquals(1, shortestWordDistance.shortestDistance(words, word1, word2));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    String[] words = {"a","a","b","b"};
    String word1 = "a";
    String word2 = "b";
    Assertions.assertEquals(1, shortestWordDistance.shortestDistance(words, word1, word2));
  }
}
