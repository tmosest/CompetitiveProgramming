package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

class ConwayCubes {

  public long countDays(List<String> input, int cycle) {
    Queue<Cube> activeCubes = new LinkedList<>();
    for (int r = 0; r < input.size(); r++) {
      String row = input.get(r);
      for (int c = 0; c < row.length(); c++) {
        char letter = row.charAt(c);
        if (letter == '#') {
          activeCubes.add(new Cube(r, c, 0));
        }
      }
    }

    while (cycle > 0) {
      Queue<Cube> nextActiveCubes = new LinkedList<>();
      Map<String, Integer> activeNeighborCount = new HashMap<>();
      for (Cube active : activeCubes) {
        List<List<Integer>> neighbors = active.getNeighbors();
        for (List<Integer> cord : neighbors) {
          String str = String.format("(%s,%s,%s)", cord.get(0), cord.get(1), cord.get(2));
          int count = activeNeighborCount.getOrDefault(str, 0);
          activeNeighborCount.put(str, count + 1);
        }
      }
      Set<String> added = new HashSet<>();
      // All cubes with 3 active neighbors should be added.
      for (Entry<String, Integer> cordCount : activeNeighborCount.entrySet()) {
        if (cordCount.getValue() == 3 && !added.contains(cordCount.getKey())) {
          nextActiveCubes.add(Cube.fromString(cordCount.getKey()));
          added.add(cordCount.getKey());
        }
      }
      for (Cube active : activeCubes) {
        int count = activeNeighborCount.getOrDefault(active.toString(), 0);
        if (count > 1 && count < 4 && !added.contains(active.toString())) {
          nextActiveCubes.add(active);
        }
      }
      --cycle;
    }

    return 0;
  }

  // Cube with 3 neighbors are active become active.
  // Cube that is active with 2 or 3 neighbors remains active.
  // Else shuts off.
  private static class Cube {

    private boolean active = true;

    private List<Integer> coordinates = new ArrayList<>();

    private Cube(int xDim, int yDim, int zDim) {
      coordinates.add(xDim);
      coordinates.add(yDim);
      coordinates.add(zDim);
    }

    private static Cube fromString(String str) {
      int[] values = Arrays.stream(str
          .replace("(", "")
          .replace(")", "")
          .split(","))
          .mapToInt(Integer::parseInt).toArray();
      return new Cube(values[0], values[1], values[2]);
    }

    private List<Integer> getCordinates() {
      return new ArrayList<>(coordinates);
    }

    private boolean isActive() {
      return active;
    }

    private List<List<Integer>> getNeighbors() {
      List<List<Integer>> results = new ArrayList<>();

      List<Integer> copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(1, copy.get(1) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(1, copy.get(1) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(1, copy.get(1) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(1, copy.get(0) + 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(1, copy.get(1) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(1, copy.get(0) + 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(1, copy.get(1) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(1, copy.get(0) - 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(1, copy.get(1) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(1, copy.get(0) - 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(1, copy.get(1) + 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(1, copy.get(1) + 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(1, copy.get(1) - 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(1, copy.get(1) + 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(1, copy.get(1) - 1);
      copy.set(2, copy.get(2) + 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(1, copy.get(1) + 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) + 1);
      copy.set(1, copy.get(1) - 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      copy = getCordinates();
      copy.set(0, copy.get(0) - 1);
      copy.set(1, copy.get(1) - 1);
      copy.set(2, copy.get(2) - 1);
      results.add(copy);

      return results;
    }

    public String toString() {
      return String
          .format("(%s,%s,%s)", coordinates.get(0), coordinates.get(1), coordinates.get(2));
    }
  }
}
