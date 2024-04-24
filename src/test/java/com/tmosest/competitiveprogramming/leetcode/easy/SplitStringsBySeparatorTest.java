package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc355")
@Tag("array")
@DisplayName("LeetCode: 2788. Split Strings by Separator")
class SplitStringsBySeparatorTest {
    private SplitStringsBySeparator splitStringsBySeparator;

    @BeforeEach
    void setup() {
        splitStringsBySeparator = new SplitStringsBySeparator();
    }

    private void test(List<String> output, List<String> words, char separator) {
        Assertions.assertEquals(output, splitStringsBySeparator.splitWordsBySeparator(words, separator));
    }

    @Test
    void test0() {
        test(List.of("one","two","three","four","five","six"), List.of("one.two.three","four.five","six"), '.');
    }

    @Test
    void test1() {
        test(List.of(), List.of("|||"), '|');
    }
}
