package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc105")
@DisplayName("LeetCode: 917. Reverse Only Letters")
class ReverseOnlyLettersTest {
    private ReverseOnlyLetters reverseOnlyLetters;

    @BeforeEach
    void setup() {
        reverseOnlyLetters = new ReverseOnlyLetters();
    }

    private void test(String output, String s) {
        Assertions.assertEquals(output, reverseOnlyLetters.reverseOnlyLetters(s));
    }

    @Test
    void test0() {
        test("dc-ba", "ab-cd");
    }

    @Test
    void test1() {
        test("j-Ih-gfE-dCba", "a-bC-dEf-ghIj");
    }

    @Test
    void test2() {
        test("Qedo1ct-eeLg=ntse-T!", "Test1ng-Leet=code-Q!");
    }
}
