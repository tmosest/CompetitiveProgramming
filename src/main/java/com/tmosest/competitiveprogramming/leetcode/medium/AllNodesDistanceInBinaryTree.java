package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class AllNodesDistanceInBinaryTree {

  private Map<TreeNode, TreeNode> parent;

  List<Integer> distanceK(TreeNode root, TreeNode target, int away) {
    parent = new HashMap<>();
    dfs(root, null);

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(null);
    queue.add(target);

    Set<TreeNode> seen = new HashSet<>();
    seen.add(target);
    seen.add(null);

    int dist = 0;
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node == null) {
        if (dist == away) {
          List<Integer> ans = new ArrayList<>();
          for (TreeNode n : queue) {
            ans.add(n.val);
          }
          return ans;
        }
        queue.offer(null);
        dist++;
      } else {
        if (!seen.contains(node.left)) {
          seen.add(node.left);
          queue.offer(node.left);
        }
        if (!seen.contains(node.right)) {
          seen.add(node.right);
          queue.offer(node.right);
        }
        TreeNode par = parent.get(node);
        if (!seen.contains(par)) {
          seen.add(par);
          queue.offer(par);
        }
      }
    }

    return new ArrayList<Integer>();
  }

  private void dfs(TreeNode node, TreeNode par) {
    if (node != null) {
      parent.put(node, par);
      dfs(node.left, node);
      dfs(node.right, node);
    }
  }
}
