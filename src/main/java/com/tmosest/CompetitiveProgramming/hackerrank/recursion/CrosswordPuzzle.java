package com.tmosest.CompetitiveProgramming.hackerrank.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class CrosswordPuzzle {

  public static boolean debugMode = false;
  
  private static boolean solved;
  private static String[] solution;

  private static final int GRID_SIZE = 10;

  private enum Direction {
    DOWN, RIGHT
  }

  private static int[] findFirstEmptySpot(String[] puzzle) {
    int i = 0;
    int j = 0;
    boolean found = false;
    for (; i < GRID_SIZE; i++) {
      for (j = 0; j < GRID_SIZE; j++) {
        if (puzzle[i].charAt(j) == '-') {
          if (debugMode)
            System.out.println("Found - at : (" + i + "," + j + ")");
          found = true;
          break;
        }
      }
      if (found)
        break;
    }
    int[] cordinates = {-1, -1};
    if (found) {
      cordinates[0] = i;
      cordinates[1] = j;
    }
    if (debugMode)
      System.out.println("Returning - at : (" + i + "," + j + ")");
    return cordinates;
  }

  private static Direction determineDirection(String[] puzzle, int[] cordinates) {
    Direction direction = Direction.RIGHT;
    if (cordinates[0] + 1 < GRID_SIZE) {
      if (puzzle[cordinates[0] + 1].charAt(cordinates[1]) == '-') {
        if (debugMode) {
          System.out.println("Going Down");
        }
        direction = Direction.DOWN;
      }
    }
    return direction;
  }

  private static int determinePotentialWordLength(String[] puzzle, int[] cordinates,
      Direction direction) {
    int wordlength = 0;
    int[] cords = {cordinates[0], cordinates[1]};
    switch (direction) {
      case DOWN:
        // First we go down.
        while (cords[0] < GRID_SIZE && puzzle[cords[0]].charAt(cords[1]) != '+') {
          ++wordlength;
          ++cords[0];
        }
        // Then we go up
        cords[0] = cordinates[0] - 1;
        while (cords[0] >= 0 && puzzle[cords[0]].charAt(cords[1]) != '+') {
          ++wordlength;
          --cords[0];
        }
        break;
      case RIGHT:
        // First we go right.
        while (cords[1] < GRID_SIZE && puzzle[cords[0]].charAt(cords[1]) != '+') {
          ++wordlength;
          ++cords[1];
        }
        // Then we go left
        cords[1] = cordinates[1] - 1;
        while (cords[1] >= 0 && puzzle[cords[0]].charAt(cords[1]) != '+') {
          ++wordlength;
          --cords[1];
        }
        break;
    }
    if (debugMode)
      System.out.println("Potential word length: " + wordlength);
    return wordlength;
  }

  private static String[] findPotentialWords(String[] words, int length) {
    String[] potentialWords = new String[words.length];
    for (int i = 0; i < words.length; i++) {
      if (words[i] != null && words[i].length() == length)
        potentialWords[i] = words[i];
    }
    if (debugMode) {
      System.out.println("Potential Words:");
      printPuzzle(potentialWords);
    }
    return potentialWords;
  }

  private static char[][] copyToNewCharMatrix(String[] puzzle) {
    char[][] result = new char[GRID_SIZE][GRID_SIZE];
    for (int i = 0; i < GRID_SIZE; i++) {
      result[i] = puzzle[i].toCharArray();
    }
    return result;
  }

  private static String[] convertBackToStringArray(char[][] matrix) {
    String[] result = new String[GRID_SIZE];
    for (int i = 0; i < GRID_SIZE; i++) {
      result[i] = String.copyValueOf(matrix[i]);
    }
    if (debugMode) {
      System.out.println("New Potential Puzzle");
      printPuzzle(result);
    }
    return result;
  }

  private static String[] fillInWord(String[] puzzle, String word, int[] cordinates,
      Direction direction) {
    boolean error = false;
    if (debugMode) {
      System.out.println("Filling in word: " + word + " at: (" + cordinates[0] + " ,"
          + cordinates[1] + "), going " + direction);
      System.out.println("Into this puzzle");
      printPuzzle(puzzle);
    }
    int[] cords = {cordinates[0], cordinates[1]};
    char[][] newPuzzle = copyToNewCharMatrix(puzzle);
    int letterIndex = 0;
    switch (direction) {
      case DOWN:
        // First we go up
        while (cords[0] - 1 >= 0 && newPuzzle[cords[0] - 1][cords[1]] != '+') {
          --cords[0];
        }
        // Then we go down and copy in.
        while (cords[0] < GRID_SIZE && newPuzzle[cords[0]][cords[1]] != '+') {
          // Need to make sure that existing letters are ok.
          if (newPuzzle[cords[0]][cords[1]] != '-') {
            if (word.charAt(letterIndex) != newPuzzle[cords[0]][cords[1]]) {
              if (debugMode) {
                System.out.println("Characters do not match need to back track");
              }
              error = true;
              break;
            }
          }
          newPuzzle[cords[0]][cords[1]] = word.charAt(letterIndex);
          ++letterIndex;
          ++cords[0];
        }
        break;
      case RIGHT:
        // First we go left
        while (cords[1] - 1 >= 0 && newPuzzle[cords[0]][cords[1] - 1] != '+') {
          --cords[1];
        }
        if (debugMode)
          System.out.println("Starting at: " + cords[1]);
        // The we go right and copy in
        while (cords[1] < GRID_SIZE && newPuzzle[cords[0]][cords[1]] != '+') {
          // Need to make sure that existing letters are ok.
          if (newPuzzle[cords[0]][cords[1]] != '-') {
            if (word.charAt(letterIndex) != newPuzzle[cords[0]][cords[1]]) {
              if (debugMode) {
                System.out.println("Characters do not match need to back track");
              }
              error = true;
              break;
            }
          }
          newPuzzle[cords[0]][cords[1]] = word.charAt(letterIndex);
          ++letterIndex;
          ++cords[1];
        }
        break;
    }
    return (error) ? null : convertBackToStringArray(newPuzzle);
  }

  private static String[] removeWord(String[] words, String word) {
    String[] newWords = new String[words.length];
    for (int i = 0; i < words.length; i++) {
      if (!word.equals(words[i]))
        newWords[i] = words[i];
    }
    if (debugMode) {
      System.out.println("New Words");
      printPuzzle(newWords);
    }
    return newWords;
  }

  private static String[] createPuzzleWithWords(String[] puzzle, String[] words) {
    if (debugMode) {
      System.out.println("Checking for left over words");
      printPuzzle(words);
    }
    String[] finalAnswer = puzzle;
    int length = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i] != null)
        length++;
    }
    // Need to append unused words.
    if (length != 0) {
      finalAnswer = new String[GRID_SIZE + length];
      int i = 0;
      for (; i < puzzle.length; i++) {
        finalAnswer[i] = puzzle[i];
      }
      for (int j = 0; j < words.length; j++) {
        if (words[i] != null) {
          finalAnswer[i++] = words[j];
        }
      }
    }
    solution = finalAnswer;
    return finalAnswer;
  }

  private static String[] fillInPuzzle(String[] puzzle, String[] words) {
    String[] finalPuzzle = Arrays.copyOf(puzzle, puzzle.length);
    if (debugMode) {
      System.out.println("\n\nSolving this puzzle");
      printPuzzle(puzzle);
      System.out.println("With Words");
      printPuzzle(words);
    }
    // Determine next empty spot
    int[] cordinates = findFirstEmptySpot(puzzle);
    if (cordinates[0] == -1) {
      solved = true;
      return createPuzzleWithWords(puzzle, words);
    }
    // Determine Direction
    Direction direction = determineDirection(puzzle, cordinates);
    // Determine the potential word length
    int potentialWordLength = determinePotentialWordLength(puzzle, cordinates, direction);
    String[] potentialWords = findPotentialWords(words, potentialWordLength);
    boolean matchFound = false;
    for (int i = 0; i < potentialWords.length; i++) {
      String[] newPuzzle = null;
      if (potentialWords[i] != null) {
        newPuzzle = Arrays.copyOf(puzzle, puzzle.length);
        newPuzzle = fillInWord(newPuzzle, potentialWords[i], cordinates, direction);
      }
      if (newPuzzle != null) {
        matchFound = true;
        // We need to remove the word and call recursive function.
        String[] newWords = removeWord(words, potentialWords[i]);
        String[] potentialPuzzle = fillInPuzzle(newPuzzle, newWords);
        if (potentialPuzzle != null)
          finalPuzzle = potentialPuzzle;
        if(solved)
          finalPuzzle = solution;
      }
    }
    return (matchFound || solved) ? finalPuzzle : null;
  }

  private static void printPuzzle(String[] puzzle) {
    Arrays.stream(puzzle).forEach(System.out::println);
  }


  public static String solve() {
    solved = false;
    solution = null;
    Scanner in = new Scanner(System.in);

    String[] puzzle = new String[GRID_SIZE];
    String wordsToSplit;

    for (int i = 0; i < GRID_SIZE; i++) {
      puzzle[i] = in.nextLine();
    }

    if (debugMode) {
      System.out.println("Puzzle");
      printPuzzle(puzzle);
    }

    wordsToSplit = in.nextLine();

    in.close();

    if (debugMode)
      System.out.println("Words to Split: " + wordsToSplit);

    String[] words = wordsToSplit.split(";");

    String[] result = fillInPuzzle(puzzle, words);

    printPuzzle(result);

    return String.join("\n", result);
  }

  public static void main(String[] args) {
    solve();
  }

}
