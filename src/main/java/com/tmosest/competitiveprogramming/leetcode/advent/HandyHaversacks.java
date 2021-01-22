package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

class HandyHaversacks {

  static String RELATIONSHIP_INDICATOR = "contain";
  static String VALUE_DELIMETER = ",";
  static String NO_RELATIONS_INDICATOR = "no other bags";
  static String SEARCH = "shiny gold";
  static String[] ERASE_FROM_KEY_VALUES = {"bags", "bag", "."};

  private Map<String, List<Edge>> nodes;

  private String formatKeyValues(String val) {
    for (String toReplace : ERASE_FROM_KEY_VALUES) {
      val = val.replace(toReplace, "");
    }
    return val.trim();
  }

  private void constructNodeMap(List<String> fileLines) {
    nodes = fileLines.stream()
        .filter(line -> !line.contains(NO_RELATIONS_INDICATOR))
        .map(line -> line.split(RELATIONSHIP_INDICATOR))
        .map(keyValueArr -> {
          String key = formatKeyValues(keyValueArr[0]);
          String values = keyValueArr[1];
          List<Edge> edges = Arrays.stream(values.split(VALUE_DELIMETER))
              .map(str -> {
                long value = Long.valueOf(str.substring(1, 2));
                String destination = str.substring(2).trim();
                return new Edge(formatKeyValues(destination), value);
              })
              .collect(Collectors.toList());
          return new AbstractMap.SimpleEntry<>(key, edges);
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  }

  long howManyBagsEventuallyContainGoldBags(List<String> fileLines) {
    constructNodeMap(fileLines);

    long count = 0;

    for (String key : nodes.keySet()) {
      Queue<Edge> queue = new LinkedList<>();
      queue.addAll(nodes.get(key));

      while (!queue.isEmpty()) {
        Edge edge = queue.poll();

        if (edge.weight == 0) {
          continue;
        }

        if (SEARCH.equals(edge.destination)) {
          ++count;
          break;
        }

        queue.addAll(nodes.getOrDefault(edge.destination, new ArrayList<>()));
      }
    }

    return count;
  }

  long howManyBagsAreInAGoldBag(List<String> fileLines) {
    constructNodeMap(fileLines);
    return howManyBagsAreInAGoldBagHelper(new Edge(SEARCH, 1)) - 1;
  }

  long howManyBagsAreInAGoldBagHelper(Edge edge) {
    if (!nodes.containsKey(edge.destination)) {
      return edge.weight;
    }

    long innerBags = nodes.get(edge.destination).stream()
        .map(this::howManyBagsAreInAGoldBagHelper)
        .reduce(Long::sum).orElse(0L);

    return edge.weight + edge.weight * innerBags;
  }

  private static class Edge {

    private String destination;
    private long weight;

    private Edge(String destination, long weight) {
      this.destination = destination;
      this.weight = weight;
    }
  }
}
