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
@DisplayName("LeetCode: 638. Shopping Offers")
class ShoppingOffersTest {

  private ShoppingOffers shoppingOffers = new ShoppingOffers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[] prices = {2,5};
    Integer[][] specials = {{3,0,5},{1,2,10}};
    Integer[] needs = {3,2};

    List<List<Integer>> specialsList = new ArrayList<>();
    for (Integer[] row : specials) {
      specialsList.add(Arrays.asList(row));
    }

    Assertions.assertEquals(14, shoppingOffers.shoppingOffers(
        Arrays.asList(prices),
        specialsList,
        Arrays.asList(needs)
    ));
  }
}
