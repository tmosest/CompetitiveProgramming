package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class TopFrequentWords {
  /* Write code here. */

  /**
   * Determine the most used words.
   *
   * @param words An array of words.
   * @param size The number of most used.
   * @return A List of the most used words.
   */
  public List<String> topKFrequent(String[] words, int size) {
    Map<String, Integer> wordCounts = new HashMap<>();
    // Count all the words.
    for (String word : words) {
      Integer count = wordCounts.getOrDefault(word, 0);
      wordCounts.put(word, count + 1);
    }
    // Order them as needed.
    PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        Integer thisCount = wordCounts.getOrDefault(o1, 0);
        Integer thatCount = wordCounts.getOrDefault(o2, 0);
        if (thisCount == thatCount) {
          return o1.compareTo(o2);
        }
        return thatCount - thisCount;
      }
    });
    // Add the keys to the priority queue.
    for (String key : wordCounts.keySet()) {
      priorityQueue.add(key);
    }
    // Figure out the results.
    List<String> result = new ArrayList<>();
    while (size > 0) {
      result.add(priorityQueue.poll());
      size--;
    }
    return result;
  }


}
