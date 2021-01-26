package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.List;

class RainRisk {

  long getManhattanDistance(List<String> lines) {
    Position position = new Position();
    for (String line : lines) {
      position = position.updateFromString(line);
    }
    return position.getManhattanDistance();
  }

  long getManhattanDistanceWithWayPoint(List<String> lines) {
    Position shipPosition = new Position();
    Position waypointPosition = new Position(1, 10, 0);
    Position relative = null;

    for (String line : lines) {
      String key = line.substring(0, 1);
      switch (key) {
        case "N":
        case "S":
        case "E":
        case "W":
          waypointPosition = waypointPosition.updateFromString(line);
          break;
        case "F":
          relative = waypointPosition.getRelativePosition(shipPosition);
          int val = Integer.valueOf(line.substring(1));
          shipPosition = new Position(
              shipPosition.north + val * relative.north,
              shipPosition.east + val * relative.east,
              shipPosition.degree
          );
          waypointPosition = new Position(
              shipPosition.north + relative.north,
              shipPosition.east + relative.east,
              0
          );
          break;
        case "R":
        case "L":
          int angle = Integer.valueOf(line.substring(1));
          if ("R".equals(key)) {
            angle *= -1;
          }
          relative = waypointPosition.getRelativePosition(shipPosition).rotateAboutOrigin(angle);
          waypointPosition = new Position(
            shipPosition.north + relative.north,
            shipPosition.east + relative.east,
            0
          );
          break;
        default:
          throw new IllegalArgumentException("Command not found " + key);
      }
    }

    return shipPosition.getManhattanDistance();
  }

  private static class Position {

    private int north;
    private int east;
    private int degree;

    Position() {
      this.east = 0;
      this.north = 0;
      this.degree = 0;
    }

    Position(int north, int east, int degree) {
      this.north = north;
      this.east = east;
      this.degree = degree;
      normalizeDegree();
    }

    Position rotateAboutOrigin(int angle) {
      double radians = Math.toRadians(angle);
      int rotatedEast = (int) Math.round(east * Math.cos(radians) - north * Math.sin(radians));
      int rotatedNorth = (int) Math.round(east * Math.sin(radians) + north * Math.cos(radians));
      return new Position(rotatedNorth, rotatedEast, degree);
    }

    private void normalizeDegree() {
      while (degree < 0) {
        degree += 360;
      }
      while (degree >= 360) {
        degree -= 360;
      }
    }

    long getManhattanDistance() {
      return (long) Math.abs(this.east) + (long) Math.abs(this.north);
    }

    Position getRelativePosition(Position other) {
      return new Position(this.north - other.north, this.east - other.east,
          this.degree - other.degree);
    }

    Position updateFromString(String command) {
      String key = command.substring(0, 1);
      int value = Integer.valueOf(command.substring(1));
      switch (key) {
        case "N":
          return new Position(north + value, east, degree);
        case "S":
          return new Position(north - value, east, degree);
        case "E":
          return new Position(north, east + value, degree);
        case "W":
          return new Position(north, east - value, degree);
        case "L":
          return new Position(north, east, degree - value);
        case "R":
          return new Position(north, east, degree + value);
        case "F":
          switch (degree) {
            case 0:
              return this.updateFromString("E" + value);
            case 90:
              return this.updateFromString("S" + value);
            case 180:
              return this.updateFromString("W" + value);
            case 270:
              return this.updateFromString("N" + value);
            default:
              throw new IllegalArgumentException("Degree is not bound " + degree);
          }
        default:
          throw new IllegalArgumentException("Command not found " + command);
      }
    }
  }
}
