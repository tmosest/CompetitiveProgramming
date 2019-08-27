package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 332. Reconstruct Itinerary")
class ReconstructItineraryTest {

  private ReconstructItinerary reconstructItinerary = new ReconstructItinerary();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[][] tickets = 
      {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
    List<List<String>> input = new ArrayList<>();
    for (String[] row : tickets) {
      input.add(Arrays.asList(row));
    }
    String[] output = {
        "JFK","ATL","JFK","SFO","ATL","SFO"
    };
    List<String> outputList = Arrays.asList(output);
    Assertions.assertEquals(outputList, reconstructItinerary.findItinerary(input));
  }
}
