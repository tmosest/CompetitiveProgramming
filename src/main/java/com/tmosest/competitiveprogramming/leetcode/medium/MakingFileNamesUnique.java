package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class MakingFileNamesUnique {

  String[] getFolderNames(String[] names) {
    Map<String, Integer> filesNextIndex = new HashMap<>();

    int len = names.length;
    String[] result = new String[len];

    for (int i = 0; i < len; i++) {
      if (filesNextIndex.containsKey(names[i])) {
        int nextCount = filesNextIndex.get(names[i]);
        String nextName = names[i] + "(" + nextCount + ")";

        while (filesNextIndex.containsKey(nextName)) {
          nextName = names[i] + "(" + (++nextCount) + ")";
        }
        result[i] = nextName;
        filesNextIndex.put(result[i], filesNextIndex.getOrDefault(result[i], 0) + 1);
        filesNextIndex.put(names[i], nextCount + 1);
      } else {
        result[i] = names[i];
        filesNextIndex.put(names[i], 1);
      }
    }

    return result;
  }
}
