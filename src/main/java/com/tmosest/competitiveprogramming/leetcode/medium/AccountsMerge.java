package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AccountsMerge {

  List<List<String>> accountsMerge(List<List<String>> accounts) {
    Dsu dsu = new Dsu();
    Map<String, String> emailToName = new HashMap<>();
    Map<String, Integer> emailToId = new HashMap<>();
    int id = 0;
    for (List<String> account : accounts) {
      String name = "";
      for (String email : account) {
        if (name.equals("")) {
          name = email;
          continue;
        }
        emailToName.put(email, name);
        if (!emailToId.containsKey(email)) {
          emailToId.put(email, id++);
        }
        dsu.union(emailToId.get(account.get(1)), emailToId.get(email));
      }
    }

    Map<Integer, List<String>> ans = new HashMap<>();
    for (String email : emailToName.keySet()) {
      int index = dsu.find(emailToId.get(email));
      ans.computeIfAbsent(index, x -> new ArrayList<>()).add(email);
    }
    for (List<String> component : ans.values()) {
      Collections.sort(component);
      component.add(0, emailToName.get(component.get(0)));
    }
    return new ArrayList<>(ans.values());
  }

  private static class Dsu {

    int[] parent;

    private Dsu() {
      parent = new int[10001];
      for (int i = 0; i <= 10000; ++i) {
        parent[i] = i;
      }
    }

    public int find(int row) {
      if (parent[row] != row) {
        parent[row] = find(parent[row]);
      }
      return parent[row];
    }

    public void union(int row, int col) {
      parent[find(row)] = find(col);
    }
  }
}
