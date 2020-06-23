package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DestinationCity {

  String destCity(List<List<String>> paths) {
    // Create graph
    Map<String, String> pathLookup = new HashMap<>();
    // Add edges
    for (List<String> path : paths) {
      pathLookup.put(path.get(0), path.get(1));
    }
    // Do a dfs using the first node in paths
    String fromDestination = paths.get(0).get(0);
    while (pathLookup.containsKey(fromDestination)) {
      fromDestination = pathLookup.get(fromDestination);
    }
    return fromDestination;
  }
}
