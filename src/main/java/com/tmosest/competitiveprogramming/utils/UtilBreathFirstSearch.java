package com.tmosest.competitiveprogramming.utils;

import java.util.Iterator;

public class UtilBreathFirstSearch<T> implements Iterable<UtilGraphNode<T>> {

  UtilGraph<T> utilGraph;
  UtilGraphNode<T> start;

  /**
   * Create an Breath First Search iterable.
   * @param utilGraph The utilGraph.
   * @param start The starting point of the utilGraph.
   */
  public UtilBreathFirstSearch(UtilGraph<T> utilGraph, UtilGraphNode<T> start) {
    this.utilGraph = utilGraph;
    this.start = start;
  }

  @Override
  public Iterator<UtilGraphNode<T>> iterator() {
    return new UtilBreathFirstSearchIterator(utilGraph, start);
  }
}
