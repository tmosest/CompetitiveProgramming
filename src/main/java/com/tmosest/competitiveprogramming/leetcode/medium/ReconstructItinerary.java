package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class ReconstructItinerary {

  /**
   * Determine where the person is traveling. If there are more than one option, return the smallest
   * (lexicon).
   *
   * @param tickets The tickets.
   * @return The trip.
   */
  List<String> findItinerary(List<List<String>> tickets) {
    Map<String, PriorityQueue<String>> map = new HashMap<>();
    LinkedList<String> res = new LinkedList<>();

    for (List<String> ticket : tickets) {
      if (!map.containsKey(ticket.get(0))) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        map.put(ticket.get(0), pq);
      }
      map.get(ticket.get(0)).offer(ticket.get(1));
    }

    dfs("JFK", res, map);

    return res;
  }

  private void dfs(String str, LinkedList<String> res, Map<String, PriorityQueue<String>> map) {
    PriorityQueue<String> pq = map.get(str);

    while (pq != null && !pq.isEmpty()) {
      dfs(pq.poll(), res, map);
    }

    res.addFirst(str);
  }
}
