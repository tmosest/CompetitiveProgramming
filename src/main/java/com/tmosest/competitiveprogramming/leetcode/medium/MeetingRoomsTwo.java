package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.Interval;

import java.util.Arrays;
import java.util.PriorityQueue;

class MeetingRoomsTwo {

  /**
   * Determine the minimum number of meeting rooms required.
   *
   * @param intervals An array of intervals.
   * @return The minimum number of rooms needed.
   */
  int minMeetingRooms(Interval[] intervals) {
    int rooms = 0;

    if (intervals == null || intervals.length < 1) {
      return rooms;
    }

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    Arrays.sort(intervals);
    priorityQueue.add(intervals[0].end);

    for (int i = 1; i < intervals.length; i++) {

      if (intervals[i].start >= priorityQueue.peek()) {
        priorityQueue.poll();
      }

      priorityQueue.add(intervals[i].end);
    }

    return priorityQueue.size();
  }
}
