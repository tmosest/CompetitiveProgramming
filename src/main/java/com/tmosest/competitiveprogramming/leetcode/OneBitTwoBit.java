package com.tmosest.competitiveprogramming.leetcode;

public class OneBitTwoBit {

  /**
   * Determines if a one bit or two bit character.
   * @param bits Array of bits.
   * @return True of one bit character.
   */
  public boolean isOneBitCharacter(int[] bits) {
    int index = 0;
    while (index < bits.length - 1) {
      index += bits[index] + 1;
    }
    return index == bits.length - 1;
  }
}
