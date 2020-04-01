package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class LinkedListInBinaryTree {

  boolean isSubPath(ListNode head, TreeNode root) {
    StringBuilder listValues = new StringBuilder();
    while (head != null) {
      listValues.append(head.val);
      listValues.append(",");
      head = head.next;
    }

    return doDfs(root, listValues.toString(), "");
  }

  private boolean doDfs(TreeNode root, String listValues, String current) {
    if (root == null) {
      return (current + ",").contains(listValues);
    }

    return doDfs(root.left, listValues, current + "," + root.val) || doDfs(root.right, listValues,
        current + "," + root.val);
  }
}
