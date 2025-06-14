package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("math")
@Tag("wc453")
@Tag("combinatorics")
@DisplayName("LeetCode: 3577. Count the Number of Computer Unlocking Permutations")
class CountTheNumberOfComputerUnlockingPermutationsTest {
    private CountTheNumberOfComputerUnlockingPermutations countTheNumberOfComputerUnlockingPermutations;

    @BeforeEach
    void setup() {
        countTheNumberOfComputerUnlockingPermutations = new CountTheNumberOfComputerUnlockingPermutations();
    }

    private void test(int output, int[] complexity) {
        Assertions.assertEquals(output, countTheNumberOfComputerUnlockingPermutations.countPermutations(complexity));
    }

    @Test
    void test0() {
        test(2, new int[] { 1, 2, 3 });
    }
}
