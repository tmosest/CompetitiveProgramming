package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("interval")
@Tag("greedy")
@DisplayName("LeetCode: 1024. Video Stitching")
public class VideoStitchingTest {

  VideoStitching videoStitching = new VideoStitching();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0,2},{4,6},{8,10},{1,9},{1,5},{5,9}
    };
    Assertions.assertEquals(3, videoStitching.videoStitching(input, 10));
  }
}
