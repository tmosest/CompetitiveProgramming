package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("design")
@Tag("wc175")
@DisplayName("LeetCode: 1348. Tweet Counts Per Frequency")
class TweetCountsPerFrequencyTest {

  @Test
  void testCase0() {
    TweetCounts tweetCounts = new TweetCounts();
    tweetCounts.recordTweet("tweet3", 0);
    tweetCounts.recordTweet("tweet3", 60);
    tweetCounts.recordTweet("tweet3", 10);
    Assertions.assertEquals(Arrays.asList(new Integer[] {2}), tweetCounts.getTweetCountsPerFrequency("minute","tweet3", 0, 59));
  }
}
