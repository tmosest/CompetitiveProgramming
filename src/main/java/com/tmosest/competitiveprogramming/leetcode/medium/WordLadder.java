package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class WordLadder {
  /* Write code here. */

  /**
   * Determines the minimum length of the sequence from ending to starting word.
   *
   * @param beginWord The starting word.
   * @param endWord The ending word.
   * @param wordList The dictionary.
   * @return The length of the sequence or 0 if impossible.
   */
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    // exit early if the wordList doesn't contain the end word.
    if (!wordList.contains(endWord)) {
      return 0;
    }
    List<WordNode> nodes = new ArrayList<>();
    for (int i = 0; i < wordList.size() + 1; i++) {
      String word = (i == 0) ? beginWord : wordList.get(i - 1);
      WordNode wordNode = new WordNode(i, word);
      nodes.add(wordNode);
    }
    for (int i = 0; i < nodes.size(); i++) {
      WordNode node = nodes.get(i);
      for (int j = 0; j < nodes.size(); j++) {
        WordNode otherNode = nodes.get(j);
        if (i != j && couldTransformTo(node.word, otherNode.word)) {
          nodes.get(i).wordNodes.add(nodes.get(j));
        }
      }
    }
    boolean[] visited = new boolean[nodes.size()];
    int[] distances = new int[nodes.size()];
    for (int i = 1; i < distances.length; i++) {
      distances[i] = -1;
    }
    Queue<WordNode> queue = new LinkedList<>();
    queue.add(nodes.get(0));
    while (!queue.isEmpty()) {
      WordNode root = queue.poll();
      int distance = distances[root.id];
      if (!visited[root.id]) {
        for (WordNode wordNode : root.wordNodes) {
          if (!visited[wordNode.id]) {
            queue.add(wordNode);
            if (distances[wordNode.id] == -1) {
              distances[wordNode.id] = distance + 1;
            }
            if (wordNode.word.equals(endWord)) {
              return distance + 2;
            }
          }
        }
        visited[root.id] = true;
      }
    }
    return 0;
  }

  private boolean couldTransformTo(String beginWord, String endWord) {
    int differences = 0;
    for (int i = 0; i < beginWord.length(); i++) {
      if (beginWord.charAt(i) != endWord.charAt(i)) {
        differences++;
        if (differences > 1) {
          return false;
        }
      }
    }
    return true;
  }

  private static class WordNode {

    int id;
    String word;
    ArrayList<WordNode> wordNodes;

    public WordNode(int id, String word) {
      this.id = id;
      this.word = word;
      wordNodes = new ArrayList<>();
    }
  }


}
