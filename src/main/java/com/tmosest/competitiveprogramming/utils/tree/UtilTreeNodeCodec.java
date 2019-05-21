package com.tmosest.competitiveprogramming.utils.tree;

import com.tmosest.competitiveprogramming.utils.string.UtilSerializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UtilTreeNodeCodec<T extends Serializable> {

  /**
   * Function to Serialize a UtilTreeNode.
   * @param root The root of the tree.
   * @return A string representation.
   */
  public String serialize(UtilTreeNode<T> root) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");

    Queue<UtilTreeNode<T>> queue = new LinkedList<>();
    queue.add(root);
    int nonNullCount = (root != null) ? 1 : 0;
    while (!queue.isEmpty() && nonNullCount != 0) {
      for (int i = 0, size = queue.size(); i < size; i++) {
        root = queue.poll();
        if (root == null) {
          sb.append("null");
          queue.add(null);
          queue.add(null);
        } else {
          String serializedObject = UtilSerializable
              .convertToString(root.val)
              .orElse("");
          sb.append(serializedObject);
          nonNullCount--;
          if (root.left != null) {
            nonNullCount++;
          }
          if (root.right != null) {
            nonNullCount++;
          }
          queue.add(root.left);
          queue.add(root.right);
        }
        sb.append(",");
      }
    }
    sb.deleteCharAt(sb.length() - 1);
    sb.append("]");
    return sb.toString();
  }

  /**
   * Deserialize the string back into an object.
   *
   * @param data The string.
   * @return The root of the tree that the string represents.
   */
  public UtilTreeNode<T> deserialize(String data) {
    if (data.equals("null")) {
      return null;
    }
    data = data
        .replace("[", "")
        .replace("]", "");
    String[] array = data.split(",");
    ArrayList<UtilTreeNode<T>> nodes = new ArrayList<>();
    nodes.add(null);
    for (String val : array) {
      try {
        T value = (T) UtilSerializable.convertFrom(val).get();
        nodes.add(new UtilTreeNode<>(value));
      } catch (Exception exception) {
        nodes.add(null);
      }
    }
    int childIndex = 2;
    for (int i = 1, size = nodes.size(); i < size; i++) {
      UtilTreeNode<T> node = nodes.get(i);
      if (node == null) {
        continue;
      }
      if (childIndex < size) {
        node.left = nodes.get(childIndex);
        childIndex++;
      }
      if (childIndex < size) {
        node.right = nodes.get(childIndex);
        childIndex++;
      }
    }
    return nodes.get(1);
  }
}
