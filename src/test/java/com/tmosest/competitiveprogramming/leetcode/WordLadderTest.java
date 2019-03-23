package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("string")
@Tag("medium")
@DisplayName("LeetCode: 127. Word Ladder")
public class WordLadderTest {

  WordLadder wordLadder = new WordLadder();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] dictionary = {
        "hot","dot","dog","lot","log","cog"
    };
    Assertions.assertEquals(5, wordLadder.ladderLength("hit", "cog", Arrays.asList(dictionary)));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] dictionary = {
        "hot","dot","dog","lot","log"
    };
    Assertions.assertEquals(0, wordLadder.ladderLength("hit", "cog", Arrays.asList(dictionary)));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] dictionary = {
        "hot","dog","dot"
    };
    Assertions.assertEquals(3, wordLadder.ladderLength("hot", "dog", Arrays.asList(dictionary)));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    String[] dictionary = {
        "hot","dog","cog","pot","dot"
    };
    Assertions.assertEquals(3, wordLadder.ladderLength("hot", "dog", Arrays.asList(dictionary)));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    String[] dictionary = {
        "most","mist","miss","lost","fist","fish"
    };
    Assertions.assertEquals(4, wordLadder.ladderLength("lost", "miss", Arrays.asList(dictionary)));
  }

  @Test
  @DisplayName("Test Case 5")
  void testCase5() {
    String[] dictionary = {
        "lest","leet","lose","code","lode","robe","lost"
    };
    Assertions.assertEquals(6, wordLadder.ladderLength("leet", "code", Arrays.asList(dictionary)));
  }
}
