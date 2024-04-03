package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("depthFirstSearch")
@Tag("matrix")
@Tag("wcx")
@DisplayName("LeetCode: 79. Word Search")
class WordSearchTest {
    private WordSearch wordSearch;

    @BeforeEach
    void setup() {
        wordSearch = new WordSearch();
    }

    private void test(boolean output, char[][] board, String word) {
        Assertions.assertEquals(output, wordSearch.exist(board, word));
    }

    @Test
    void test0() {
        test(true, new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");
    }

}
