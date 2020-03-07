package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 388. Longest Absolute File Path")
class LongestAbsoluteFilePathTest {

  private LongestAbsoluteFilePath longestAbsoluteFilePath = new LongestAbsoluteFilePath();

  @Test
  void testCase0() {
    Assertions.assertEquals(32,
        longestAbsoluteFilePath
            .lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext")
    );
  }
}
