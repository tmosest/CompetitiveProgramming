package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 914. X of a Kind in a Deck of Cards")
@Tag("wc104")
class TenOfKindInDeckOfCardsTest {
    private TenOfKindInDeckOfCards tenOfKindInDeckOfCards;

    @BeforeEach
    void setup() {
        tenOfKindInDeckOfCards = new TenOfKindInDeckOfCards();
    }

    private void test(boolean output, int[] deck) {
        Assertions.assertEquals(output, tenOfKindInDeckOfCards.hasGroupsSizeX(deck));
    }
    /*
     * Example 1
     * Input: deck = [1,2,3,4,4,3,2,1]
     * Output: true
     * null
     */

    @Test
    void test1() {
        test(true, new int[] { 1, 2, 3, 4, 4, 3, 2, 1 });
    }
    /*
     * Example 2
     * Input: deck = [1,1,1,2,2,2,3,3]
     * Output: false
     * null
     */

    @Test
    void test2() {
        test(false, new int[] { 1, 1, 1, 2, 2, 2, 3, 3 });
    }
}
