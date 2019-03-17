package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;

public class CopyListWithRandomPointer {

  public static class Node {
    public int val;
    public Node next;
    public Node random;

    /**
     * Create an empty random node.
     */
    public Node() {}

    /**
     * Create a random node.
     * @param val The value for the node.
     * @param next The next node.
     * @param random The random node.
     */
    public Node(int val, Node next, Node random) {
      this.val = val;
      this.next = next;
      this.random = random;
    }
  }

  /**
   * Make a deep copy of a list that has random links as well.
   * @param head The head of the list to copy.
   * @return The head of the new deep copy of the list.
   */
  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    HashMap<Node, Node> map = new HashMap<>();
    Node runner = head;
    while (runner != null) {
      Node copy = new Node();
      copy.val = runner.val;
      map.put(runner, copy);
      runner = runner.next;
    }
    runner = head;
    Node copyRunner = map.get(head);
    while (runner != null && copyRunner != null) {
      copyRunner.next = map.get(runner.next);
      copyRunner.random = map.get(runner.random);
      runner = runner.next;
      copyRunner = copyRunner.next;
    }
    return map.get(head);
  }
}
