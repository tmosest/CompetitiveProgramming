package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("map")
@Tag("wc104")
@Tag("array")
@DisplayName("LeetCode: 914. X of a Kind in a Deck of CardsI")
class TenOfKindInDeckOfCardsiTest {
    private TenOfKindInDeckOfCardsi tenOfKindInDeckOfCardsi;

    @BeforeEach
    void setup() {
        tenOfKindInDeckOfCardsi = new TenOfKindInDeckOfCardsi();
    }

    private void test(boolean output, int[] deck) {
        Assertions.assertEquals(output, tenOfKindInDeckOfCardsi.hasGroupsSizeX(deck));
    }

    @Test
    void test0() {
        test(true, new int[] { 1, 2, 3, 4, 4, 3, 2, 1 });
    }

    @Test
    void test1() {
        test(false, new int[] { 1, 1, 1, 2, 2, 2, 3, 3 });
    }

    @Test
    void test2() {
        test(false, new int[] { 1 });
    }

    @Test
    void test3() {
        test(true, new int[] { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 }); // [1,1] x 2 , [2,2] x 3 from gcd(6,4) = 2 so each group needs to be of size 2.
    }
}
