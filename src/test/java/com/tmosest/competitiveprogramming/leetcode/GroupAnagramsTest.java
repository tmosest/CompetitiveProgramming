package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("string")
@Tag("medium")
@DisplayName("LeetCode: 49. Group Anagrams")
public class GroupAnagramsTest {

  GroupAnagrams groupAnagrams = new GroupAnagrams();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "eat", "tea", "tan", "ate", "nat", "bat"
    };
    String[][] expectedArray = {
        {"ate","eat","tea"},
        {"nat","tan"},
        {"bat"}
    };
    List<List<String>> expected = new ArrayList<>();
    for (String[] strArray : expectedArray) {
      expected.add(Arrays.asList(strArray));
    }
    List<List<String>> actual = groupAnagrams.groupAnagrams(input);
    Assertions.assertEquals(expected.size(), actual.size());
  }
}
