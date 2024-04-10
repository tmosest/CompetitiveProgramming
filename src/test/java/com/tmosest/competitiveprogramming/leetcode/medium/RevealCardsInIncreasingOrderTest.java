package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wcx")
@DisplayName("LeetCode: 950. Reveal Cards In Increasing Order")
class RevealCardsInIncreasingOrderTest {
    private RevealCardsInIncreasingOrder revealCardsInIncreasingOrder;

    @BeforeEach
    void setup() {
        revealCardsInIncreasingOrder = new RevealCardsInIncreasingOrder();
    }

    private void test(int[] output, int[] deck) {
        Assertions.assertArrayEquals(output, revealCardsInIncreasingOrder.deckRevealedIncreasing(deck));
    }

    @Test
    void test0() {
        test(new int[] { 2, 13, 3, 11, 5, 17, 7 }, new int[] { 17, 13, 11, 2, 3, 5, 7 });
    }
}
