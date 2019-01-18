package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

  /**
   * Count visits of various domains.
   * @param domains A list of "count domain".
   * @return List of "count domain".
   */
  public List<String> subdomainVisits(String[] domains) {
    List<String> result = new ArrayList<>();
    if (domains == null || domains.length < 1) {
      return result;
    }
    Map<String, Integer> map = new HashMap<>();
    for (String str : domains) {
      String[] countDomain = str.split(" ");
      Integer count = Integer.parseInt(countDomain[0]);
      String[] subDomains = countDomain[1].split("\\.");
      StringBuilder allDomain = new StringBuilder();
      for (int i = subDomains.length - 1; i >= 0; i--) {
        String domain = subDomains[i];
        allDomain.insert(0, domain);
        String newDomain = allDomain.toString();
        Integer oldCount = map.get(newDomain);
        oldCount = (oldCount == null) ? count : oldCount + count;
        map.put(newDomain, oldCount);
        allDomain.insert(0,'.');
      }
    }
    for (String key : map.keySet()) {
      Integer count = map.get(key);
      String domainCount = count + " " + key;
      result.add(domainCount);
    }
    return result;
  }
}
