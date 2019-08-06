package com.tmosest.competitiveprogramming.leetcode.medium;

class PredictTheWinner {

  /**
   * Predict the winner of the game.
   *
   * @param nums The values.
   * @return The winner.
   */
  boolean predictTheWinner(int[] nums) {
    return winner(nums, 0, nums.length - 1, 1) >= 0;
  }

  private int winner(int[] nums, int str, int err, int turn) {
    if (str == err) {
      return turn * nums[str];
    }
    int alpha = turn * nums[str] + winner(nums, str + 1, err, -turn);
    int beta = turn * nums[err] + winner(nums, str, err - 1, -turn);
    return turn * Math.max(turn * alpha, turn * beta);
  }
}
