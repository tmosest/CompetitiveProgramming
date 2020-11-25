package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumProfitOfOperatingCentennialWheel {

  int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
    int count = 0;
    int max = 0;
    int profit = 0;
    int index = 0;
    int rotateCnt = 0;
    int res = -1;

    //continue while there is queue or there are new customers
    while (count > 0 || index < customers.length) {
      int currCnt;

      //add new customers if avail
      if (index < customers.length) {
        count += customers[index++];
      }

      //calculate current number of customer
      if (count >= 4) {
        currCnt = 4;
        count -= 4;
      } else {
        currCnt = count;
        count = 0;
      }

      //calculate current round profit
      profit += (currCnt * boardingCost - runningCost);
      rotateCnt++;

      //store to results if profit is more
      if (profit > max) {
        max = profit;
        res = rotateCnt;
      }
    }
    return res;
  }
}
