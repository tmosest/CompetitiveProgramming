package com.tmosest.competitiveprogramming.leetcode.medium;

class GasStation {
  /* Write code here. */

  /**
   * Can you complete a circuit.
   *
   * @param gas The gas values.
   * @param cost The cost of the gas at each index.
   * @return Starting index to complete a trip around the array or -1.
   */
  int canCompleteCircuit(int[] gas, int[] cost) {
    int length = gas.length;
    int totalTank = 0;
    int currTask = 0;
    int startingStation = 0;
    for (int i = 0; i < length; ++i) {
      totalTank += gas[i] - cost[i];
      currTask += gas[i] - cost[i];
      // If one couldn't get here,
      if (currTask < 0) {
        // Pick up the next station as the starting one.
        startingStation = i + 1;
        // Start with an empty tank.
        currTask = 0;
      }
    }
    return totalTank >= 0 ? startingStation : -1;
  }


}
