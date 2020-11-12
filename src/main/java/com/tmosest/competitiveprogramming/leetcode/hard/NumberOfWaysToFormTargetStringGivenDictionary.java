package com.tmosest.competitiveprogramming.leetcode.hard;

class NumberOfWaysToFormTargetStringGivenDictionary {

  private String[] words;
  private String target;
  private Integer[][] memo;
  private int rows;
  private int cols;
  private int[][] charAtIndexCnt;

  int numWays(String[] words, String target) {
    this.words = words;
    this.target = target;
    rows = words[0].length();
    cols = target.length();
    memo = new Integer[rows][cols];
    charAtIndexCnt = new int[128][rows];

    for (String word : words) {
      for (int i = 0; i < word.length(); i++) {
        charAtIndexCnt[word.charAt(i)][i] += 1;
      }
    }
    return dp(0, 0);
  }

  private int dp(int num, int index) {
    if (index == cols) {
      return 1;
    }
    if (num == rows) {
      return 0;
    }
    if (memo[num][index] != null) {
      return memo[num][index];
    }
    char letter = target.charAt(index);
    long ans = dp(num + 1, index);
    if (charAtIndexCnt[letter][num] > 0) {
      ans += (long) dp(num + 1, index + 1) * charAtIndexCnt[letter][num];
      ans %= 1_000_000_007;
    }
    return memo[num][index] = (int) ans;
  }
}
