package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.lists.MatrixListAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc170")
@DisplayName("LeetCode: 1311. Get Watched Videos by Your Friends")
class GetWatchedVideosByYourFriendsTest {

  private GetWatchedVideosByYourFriends getWatchedVideosByYourFriends = new GetWatchedVideosByYourFriends();

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(
        new String[] {"B","C"},
        getWatchedVideosByYourFriends.watchedVideosByFriends(
            MatrixListAdapter.toList(new String[][] {{"A","B"},{"C"},{"B","C"},{"D"}}),
            new int[][] {{1,2},{0,3},{0,3},{1,2}}, 0, 1
        ).toArray(new String[0])
    );
  }
}
