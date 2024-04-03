package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("wc374")
@DisplayName("LeetCode: 2954. Count the Number of Infection Sequences")
class CountTheNumberOfInfectionSequencesTest {
    private CountTheNumberOfInfectionSequences countTheNumberOfInfectionSequences;

    @BeforeEach
    void setup() {
        countTheNumberOfInfectionSequences = new CountTheNumberOfInfectionSequences();
    }

    private void test(int output, int n, int[] sick) {
        Assertions.assertEquals(output, countTheNumberOfInfectionSequences.numberOfSequence(n, sick));
    }

    @Test
    void test0() {
        test(4, 5, new int[] {0, 4});
    }
}
