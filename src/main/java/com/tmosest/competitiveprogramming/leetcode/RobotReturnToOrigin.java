package com.tmosest.competitiveprogramming.leetcode;

public class RobotReturnToOrigin {

  /**
   * Determine if the robot moves in a circle.
   * @param moves A string of moves.
   * @return True if he would return to the origin.
   */
  public boolean judgeCircle(String moves) {
    int left = 0;
    int right = 0;
    int up = 0;
    int down = 0;
    for (char move : moves.toCharArray()) {
      switch (move) {
        case 'U':
          ++up;
          break;
        case 'D':
          ++down;
          break;
        case 'R':
          ++right;
          break;
        default:
          ++left;
      }
    }
    return (left == right) && (up == down);
  }
}
