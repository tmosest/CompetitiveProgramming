package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc393")
@DisplayName("LeetCode: 3114. Latest Time You Can Obtain After Replacing Characters")
class LatestTimeYouCanObtainAfterReplacingCharactersTest {
    private LatestTimeYouCanObtainAfterReplacingCharacters latestTimeYouCanObtainAfterReplacingCharacters;

    @BeforeEach
    void setup() {
        latestTimeYouCanObtainAfterReplacingCharacters = new LatestTimeYouCanObtainAfterReplacingCharacters();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, latestTimeYouCanObtainAfterReplacingCharacters.findLatestTime(s));
    }

    @Test
    void test0() {
        test("11:54", "1?:?4");
    }

    @Test
    void test1() {
        test("09:59", "0?:5?");
    }
}
