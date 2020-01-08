package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

class ConvertBinaryNumberInLinkedListToInteger {

  int getDecimalValue(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    int result = 0;
    for (int i = 0; i < list.size(); i++) {
      int val = list.get(list.size() - i - 1);
      result += Math.pow(2, i) * val;
    }
    return result;
  }
}
