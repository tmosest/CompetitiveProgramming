package com.tmosest.competitiveprogramming.datastructures.implementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coordinate {

  private List<Integer> coordinates;

  public Coordinate(int dimensions) {
    coordinates = new ArrayList<>(dimensions);
    Collections.fill(coordinates, 0);
  }

  public Coordinate(Coordinate coordinate) {
    this.coordinates = new ArrayList<>(coordinate.getCoordinates());
  }

  public int getDimensions() {
    return coordinates.size();
  }

  public List<Integer> getCoordinates() {
    return new ArrayList<>(coordinates);
  }

  public void setCoordinates(List<Integer> coordinates) {
    this.coordinates = new ArrayList<>(coordinates);
  }

  /**
   * Get points that are adjacent but not diagonal.
   * @return List containing the adjacent points.
   */
  public List<Coordinate> getAdjacentCoordinates() {
    List<Coordinate> points = new ArrayList<>();
    for (int i = 0; i < getDimensions(); i++) {
      points.add(createOffsetCoordinate(i, 1));
      points.add(createOffsetCoordinate(i, -1));
    }
    return points;
  }

  Coordinate createOffsetCoordinate(int index, int diff) {
    Coordinate coordinate = new Coordinate(this);
    List<Integer> coordinates = coordinate.getCoordinates();
    coordinates.set(index, coordinates.get(index) + diff);
    coordinate.setCoordinates(coordinates);
    return coordinate;
  }

  Coordinate createFromRelativeCoordinate(Coordinate relative) {
    Coordinate coordinate = new Coordinate(this);
    List<Integer> coordinates = coordinate.getCoordinates();
    List<Integer> relativeCoordinates = relative.getCoordinates();

    for (int i = 0; i < getDimensions(); i++) {
      coordinates.set(i, coordinates.get(i) + relativeCoordinates.get(i));
    }

    return coordinate;
  }
}
