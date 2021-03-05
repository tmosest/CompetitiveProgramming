package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.utils.string.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class JurassicJigsaw {

  long matchPuzzleAndMultiplyCorners(List<String> input) {
    List<Tile> tiles = fromInput(input);

    for (int i = 0; i < tiles.size(); i++) {
      for (int j = 0; j < tiles.size(); j++) {

        if (i == j) {
          continue;
        }

        tiles.get(i).findConnections(tiles.get(j));
      }
    }

    List<Tile> corners = tiles.stream()
        .filter(Tile::isCorner).collect(Collectors.toList());

    return corners.stream()
        .filter(Tile::isCorner)
        .map(Tile::getId)
        .reduce((one, two) -> one * two)
        .orElse(-1L);
  }

  private List<Tile> fromInput(List<String> input) {
    List<Tile> tiles = new ArrayList<>();
    List<String> titleInput = new ArrayList<>();

    for (String str : input) {
      if (str.trim().isEmpty() && !titleInput.isEmpty()) {
        tiles.add(Tile.fromStringList(titleInput));
        titleInput = new ArrayList<>();
        continue;
      }

      titleInput.add(str);
    }

    return tiles;
  }

  private static class Tile {
    private static final int EDGES = 4;

    private enum Direction {
      TOP(0), RIGHT(1), BOTTOM(2), LEFT(3);

      int index;

      Direction(int index) {
        this.index = index;
      }
    }

    // index order top, right, bottom, left
    private int id;
    private List<String> edges;
    private List<String> reversedEdges;
    private List<String> map;
    private List<List<Tile>> edgeConnections;


    private Tile(int id, List<String> map) {
      this.id = id;
      this.map = new ArrayList<>(map);
      setEdge();
    }

    private long getId() {
      return (long) id;
    }

    private void setEdge() {
      edges = new ArrayList<>();

      for (int i = 0; i < EDGES; i++) {
        edges.add("");
      }

      edges.set(Direction.TOP.index, map.get(0));
      edges.set(Direction.BOTTOM.index, map.get(map.size() - 1));
      edges.set(Direction.LEFT.index, getColumn(0));
      edges.set(Direction.RIGHT.index, getColumn(map.get(0).length() - 1));

      reversedEdges = new ArrayList<>();
      edgeConnections = new ArrayList<>();
      for (String edge : edges) {
        reversedEdges.add(StringUtil.reverse(edge));
        edgeConnections.add(new ArrayList<>());
      }
    }

    private String getColumn(int index) {
      StringBuilder stringBuilder = new StringBuilder();
      for (String row : map) {
        stringBuilder.append(row.charAt(index));
      }
      return stringBuilder.toString();
    }

    private void findConnections(Tile otherTile) {
      for (int i = 0; i < edges.size(); i++) {
        for (int j = 0; j < otherTile.edges.size(); j++) {
          if (edges.get(i).equals(otherTile.edges.get(j))
              || reversedEdges.get(i).equals(otherTile.edges.get(j))) {
            if (!edgeConnections.get(i).contains(otherTile)) {
              edgeConnections.get(i).add(otherTile);
            }
            if (!otherTile.edgeConnections.get(j).contains(this)) {
              otherTile.edgeConnections.get(j).add(this);
            }
          }
        }
      }
    }

    private boolean isCorner() {
      int knownEdgeCount = 0;

      for (List<Tile> tiles : edgeConnections) {
        if (tiles.size() == 1) {
          knownEdgeCount++;
        }
        // If we don't know a tile then we do not know if it is a corner.
        if (tiles.size() > 1) {
          return false;
        }
      }

      return knownEdgeCount == 2;
    }

    private static Tile fromStringList(List<String> strList) {
      int id = Integer.valueOf(strList.get(0).split(" ")[1].replace(":", "").trim());
      return new Tile(id, strList.subList(1, strList.size()));
    }
  }
}
