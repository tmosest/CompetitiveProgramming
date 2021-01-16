package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class PasswordPhilosophy {

  int findValidPasswords(List<String> inputs) {
    return (int) inputs.stream().map(Password::fromString).filter(Password::isValid).count();
  }

  int findValidPasswords2(List<String> inputs) {
    return (int) inputs.stream().map(Password::fromString).filter(Password::isValidNew).count();
  }

  private static class Password {

    private int min;
    private int max;
    private char letter;
    private String password;
    private Map<Character, Integer> count;
    private Map<Character, Set<Integer>> indexes;


    private Password(int min, int max, char letter, String password) {
      this.min = min;
      this.max = max;
      this.letter = letter;
      this.password = password;
      this.generateCounts();
      this.generateIndexes();
    }

    static Password fromString(String input) {
      String[] spaces = input.split(" ");
      String[] numbers = spaces[0].split("-");
      char letter = spaces[1].replace(":", "").toCharArray()[0];
      return new Password(Integer.valueOf(numbers[0]), Integer.valueOf(numbers[1]), letter,
          spaces[2]);
    }

    private void generateCounts() {
      this.count = new HashMap<>();
      for (char passwordLetter : this.password.toCharArray()) {
        int count = this.count.getOrDefault(passwordLetter, 0) + 1;
        this.count.put(passwordLetter, count);
      }
    }

    private void generateIndexes() {
      this.indexes = new HashMap<>();
      for (int i = 0; i < this.password.length(); i++) {
        char letter = this.password.charAt(i);
        Set<Integer> indexes = this.indexes.getOrDefault(letter, new HashSet<>());
        indexes.add(i);
        this.indexes.put(letter, indexes);
      }
    }

    boolean isValid() {
      int count = this.count.getOrDefault(letter, 0);
      return min <= count && count <= max;
    }

    boolean isValidNew() {
      Set<Integer> indexes = this.indexes.getOrDefault(this.letter, new HashSet<>());
      boolean hasFirst = indexes.contains(min - 1);
      boolean hasLast = indexes.contains(max - 1);
      return (hasFirst || hasLast) && !(hasFirst && hasLast);
    }
  }
}
