package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class BrowserHistory {

  private List<String> history;
  private int index;

  BrowserHistory(String homepage) {
    history = new ArrayList<>();
    history.add(homepage);
    index = 0;
  }

  void visit(String url) {
    if (index == history.size() - 1) {
      history.add(url);
      index = history.size() - 1;
      return;
    }

    List<String> newHistory = new ArrayList<>();
    for (int i = 0; i <= index; i++) {
      newHistory.add(history.get(i));
    }
    history = newHistory;
    history.add(url);
    index = history.size() - 1;
  }

  String back(int steps) {
    if (index - steps < 0) {
      index = 0;
    } else {
      index -= steps;
    }
    return history.get(index);
  }

  String forward(int steps) {
    if (index + steps >= history.size() - 1) {
      index = history.size() - 1;
    } else {
      index += steps;
    }
    return history.get(index);
  }
}
