package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.HashMap;
import java.util.Map;

class TuningTrouble {

  private boolean isUnique(Map<Character, Integer> map) {
    for (int value : map.values()) {
      if (value > 1) {
        return false;
      }
    }
    return true;
  }

  public int getBufferMarker(String buffer, int markerCount) {
    char[] bufferArray = buffer.toCharArray();
    Map<Character, Integer> letterCount = new HashMap<>();

    int index = 0;
    // Load in the first four digits
    for (; index < markerCount; index++) {
      char letter = bufferArray[index];
      int count = letterCount.getOrDefault(letter, 0);
      letterCount.put(letter, count + 1);
    }

    if (isUnique(letterCount)) {
      return index;
    }

    for (; index < bufferArray.length; index++) {
      char toRemove = bufferArray[index - markerCount];
      int count = letterCount.getOrDefault(toRemove, 1);
      letterCount.put(toRemove, count - 1);

      char letter = bufferArray[index];
      count = letterCount.getOrDefault(letter, 0);
      letterCount.put(letter, count + 1);

      if (isUnique(letterCount)) {
        return index + 1;
      }
    }

    return -1;
  }
}
