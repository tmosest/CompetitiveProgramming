package com.tmosest.competitiveprogramming.datastructures.implementations;

/**
 * Represents a point in space.
 */
public class Point<T> {

  private T data;
  private Coordinate coordinates;

  public Point(T data, int dimensions) {
    this.data = data;
    coordinates = new Coordinate(dimensions);
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Coordinate getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(
      Coordinate coordinates) {
    this.coordinates = coordinates;
  }
}
