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
@Tag("wc125")
@Tag("array")
@DisplayName("LeetCode: 1002. Find Common Characters")
class FindCommonCharactersTest {
    private FindCommonCharacters findCommonCharacters;

    @BeforeEach
    void setup() {
        findCommonCharacters = new FindCommonCharacters();
    }

    private void test(List<String> output, String[] words) {
        Assertions.assertEquals(output, findCommonCharacters.commonChars(words));
    }

    @Test
    void test0() {
        test(List.of("e", "l", "l"), new String[] { "bella", "label", "roller" });
    }

    @Test
    void test1() {
        test(List.of("c", "o"), new String[] { "cool", "lock", "cook" });
    }

    @Test
    void test2() {
        test(List.of(), new String[] { "acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda",
                "cababaab", "addcaccd" });
    }
}
