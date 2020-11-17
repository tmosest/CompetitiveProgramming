package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class DesignAnOrderedStream {

  private int ptr;
  private String[] res;

  DesignAnOrderedStream(int num) {
    ptr = 0;
    res = new String[num];
  }

  List<String> insert(int id, String value) {
    List<String> list = new ArrayList<>();

    res[id - 1] = value;
    while (ptr < res.length && res[ptr] != null) {
      list.add(res[ptr]);
      ptr++;
    }

    return list;
  }
}
