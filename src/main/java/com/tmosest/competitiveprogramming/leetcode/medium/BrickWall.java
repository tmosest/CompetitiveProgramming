package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BrickWall {

  int leastBricks(List<List<Integer>> wall) {
    int len = wall.size();
    if (len == 0) {
      return 0;
    }
    if (len == 1) {
      if (wall.get(0).size() == 1) {
        return 1;
      }
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    int curr = 0;
    int num;
    int cnt = 0;

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < wall.get(i).size(); j++) {
        if (j == 0) {
          curr = wall.get(i).get(j);
        } else {
          curr = curr + wall.get(i).get(j);
        }
        num = map.getOrDefault(curr, 0) + 1;
        map.put(curr, num);
        if (j != wall.get(i).size() - 1) {
          cnt = Math.max(cnt, num);
        }
      }
    }

    return len - cnt;
  }
}
