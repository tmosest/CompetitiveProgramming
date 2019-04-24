package com.tmosest.competitiveprogramming.leetcode

import java.util.Arrays

class MatrixCellsInDistanceOrder {

    /**
     * Returns cells in matrix that are in manhattan distance order.
     * @param rows The number of rows.
     * @param cols The number of cols.
     * @param startRow the starting row.
     * @param startCol The starting col.
     */
    fun allCellsDistOrder(rows: Int, cols: Int, startRow: Int, startCol: Int): Array<IntArray> {
        val res = Array(rows * cols) { IntArray(1) }
        var index = 0
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                res[index++] = intArrayOf(i, j)
            }
        }
        Arrays.sort(res) {
            a,
            b -> Math.abs(startRow - a[0]) + Math.abs(startCol - a[1]) - (Math.abs(startRow - b[0]) + Math.abs(startCol - b[1]))
        }
        return res
    }
}