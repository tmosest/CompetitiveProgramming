package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 734. Sentence Similarity")
class SentenceSimilarityTest {
	/* Write code here. */

  SentenceSimilarity sentenceSimilarity = new SentenceSimilarity();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words1 = {"great", "acting", "skills"};
    String[] words2 = {"fine", "drama", "talent"};
    String[][] pairs = {
        {"great", "fine"},
        {"acting", "drama"},
        {"skills", "talent"}
    };
    Assertions.assertTrue(sentenceSimilarity.areSentencesSimilar(words1, words2, pairs));
  }


}
