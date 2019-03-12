package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 893. Groups of Special-Equivalent Strings")
public class GroupsOfSpecialEquivalentStringsTest {

  GroupsOfSpecialEquivalentStrings groupsOfSpecialEquivalentStrings = new GroupsOfSpecialEquivalentStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "a","b","c","a","c","c"
    };
    Assertions.assertEquals(3, groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(input));
  }
}
