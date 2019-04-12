package com.tmosest.competitiveprogramming.utils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UtilBreathFirstSearchIterator<T> implements Iterator<UtilGraphNode<T>> {

  Queue<UtilGraphNode<T>> queue = new LinkedList<>();
  boolean[] visited;

  /**
   * Create an iterable for breath first search over a graph.
   * @param utilGraph The graph.
   * @param start The starting point in the graph.
   */
  public UtilBreathFirstSearchIterator(UtilGraph<T> utilGraph, UtilGraphNode<T> start) {
    visited = new boolean[utilGraph.nodes.size()];
    if (start != null) {
      queue.add(start);
    }
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("not supported yet");
  }

  @Override
  public boolean hasNext() {
    return queue.size() != 0;
  }

  @Override
  public UtilGraphNode<T> next() {
    if (!hasNext() || queue.peek() == null) {
      return null;
    }
    UtilGraphNode<T> result = queue.poll();
    for (UtilGraphNode neighbor : result.neighbors) {
      if (!visited[neighbor.id]) {
        queue.add(neighbor);
      }
    }
    return result;
  }
}
