package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class ReorderLogFiles {
  /* Write code here. */

  /**
   * Reorders log files based on rules.
   *
   * @param logs An array of log file names.
   * @return An array that is ordered.
   */
  public String[] reorderLogFiles(String[] logs) {
    List<String> numList = new ArrayList<>();
    TreeMap<String, String> charMap = new TreeMap<>();
    for (String log : logs) {
      char last = log.charAt(log.length() - 1);
      if (last <= '9' && last >= '0') {
        numList.add(log);
      } else {
        int firstSpace = log.indexOf(" ");
        String head = log.substring(0, firstSpace);
        String tail = log.substring(firstSpace);
        charMap.put(tail, head);
      }
    }
    List<String> result = new ArrayList<>(logs.length);
    for (Map.Entry entry : charMap.entrySet()) {
      result.add((String) entry.getValue() + (String) entry.getKey());
    }
    result.addAll(numList);
    return result.toArray(new String[0]);
  }


}
