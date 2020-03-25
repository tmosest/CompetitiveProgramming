package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class RankTeamsByVotes {

  private static class Mapping {

    String charVal;
    List<String> rankings = new ArrayList<>();
  }

  String rankTeams(String[] votes) {

    TreeMap<String, Mapping> characterVotes = new TreeMap<>();

    for (String current : votes) {
      List<String> asStrings = IntStream.range(0, current.length())
          .mapToObj(x -> String.valueOf(current.charAt(x))).collect(Collectors.toList());
      for (int i = 0; i < asStrings.size(); i++) {
        Mapping rankings = characterVotes.getOrDefault(asStrings.get(i), new Mapping());
        rankings.charVal = asStrings.get(i);
        rankings.rankings.add((char) (i) + "");
        characterVotes.put(asStrings.get(i), rankings);
      }
    }

    List<Mapping> allValues = new ArrayList<>(characterVotes.values());
    allValues.stream().forEach(x -> Collections.sort(x.rankings));
    Collections
        .sort(allValues, (one, two) -> String.valueOf(one.rankings).compareTo(two.rankings + ""));
    return allValues.stream().map(x -> x.charVal).reduce((one, two) -> one + "" + two).get();
  }
}
