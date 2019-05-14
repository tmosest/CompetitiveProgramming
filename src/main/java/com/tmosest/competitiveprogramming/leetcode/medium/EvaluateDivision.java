package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class EvaluateDivision {
  /* Write code here. */

  /**
   * Given a list of divisions and results determine results of queries. Using a weighted graph to
   * do this.
   *
   * @param equations The division of variables.
   * @param values The values of the above divisions.
   * @param queries The queries to calculate.
   * @return An array of results.
   */
  public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
    Map<String, List<Edge>> map = new HashMap<>();
    for (int i = 0; i < equations.length; i++) {
      String[] equation = equations[i];
      double value = values[i];
      List<Edge> edges = map.getOrDefault(equation[0], new ArrayList<>());
      edges.add(new Edge(equation[0], equation[1], value));
      map.put(equation[0], edges);
      edges = map.getOrDefault(equation[1], new ArrayList<>());
      edges.add(new Edge(equation[1], equation[0], 1 / value));
      map.put(equation[1], edges);
    }
    double[] results = new double[queries.length];
    for (int i = 0; i < queries.length; i++) {
      String[] query = queries[i];
      results[i] = bfs(map, query[0], query[1]);
    }
    return results;
  }

  private double bfs(Map<String, List<Edge>> map, String start, String end) {
    if (!map.containsKey(start) || !map.containsKey(end)) {
      return -1.0;
    }
    Map<String, Boolean> visited = new HashMap<>();
    Map<String, Double> distances = new HashMap<>();
    distances.put(start, 1.0);
    Queue<String> queue = new LinkedList<>();
    queue.add(start);
    while (!queue.isEmpty()) {
      String root = queue.poll();
      double distance = distances.getOrDefault(root, 1.0);
      if (!visited.containsKey(root)) {
        for (Edge edge : map.get(root)) {
          if (!distances.containsKey(edge.from)) {
            distances.put(edge.from, distance * edge.weight);
          }
          if (edge.from.equals(end)) {
            return distances.get(edge.from);
          }
          queue.add(edge.from);
        }
        visited.put(root, true);
      }
    }
    return -1.0;
  }

  private class Edge {

    String to;
    String from;
    double weight;

    private Edge(String to, String from, double weight) {
      this.to = to;
      this.from = from;
      this.weight = weight;
    }
  }


}
