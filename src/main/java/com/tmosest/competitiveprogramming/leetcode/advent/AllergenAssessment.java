package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class AllergenAssessment {

  String getCanonicalAllergenString(List<String> input) {
    List<Ingredients> items = fromInput(input);
    Map<String, List<String>> possibleAllergenWords = getPossibleAllergenWords(items);
    return possibleAllergenWords.entrySet().stream()
        .sorted(Comparator.comparing(Entry::getKey))
        .map(entry -> entry.getValue().get(0))
        .reduce((one, two) -> one + "," + two)
        .orElse("");
  }

  long countNonAllergenWords(List<String> input) {
    List<Ingredients> items = fromInput(input);
    Map<String, List<String>> possibleAllergenWords = getPossibleAllergenWords(items);

    Set<String> allergenWords = new HashSet<>(possibleAllergenWords.values().stream()
        .reduce((one, two) -> {
          List<String> arr = new ArrayList<>(one);
          arr.addAll(two);
          return arr;
        })
        .orElse(new ArrayList<>())
    );

    return items.stream()
        .map(Ingredients::getIngredients)
        .map(list -> list.stream().filter(str -> !allergenWords.contains(str)).count())
        .reduce(Long::sum)
        .orElse(-1L);
  }

  private List<Ingredients> fromInput(List<String> input) {
    return input.stream()
        .map(Ingredients::fromString)
        .sorted(Comparator.comparingInt(one -> one.allergens.size()))
        .collect(Collectors.toList());
  }

  private Map<String, List<String>> getPossibleAllergenWords(List<Ingredients> items) {
    Map<String, List<String>> possibleAllergenWords = new HashMap<>();

    for (Ingredients ingredients : items) {

      if (ingredients.allergens.isEmpty()) {
        continue;
      }

      for (String allergen : ingredients.allergens) {
        List<String> currentPossibleAllergenWords = possibleAllergenWords
            .getOrDefault(allergen, new ArrayList<>());

        if (currentPossibleAllergenWords.isEmpty()) {
          currentPossibleAllergenWords.addAll(ingredients.ingredients);
          possibleAllergenWords.put(allergen, currentPossibleAllergenWords);
          continue;
        }

        List<String> matchingWords = ingredients.ingredients.stream()
            .filter(str -> currentPossibleAllergenWords.contains(str))
            .collect(Collectors.toList());

        possibleAllergenWords.put(allergen, matchingWords);
      }
    }

    int max = -1;
    while (max != 1) {
      max = -1;
      for (Entry<String, List<String>> entry : possibleAllergenWords.entrySet()) {

        if (entry.getValue().size() == 1) {
          for (Entry<String, List<String>> entryOther : possibleAllergenWords.entrySet()) {
            if (entry.getKey().equals(entryOther.getKey())) {
              continue;
            }

            entryOther.getValue().removeAll(entry.getValue());
          }
        }
        max = Math.max(max, entry.getValue().size());
      }
    }

    return possibleAllergenWords;
  }

  private static class Ingredients {

    private static final String ALLERGEN_INDICATOR = " (contains";
    List<String> ingredients;
    List<String> allergens;

    private Ingredients(List<String> ingredients, List<String> allergens) {
      this.ingredients = new ArrayList<>(ingredients);
      this.allergens = new ArrayList<>(allergens);
    }

    private static Ingredients fromString(String line) {
      int containsIndex = line.indexOf(ALLERGEN_INDICATOR);

      List<String> allergens = containsIndex < 0 ? new ArrayList<>() :
          Arrays.stream(
              line.substring(
                  containsIndex + ALLERGEN_INDICATOR.length(),
                  line.length() - 1).split(",")
          )
              .map(String::trim)
              .collect(Collectors.toList());

      if (containsIndex < 0) {
        containsIndex = line.length();
      }

      List<String> ingredients = Arrays.stream(line.substring(
          0, containsIndex).split(" "))
          .map(String::trim)
          .collect(Collectors.toList());

      return new Ingredients(ingredients, allergens);
    }

    List<String> getIngredients() {
      return ingredients;
    }
  }
}
