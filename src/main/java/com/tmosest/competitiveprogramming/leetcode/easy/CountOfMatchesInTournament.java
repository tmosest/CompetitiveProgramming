package com.tmosest.competitiveprogramming.leetcode.easy;

class CountOfMatchesInTournament {

  int numberOfMatches(int players) {
    int totalMatches = 0;

    while (players > 1) {
      int matches = players / 2;
      int advances = matches;

      if (players % 2 == 1) {
        matches = (players - 1) / 2;
        advances = matches + 1;
      }

      totalMatches += matches;
      players = advances;
    }

    return totalMatches;
  }
}
