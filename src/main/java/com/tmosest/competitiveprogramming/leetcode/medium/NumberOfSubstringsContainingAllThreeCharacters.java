package com.tmosest.competitiveprogramming.leetcode.medium;

class NumberOfSubstringsContainingAllThreeCharacters {

  int numberOfSubstrings(String input) {
    int[] map = new int[3];
    int len = input.length();
    char[] str = input.toCharArray();

    int count = 0;
    int left = 0;
    int right = -1;

    while (right < len) {
      if (map[0] == 0 || map[1] == 0 || map[2] == 0) {
        if (right++ >= len - 1) {
          break;
        }
        map[str[right] - 'a']++;
        continue;
      }
      count += len - right;
      map[str[left++] - 'a']--;
    }

    return count;
  }
}
