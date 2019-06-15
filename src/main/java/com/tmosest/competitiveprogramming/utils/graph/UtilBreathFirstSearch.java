package com.tmosest.competitiveprogramming.utils.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UtilBreathFirstSearch<T>
    implements Iterable<UtilGraphNode<T>>, Iterator<UtilGraphNode<T>> {

  private Queue<UtilGraphNode<T>> queue = new LinkedList<>();
  private boolean[] visited;

  /**
   * Create an Breath First Search iterable.
   *
   * @param utilGraph The utilGraph.
   * @param start The starting point of the utilGraph.
   */
  public UtilBreathFirstSearch(UtilGraph<T> utilGraph, UtilGraphNode<T> start) {
    visited = new boolean[utilGraph.nodes.size()];
    if (start != null) {
      queue.add(start);
    }
  }

  @Override
  public Iterator<UtilGraphNode<T>> iterator() {
    return this;
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
    visited[result.id] = true;
    for (UtilGraphNode neighbor : result.neighbors) {
      if (!visited[neighbor.id]) {
        queue.add(neighbor);
      }
    }
    return result;
  }
}
