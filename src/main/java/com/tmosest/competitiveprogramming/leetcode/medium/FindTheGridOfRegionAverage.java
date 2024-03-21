package com.tmosest.competitiveprogramming.leetcode.medium;

class FindTheGridOfRegionAverage {
	/**
	 * https://leetcode.com/problems/find-the-grid-of-region-average/
	 * @param image
	 * @param threshold
	 * @return
	 */
	private int[][] dirs = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    
    public int[][] resultGrid(int[][] image, int threshold) {
        int r = image.length, c = image[0].length;
        int[][] res = new int[r][c];
        int[][] count = new int[r][c];

        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                int r0 = i - 1, c0 = j - 1;
                int r1 = i + 1, c1 = j + 1;

                // Find if we have valid 3X3 region.
                boolean foundRegion = helper(image, i, j, r0, c0, r1, c1, threshold);
                if (foundRegion) {
                    for (int[] dir : dirs) {
                        int x = dir[0] + i;
                        int y = dir[1] + j;
                        foundRegion &= helper(image, x, y, r0, c0, r1, c1, threshold);
                        if (!foundRegion) break;
                    }
                }

                if (foundRegion) {
                    int sum = 0;
                    for (int k = r0; k <= r1; k++) {
                        for (int l = c0; l <= c1; l++) {
                            sum += image[k][l];
                            count[k][l]++;
                        }
                    }

                    for (int k = r0; k <= r1; k++) {
                        for (int l = c0; l <= c1; l++) {
                            int avg = sum / 9;
                            res[k][l] = (count[k][l] == 1) ? avg : res[k][l] + avg;
                        }
                    }
                } else {
                    for (int k = r0; k <= r1; k++) {
                        for (int l = c0; l <= c1; l++) {
                            if (count[k][l] == 0) res[k][l] = image[k][l];
                        }
                    }
                }
            }
        }

        // Update overlapped averages
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (count[i][j] > 1) {
                    res[i][j] = res[i][j] / count[i][j];
                }
            }
        }

        return res;
    }

    private boolean helper(int[][] image, int i, int j, int r0, int c0, int r1, int c1, int t) {
        for (int[] dir : dirs) {
            int x = dir[0] + i;
            int y = dir[1] + j;
            if (x < r0 || x > r1 || y < c0 || y > c1) continue;
            if (Math.abs(image[x][y] - image[i][j]) > t) return false;
        }
        return true;
    }
}
