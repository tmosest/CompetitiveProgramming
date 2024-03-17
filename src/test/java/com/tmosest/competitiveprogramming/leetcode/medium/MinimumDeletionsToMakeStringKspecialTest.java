package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc389")
@DisplayName("LeetCode: 100255. Minimum Deletions to Make String K-Special")
class MinimumDeletionsToMakeStringKspecialTest {
    private MinimumDeletionsToMakeStringKspecial minimumDeletionsToMakeStringKspecial;

    @BeforeEach
    void setup() {
        minimumDeletionsToMakeStringKspecial = new MinimumDeletionsToMakeStringKspecial();
    }

    private void test(int output, String word, int k) {
        Assertions.assertEquals(output, minimumDeletionsToMakeStringKspecial.minimumDeletions(word, k));
    }

    @Test
    void test0() {
        test(3, "aabcaba", 0);
    }

    @Test
    void test1() {
        test(2, "dabdcbdcdcd", 2);
    }

    @Test
    void test2() {
        test(1, "aaabaaa", 2);
    }
}
