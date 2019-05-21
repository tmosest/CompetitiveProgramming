package com.tmosest.competitiveprogramming.leetcode.easy;

class WalkingRobotSimulation {
  /* Write code here. */

  /**
   * Determine the final resting place or a robot. Starts [0,0] facing north.
   *
   * @param commands Array of integers. -1 and -2 are turn left and right.
   * @param obstacles Grid of obstacle locations.
   * @return Square of the final distance traveled.
   */
  public int robotSim(int[] commands, int[][] obstacles) {
    int[] position = new int[2];
    int direction = 0;
    int maxDistance = 0;

    for (int command : commands) {
      switch (command) {
        case -1:
          direction++;
          direction %= 4;
          break;
        case -2:
          direction--;
          if (direction < 0) {
            direction = 3;
          }
          break;
        default:
          while (command > 0) {
            switch (direction) {
              case 0:
                position[1]++;
                break;
              case 1:
                position[0]++;
                break;
              case 2:
                position[1]--;
                break;
              default:
                position[0]--;
            }
            boolean collides = false;
            for (int[] obstacle : obstacles) {
              if (obstacle[0] == position[0] && obstacle[1] == position[1]) {
                collides = true;
                break;
              }
            }
            if (collides) {
              switch (direction) {
                case 0:
                  position[1]--;
                  break;
                case 1:
                  position[0]--;
                  break;
                case 2:
                  position[1]++;
                  break;
                default:
                  position[0]++;
              }
              command = 0;
            } else {
              --command;
            }
            maxDistance = Math.max(
                maxDistance,
                position[0] * position[0] + position[1] * position[1]
            );
          }
      }
    }

    return maxDistance;
  }


}
