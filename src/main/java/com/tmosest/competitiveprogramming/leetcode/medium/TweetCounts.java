package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class TweetCounts {

  private Map<String, TreeSet<Integer>> map;

  TweetCounts() {
    map = new HashMap<>();
  }

  public void recordTweet(String tweetName, int time) {
    TreeSet<Integer> set = map.getOrDefault(tweetName, new TreeSet<>());
    set.add(time);
    map.put(tweetName, set);
  }

  public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime,
      int endTime) {
    TreeSet<Integer> set = map.getOrDefault(tweetName, new TreeSet<>());
    int delta = deltaG(freq);
    List<Integer> frequencies = new ArrayList<>();
    for (int start = startTime; start <= endTime; start += delta) {
      int end = Math.min(start + delta, endTime + 1);
      SortedSet<Integer> sub = set.subSet(start, end);
      frequencies.add(sub.size());
    }
    return frequencies;
  }

  private int deltaG(String freq) {
    if (freq.equals("minute")) {
      return 60;
    } else if (freq.equals("hour")) {
      return 3600;
    }
    return 86400;
  }
}
