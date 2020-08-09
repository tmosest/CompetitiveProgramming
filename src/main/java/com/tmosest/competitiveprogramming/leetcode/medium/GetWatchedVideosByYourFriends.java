package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GetWatchedVideosByYourFriends {

  List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends,
      int id, int level) {

    int len = friends.length;
    int[][] dist = new int[len][len];
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        if (i == j) {
          dist[i][j] = 0;
        } else {
          dist[i][j] = 999999;
        }
      }
    }

    for (int i = 0; i < len; i++) {
      for (int j : friends[i]) {
        dist[i][j] = 1;
      }
    }

    for (int k = 0; k < len; k++) {
      for (int i = 0; i < len; i++) {
        for (int j = 0; j < len; j++) {
          if (dist[i][k] + dist[k][j] < dist[i][j]) {
            dist[i][j] = dist[i][k] + dist[k][j];
          }
        }
      }
    }

    List<String> list = new ArrayList<>();
    Map<String, Integer> freq = new HashMap<>();
    for (int i = 0; i < dist[id].length; i++) {
      int val = dist[id][i] == level ? i : 65656;
      if (val != 65656) {
        for (String s : watchedVideos.get(val)) {
          freq.put(s, 1 + freq.getOrDefault(s, 0));
          if (!list.contains(s)) {
            list.add(s);
          }
        }
      }
    }

    list.sort((one, two) -> {
      int fa = freq.get(one);
      int fb = freq.get(two);
      if (fa != fb) {
        return fa - fb;
      } else {
        return one.compareTo(two);
      }
    });

    return list;
  }
}
