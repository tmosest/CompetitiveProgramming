package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("interval")
@Tag("medium")
@DisplayName("LeetCode: 253. Meeting Rooms II\n")
public class MeetingRoomsTwoTest {

  MeetingRoomsTwo meetingRoomsTwo = new MeetingRoomsTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Interval[] intervals = {
        new Interval(0, 30),
        new Interval(5, 10),
        new Interval(15, 20)
    };
    Assertions.assertEquals(2, meetingRoomsTwo.minMeetingRooms(intervals));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Interval[] intervals = {
        new Interval(7, 10),
        new Interval(2, 4)
    };
    Assertions.assertEquals(1, meetingRoomsTwo.minMeetingRooms(intervals));
  }
}
