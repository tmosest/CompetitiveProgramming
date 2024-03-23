package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("gameTheory")
@Tag("wc382")
@DisplayName("LeetCode: 3021. Alice and Bob Playing Flower Game")
class AliceAndBobPlayingFlowerGameTest {
    private AliceAndBobPlayingFlowerGame aliceAndBobPlayingFlowerGame;

    @BeforeEach
    void setup() {
        aliceAndBobPlayingFlowerGame = new AliceAndBobPlayingFlowerGame();
    }

    private void test(long output, int n, int m) {
        Assertions.assertEquals(output, aliceAndBobPlayingFlowerGame.flowerGame(n, m));
    }

    @Test
    void test0() {
        test(3, 3, 2);
    }

    @Test
    void test1() {
        test(0, 1, 1);
    }
}
