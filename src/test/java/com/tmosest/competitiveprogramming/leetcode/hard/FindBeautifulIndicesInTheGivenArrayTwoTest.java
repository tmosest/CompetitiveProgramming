package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("list")
@Tag("wc380")
@DisplayName("LeetCode: 3008. Find Beautiful Indices in the Given Array II")
class FindBeautifulIndicesInTheGivenArrayTwoTest {
    private FindBeautifulIndicesInTheGivenArrayTwo findBeautifulIndicesInTheGivenArrayTwo;

    @BeforeEach
    void setup() {
        findBeautifulIndicesInTheGivenArrayTwo = new FindBeautifulIndicesInTheGivenArrayTwo();
    }

    private void test(List<Integer> output, String s, String a, String b, int k) {
        Assertions.assertEquals(output, findBeautifulIndicesInTheGivenArrayTwo.beautifulIndices(s, a, b, k));
    }

    @Test
    void test0() {
        test(List.of(16, 33), "isawsquirrelnearmysquirrelhouseohmy", "my", "squirrel", 15);
    }
}
