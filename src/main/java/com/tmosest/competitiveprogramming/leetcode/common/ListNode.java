package com.tmosest.competitiveprogramming.leetcode.common;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode() {
    this.val = 0;
  }

  public ListNode(int val) {
    this.val = val;
  }

  /**
   * Not an inherient method of the leetcode data model.
   *
   * @param listData The list data. [1,2,3,4].
   * @return Head of the list node.
   */
  public static ListNode fromString(String listData) {
    if (listData == null || listData.length() == 0) {
      return null;
    }

    String[] data = listData.replace("[", "").replace("]", "").split(",");

    ListNode preHead = new ListNode(0);
    ListNode runner = preHead;

    for (String str : data) {
      runner.next = new ListNode(Integer.valueOf(str));
      runner = runner.next;
    }

    return preHead.next;
  }

  /**
   * Convert a ListNode to a string.
   * @return The list from here to end.
   */
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    ListNode head = this;
    while (head != null) {
      stringBuilder.append(head.val);
      stringBuilder.append(",");
      head = head.next;
    }
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}
