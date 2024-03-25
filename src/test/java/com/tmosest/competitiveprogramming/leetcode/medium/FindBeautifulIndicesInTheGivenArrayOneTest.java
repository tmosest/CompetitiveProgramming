package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@Tag("wc380")
@DisplayName("LeetCode: 3006. Find Beautiful Indices in the Given Array I")
class FindBeautifulIndicesInTheGivenArrayOneTest {
    private FindBeautifulIndicesInTheGivenArrayOne findBeautifulIndicesInTheGivenArrayOne;

    @BeforeEach
    void setup() {
        findBeautifulIndicesInTheGivenArrayOne = new FindBeautifulIndicesInTheGivenArrayOne();
    }

    private void test(List<Integer> output, String s, String a, String b, int k) {
        Assertions.assertEquals(output, findBeautifulIndicesInTheGivenArrayOne.beautifulIndices(s, a, b, k));
    }

    @Test
    void test0() {
        test(List.of(16, 33), "isawsquirrelnearmysquirrelhouseohmy", "my", "squirrel", 15);
    }
}
