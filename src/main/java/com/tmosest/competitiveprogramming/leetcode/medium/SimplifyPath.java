package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.LinkedList;

class SimplifyPath {
  /* Write code here. */

  /**
   * Determine the canonical path from an absolute path.
   *
   * @param path The folder path.
   * @return The canonical folder path.
   */
  public String simplifyPath(String path) {
    if (path == null || path.trim().length() < 1) {
      return "/";
    }
    LinkedList<String> stack = new LinkedList<>();
    String[] folders = path.split("/");
    for (String folder : folders) {
      folder = folder.trim();
      if (folder.equals("..")) {
        if (!stack.isEmpty()) {
          stack.pollLast();
        }
      } else if (!folder.equals(".") && !folder.equals("") && !folder.equals("/")) {
        stack.add(folder);
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append("/");
    while (!stack.isEmpty()) {
      sb.append(stack.pollFirst());
      sb.append("/");
    }
    if (sb.length() > 1) {
      sb.deleteCharAt(sb.length() - 1);
    }
    return sb.toString();
  }


}
