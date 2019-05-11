package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.Interval;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsTwo {

  /**
   * Determine the minimum number of meeting rooms required.
   * @param intervals An array of intervals.
   * @return The minimum number of rooms needed.
   */
  public int minMeetingRooms(Interval[] intervals) {
    int rooms = 0;

    if (intervals == null || intervals.length < 1) {
      return rooms;
    }

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
      }
    });

    Arrays.sort(intervals, new Comparator<Interval>() {
      @Override
      public int compare(Interval o1, Interval o2) {
        return Integer.compare(o1.start, o2.start);
      }
    });

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
