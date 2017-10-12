package implementation;

import java.util.Scanner;

public class QueensAttackII {

  private static final boolean debugMode = false;

  private static int boardSize;

  private static int[] queenPosition = new int[2];
  
  private static int north;
  private static int south;
  private static int west;
  private static int east;

  private static int[] northEast = new int[2];
  private static int[] northWest = new int[2];
  private static int[] southEast = new int[2];
  private static int[] southWest = new int[2];

  public static void determineInitialBorders() {
    int queenX = queenPosition[0];
    int queenY = queenPosition[1];

    north = east = boardSize + 1; // Above the board
    south = west = 0; // Below the board;

    // Set default for top right
    northEast[0] = queenX;
    northEast[1] = queenY;
    // Look above and to the right
    if (queenX + 1 <= boardSize && queenY + 1 <= boardSize) {
      while (++queenX <= boardSize && ++queenY <= boardSize) {
        ++northEast[0];
        ++northEast[1];
      }
      ++northEast[0];
      ++northEast[1];
    }
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];

    // Set default for top left
    northWest[0] = queenX;
    northWest[1] = queenY;
    // Look above and to the left
    if (queenX - 1 >= 1 && queenY + 1 <= boardSize) {
      while (--queenX >= 1 && ++queenY <= boardSize) {
        --northWest[0];
        ++northWest[1];
      }
      --northWest[0];
      ++northWest[1];
    }
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];

    // Set default for bottom right
    southEast[0] = queenX;
    southEast[1] = queenY;
    // Look below and to the right
    if (queenX + 1 <= boardSize && queenY - 1 >= 1) {
      while (++queenX <= boardSize && --queenY >= 1) {
        ++southEast[0];
        --southEast[1];
      }
      ++southEast[0];
      --southEast[1];
    }
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];

    // Set default for bottom right
    southWest[0] = queenX;
    southWest[1] = queenY;
    // Look below and to the left
    if (queenX - 1 >= 1 && queenY - 1 >= 1) {
      while (--queenX >= 1 && --queenY >= 1) {
        --southWest[0];
        --southWest[1];
      }
      --southWest[0];
      --southWest[1];
    }

    if (debugMode) {
      System.out.println("Default Bounds");

      System.out.println("north: " + north);
      System.out.println("south: " + south);
      System.out.println("west: " + west);
      System.out.println("east: " + east);

      System.out.println("northEast: " + northEast[0] + " : " + northEast[1]);
      System.out.println("northWest: " + northWest[0] + " : " + northWest[1]);
      System.out.println("southWest: " + southWest[0] + " : " + southWest[1]);
      System.out.println("southEast: " + southEast[0] + " : " + southEast[1]);
    }
  }

  private enum Direction {
    None, North, NorthEast, East, SouthEast, South, SouthWest, West, NorthWest,
  }

  private static Direction determineDirect(int x, int y) {
    Direction pieceDirection = Direction.None;
    // Determine if same x position
    if (x == queenPosition[0]) {
      if (y > queenPosition[1]) {
        // Above Queen
        pieceDirection = Direction.North;
      } else {
        // Below Queen
        pieceDirection = Direction.South;
      }
    }
    // Determine if same y position
    else if (y == queenPosition[1]) {
      if (x > queenPosition[0]) {
        // Right of Queen
        pieceDirection = Direction.East;
      } else {
        // Left of Queen
        pieceDirection = Direction.West;
      }
    }
    // Else maybe it is diagonal
    else {
      int deltaX = x - queenPosition[0];
      int deltaY = y - queenPosition[1];
      // Look to see if the differences in X and Y are the same magnitude
      if (Math.abs(deltaX) == Math.abs(deltaY)) {
        // Top Right
        if (deltaX > 0 && deltaY > 0) {
          pieceDirection = Direction.NorthEast;
        }
        // Top Left
        else if (deltaX < 0 && deltaY > 0) {
          pieceDirection = Direction.NorthWest;
        }
        // Bottom Right
        else if (deltaX > 0 && deltaY < 0) {
          pieceDirection = Direction.SouthEast;
        }
        // Bottom Left
        else {
          pieceDirection = Direction.SouthWest;
        }
      }
    }
    return pieceDirection;
  }

  public static void updateBounds(int x, int y) {
    Direction direction = determineDirect(x, y);
    switch (direction) {
      case North:
        north = (y < north) ? y : north;
        break;
      case South:
        south = (y > south) ? y : south;
        break;
      case East:
        east = (x < east) ? x : east;
        break;
      case West:
        west = (x > west) ? x : west;
        break;
      case NorthEast:
        if (x < east && y < north) {
          northEast[0] = x;
          northEast[1] = y;
        }
        break;
      case NorthWest:
        if (x > west && y < north) {
          northWest[0] = x;
          northWest[1] = y;
        }
        break;
      case SouthEast:
        if (x < east && y > south) {
          southEast[0] = x;
          southEast[1] = y;
        }
        break;
      case SouthWest:
        if (x > west && y > south) {
          southWest[0] = x;
          southWest[1] = y;
        }
        break;
      default:
        break;
    }
  }
  
  public static int calculateNumberOfMoves() {
    int moves = 0;
    if (debugMode)
      System.out.println("Queen at: " + queenPosition[0] + " " + queenPosition[1]);
    // Four basic directions East, West, Noth, and South
    moves += (east == queenPosition[0]) ? 0 : east - queenPosition[0] - 1;
    if (debugMode)
      System.out.println("East Moves: " + moves);
    moves += (west == queenPosition[0]) ? 0 : queenPosition[0] - west - 1;
    if (debugMode)
      System.out.println("West Moves: " + moves);
    moves += (north == queenPosition[1]) ? 0 : north - queenPosition[1] - 1;
    if (debugMode)
      System.out.println("North Moves: " + moves);
    moves += (south == queenPosition[1]) ? 0 : queenPosition[1] - south - 1;
    if (debugMode)
      System.out.println("South Moves: " + moves);
    // Four Complex Directions
    moves += (northEast[0] == queenPosition[0]) ? 0 : northEast[0] - queenPosition[0] - 1;
    if (debugMode)
      System.out.println("North East Moves: " + moves);
    moves += (northWest[0] == queenPosition[0]) ? 0 : queenPosition[0] - northWest[0] - 1;
    if (debugMode)
      System.out.println("North West Moves: " + moves);
    moves += (southEast[0] == queenPosition[0]) ? 0 : southEast[0] - queenPosition[0] - 1;
    if (debugMode)
      System.out.println("South East Moves: " + moves);
    moves += (southWest[0] == queenPosition[0]) ? 0 : queenPosition[0] - southWest[0] - 1;
    if (debugMode)
      System.out.println("South West Moves: " + moves);
    return moves;
  }

  public static int handleInputs() {
    Scanner in = new Scanner(System.in);
    boardSize = in.nextInt();
    int querySize = in.nextInt();

    queenPosition[0] = in.nextInt();
    queenPosition[1] = in.nextInt();
    
    // Set the initial 8 bounds for the queen.
    determineInitialBorders();
    
    // Run queries
    for(int q = 0; q < querySize; q++) {
      int x = in.nextInt();
      int y = in.nextInt();
      updateBounds(x, y);
    }
    int moves = calculateNumberOfMoves();
    System.out.println(moves);
    return moves;
  }
  
  public static void main(String[] args) {
    handleInputs();
  }
}
