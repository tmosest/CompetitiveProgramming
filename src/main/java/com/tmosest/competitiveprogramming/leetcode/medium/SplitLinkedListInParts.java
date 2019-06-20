package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class SplitLinkedListInParts {

  /**
   * Split a list into equal parts.
   *
   * @param root Root of the list.
   * @param size size of the parts
   * @return An array of lists that are split.
   */
  public ListNode[] splitListToParts(ListNode root, int size) {
    ListNode cur = root;
    int len = 0;
    while (cur != null) {
      cur = cur.next;
      len++;
    }

    int width = len / size;
    int rem = len % size;

    ListNode[] ans = new ListNode[size];
    cur = root;
    for (int i = 0; i < size; ++i) {
      ListNode head = new ListNode(0);
      ListNode write = head;
      for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
        write = write.next = new ListNode(cur.val);
        if (cur != null) {
          cur = cur.next;
        }
      }
      ans[i] = head.next;
    }
    return ans;
  }
}
