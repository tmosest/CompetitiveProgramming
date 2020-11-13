package com.tmosest.competitiveprogramming.leetcode.easy;

class SlowestKey {

  char slowestKey(int[] releaseTimes, String keysPressed) {
    int maxDuration = releaseTimes[0];
    char currentKey = keysPressed.charAt(0);
    for (int i = 1; i < releaseTimes.length; i++) {
      int currDuration = releaseTimes[i] - releaseTimes[i - 1];
      if (currDuration > maxDuration
          || (currDuration == maxDuration && keysPressed.charAt(i) > currentKey)) {
        maxDuration = currDuration;
        currentKey = keysPressed.charAt(i);
      }
    }
    return currentKey;
  }
}
