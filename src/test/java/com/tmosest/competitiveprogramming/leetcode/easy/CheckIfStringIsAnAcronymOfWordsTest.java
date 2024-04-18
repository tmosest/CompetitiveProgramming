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
@Tag("wc359")
@Tag("array")
@DisplayName("LeetCode: 2828. Check if a String Is an Acronym of Words")
class CheckIfStringIsAnAcronymOfWordsTest {
    private CheckIfStringIsAnAcronymOfWords checkIfStringIsAnAcronymOfWords;

    @BeforeEach
    void setup() {
        checkIfStringIsAnAcronymOfWords = new CheckIfStringIsAnAcronymOfWords();
    }

    private void test(boolean output, List<String> words, String s) {
        Assertions.assertEquals(output, checkIfStringIsAnAcronymOfWords.isAcronym(words, s));
    }

    @Test
    void test0() {
        test(true, List.of("alice","bob","charlie"), "abc");
    }

    @Test
    void test1() {
        test(false, List.of("an","apple"), "a");
    }
}
