package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.utils.lists.MatrixListAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc187")
@DisplayName("LeetCode: 1436. Destination City")
class DestinationCityTest {

  private DestinationCity destinationCity = new DestinationCity();

  @Test
  void testCase0() {
    String[][] paths = {{"London", "New York"}, {"New York", "Lima"}, {"Lima", "Sao Paulo"}};
    Assertions.assertEquals("Sao Paulo", destinationCity.destCity(MatrixListAdapter.toList(paths)));
  }
}
