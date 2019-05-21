package com.tmosest.competitiveprogramming.leetcode.medium;

class PopulatingNextRightPointersInEachNode {
  /* Write code here. */

  /**
   * Point nodes to their next one in the link.
   *
   * @param root The root of tree.
   * @return The root of the tree.
   */
  public Node connect(Node root) {
    helper(root);
    return root;
  }

  private void helper(Node root) {
    if (root != null) {
      Node leftTemp = root.left;
      Node rightTemp = root.right;
      while (leftTemp != null && rightTemp != null) {
        leftTemp.next = rightTemp;
        leftTemp = leftTemp.right;
        rightTemp = rightTemp.left;
      }
      helper(root.left);
      helper(root.right);
    }
  }

  public static class Node {

    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    /**
     * Create a new node.
     *
     * @param val The value of the node.
     * @param left The left link.
     * @param right The right link.
     * @param next The "next" link.
     */
    public Node(int val, Node left, Node right, Node next) {
      this.val = val;
      this.left = left;
      this.right = right;
      this.next = next;
    }
  }


}
