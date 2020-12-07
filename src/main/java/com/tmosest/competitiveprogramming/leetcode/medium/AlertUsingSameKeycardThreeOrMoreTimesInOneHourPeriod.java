package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AlertUsingSameKeycardThreeOrMoreTimesInOneHourPeriod {

  List<String> alertNames(String[] keyName, String[] keyTime) {
    List<String> res = new ArrayList<>();
    Map<String, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < keyName.length; i++) {
      String name = keyName[i];
      String[] strs = keyTime[i].split(":");
      int time = Integer.valueOf(strs[0]) * 60 + Integer.valueOf(strs[1]);
      if (!map.containsKey(name)) {
        map.put(name, new ArrayList<>());
      }
      map.get(name).add(time);
    }
    for (String name : map.keySet()) {
      List<Integer> list = map.get(name);
      if (list.size() < 3) {
        continue;
      }
      Collections.sort(list);
      for (int i = 2; i < list.size(); i++) {
        if (list.get(i) - list.get(i - 2) <= 60) {
          res.add(name);
          break;
        }
      }
    }
    Collections.sort(res);
    return res;
  }
}
