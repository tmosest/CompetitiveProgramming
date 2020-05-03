package com.tmosest.competitiveprogramming.leetcode.easy;

class JewelsAndStones {

  int numJewelsInStones(String jewels, String stones) {
    return (int) stones.chars()
        .mapToObj(letter -> (char) letter)
        .filter(letter -> jewels.contains("" + letter))
        .count();
  }
}
