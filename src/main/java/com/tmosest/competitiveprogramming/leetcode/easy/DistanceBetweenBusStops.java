package com.tmosest.competitiveprogramming.leetcode.easy;

class DistanceBetweenBusStops {

  int distanceBetweenBusStops(int[] distance, int start, int destination) {
    int clock = 0;
    int counterClock = 0;
    for (int i = start; i != destination; i++) {
      if (i > distance.length - 1) {
        i = i % distance.length;
      }
      if (i == destination) {
        break;
      }
      clock += distance[i];
    }
    int indx = start - 1;
    for (; indx != destination; indx--) {
      if (indx < 0) {
        indx += distance.length;
      }
      if (indx == destination) {
        break;
      }
      counterClock += distance[indx];
    }
    counterClock += distance[indx];
    return Math.min(clock, counterClock);
  }
}
