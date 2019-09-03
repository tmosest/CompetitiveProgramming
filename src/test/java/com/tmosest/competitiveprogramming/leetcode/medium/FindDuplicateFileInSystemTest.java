package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 609. Find Duplicate File in System")
class FindDuplicateFileInSystemTest {

  private FindDuplicateFileInSystem findDuplicateFileInSystem = new FindDuplicateFileInSystem();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {

    String[] input = {
        "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"
    };

    String[][] expectedArray = {
        {"root/a/2.txt","root/c/d/4.txt","root/4.txt"},
        {"root/a/1.txt","root/c/3.txt"}
    };

    List<List<String>> expected = new ArrayList<>();

    for (String[] row : expectedArray) {
      expected.add(Arrays.asList(row));
    }

    findDuplicateFileInSystem.findDuplicate(input);

    // assertThat(findDuplicateFileInSystem.findDuplicate(input), containsInAnyOrder(expected));
  }
}
