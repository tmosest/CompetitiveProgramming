package com.tmosest.competitiveprogramming.kata.methinks;

import com.tmosest.competitiveprogramming.utils.random.RandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeThinksItIsLikeWeasel {

  private String target = "";
  private String bestOffSpring = "";
  private List<Character> characterSet;
  private int offSpringCount;
  private int wordSize = 28;
  private double mutationRate;
  private List<List<String>> generations = new ArrayList<>();
  private boolean matchFound = false;

  private MeThinksItIsLikeWeasel(
      List<Character> characters,
      int offSpringCount,
      double mutationRate, String target
  ) {
    this.target = target;
    wordSize = target.length();
    characterSet = characters;
    this.offSpringCount = offSpringCount;
    this.mutationRate = mutationRate;
  }

  private boolean isMatchFound() {
    return matchFound;
  }

  private void generateGeneration() {
    List<String> generation = new ArrayList<>();
    if (generations.isEmpty()) {
      bestOffSpring = RandomUtil.generateRandomWord(
          characterSet,
          wordSize
      );
      generation.add(bestOffSpring);
    } else {
      for (int i = 0; i < offSpringCount; i++) {
        generation.add(generateOffSpring(bestOffSpring));
      }
    }
    Collections.sort(generation, (Comparator<String>) (o1, o2) -> {
      int count1 = 0;
      int count2 = 0;
      for (int i = 0; i < o1.length(); i++) {
        if (o1.charAt(i) == target.charAt(i)) {
          count1++;
        }
        if (o2.charAt(i) == target.charAt(i)) {
          count2++;
        }
      }
      return Integer.compare(count2, count1);
    });
    bestOffSpring = generation.get(0);
    if (bestOffSpring.equals(target)) {
      matchFound = true;
    }
    generations.add(generation);
  }

  private String generateOffSpring(String parent) {
    StringBuilder result = new StringBuilder();
    for (char letter : parent.toCharArray()) {
      if (RandomUtil.isHeads(mutationRate)) {
        result.append(RandomUtil.generateRandomLetter(characterSet));
        continue;
      }
      result.append(letter);
    }
    return result.toString();
  }

  private void print() {
    if (generations.isEmpty()) {
      System.out.println("No Children Yet");
    }
    for (int i = 0; i < generations.size(); i++) {
      System.out.println("Generation: " + (i + 1));
      for (int j = 0; j < generations.get(i).size(); j++) {
        System.out.println("c: ("
            + j + " of "
            + offSpringCount + ") :"
            + generations.get(i).get(j)
        );
      }
      System.out.println("Best of " + i + " : " + bestOffSpring);
    }
  }

  /**
   * Manual testing.
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    List<Character> characters = new ArrayList<>();
    characters.add(' ');
    for (int i = 0; i < 26; i++) {
      characters.add((char) (i + 'A'));
    }
    MeThinksItIsLikeWeasel meThinksItIsLikeWeasel = new MeThinksItIsLikeWeasel(
        characters,
        1000,
        .05,
        "METHINKS IT IS LIKE A WEASEL"
    );
    while (!meThinksItIsLikeWeasel.isMatchFound()) {
      meThinksItIsLikeWeasel.print();
      meThinksItIsLikeWeasel.generateGeneration();
    }
  }
}
