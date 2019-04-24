package com.tmosest.competitiveprogramming.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("leetcode")
@DisplayName("LeetCode: 1030. Matrix Cells in Distance Order")
class MatrixCellsInDistanceOrderTest {

    val matrixCellsInDistanceOrder = MatrixCellsInDistanceOrder()

    @Test
    fun `Test Case 0`() {
        val actual = matrixCellsInDistanceOrder.allCellsDistOrder(1, 2, 0, 0)
        val expected = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))
        Assertions.assertArrayEquals(expected, actual)
    }
}