package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.string.UtilSerializable;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNodeCodec;

public class Codec {

  private UtilTreeNodeCodec<Integer> codec = new UtilTreeNodeCodec<>();

  /**
   * Serializes the binary tree.
   *
   * @param root The root node.
   * @return The string representation of it.
   */
  public String serialize(TreeNode root) {
    return adaptToIntValues(codec.serialize(TreeNodeAdapter.convertToUtility(root)));
  }

  /**
   * Deserialize the string back into an object.
   *
   * @param data The string.
   * @return The root of the tree that the string represents.
   */
  public TreeNode deserialize(String data) {
    return TreeNodeAdapter.convertToTreeNode(codec.deserialize(adaptToSerializable(data)));
  }

  private String adaptToIntValues(String data) {
    String[] serialized = data
        .replace("[", "")
        .replace("]", "")
        .split(",");
    StringBuilder result = new StringBuilder();
    result.append("[");
    for (String str : serialized) {
      try {
        Integer value = (Integer) UtilSerializable.convertFrom(str).get();
        result.append(value);
      } catch (Exception exception) {
        result.append("null");
      }
      result.append(",");
    }
    result.deleteCharAt(result.length() - 1);
    result.append("]");
    return result.toString();
  }

  private String adaptToSerializable(String data) {
    String[] serialized = data
        .replace("[", "")
        .replace("]", "")
        .split(",");
    StringBuilder result = new StringBuilder();
    result.append("[");
    for (String str : serialized) {
      try {
        Integer val = Integer.valueOf(str);
        String value = UtilSerializable.convertToString(val).get();
        result.append(value);
      } catch (Exception exception) {
        result.append("null");
      }
      result.append(",");
    }
    result.deleteCharAt(result.length() - 1);
    result.append("]");
    return result.toString();
  }
}
