package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class NumberOfMatchingSubsequences {

  private int binarySearch(List<Integer> list, int target) {
    int low = 0;
    int high = list.size() - 1;
    int idx = -1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (list.get(mid) <= target) {
        low = mid + 1;
      } else {
        idx = mid;
        high = mid - 1;
      }
    }

    return idx == -1 ? -1 : list.get(idx);
  }

  public int numMatchingSubseq(String str, String[] words) {
    int ret = 0;
    List<Integer>[] buckets = new ArrayList[26];
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (buckets[ch - 'a'] == null) {
        buckets[ch - 'a'] = new ArrayList<>();
      }
      buckets[ch - 'a'].add(i);
    }

    for (String word : words) {
      int prev = -1;
      int pnt;
      for (pnt = 0; pnt < word.length(); pnt++) {
        char ch = word.charAt(pnt);
        if (buckets[ch - 'a'] == null) {
          break;
        }
        // Find the element that is just greater than this element
        int curr = binarySearch(buckets[ch - 'a'], prev);
        if (curr == -1) {
          break;
        }
        prev = curr;
      }
      if (pnt == word.length()) {
        ret++;
      }
    }

    return ret;
  }
}
