package com.tmosest.competitiveprogramming.leetcode.medium;

class FindTheMinimumAreaToCoverAllOnesOne {
	/*
	 * 3195. Find the Minimum Area to Cover All Ones I
	 * 
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * description/
	 * 
	 * You are given a 2D binary array grid. Find a rectangle with horizontal and
	 * vertical sides with the smallest area, such that all the 1's in grid lie
	 * inside this rectangle.
	 * 
	 * Return the minimum possible area of the rectangle.
	 * 
	 * ÔøΩ
	 * 
	 * Example 1:
	 * 
	 * Input: grid = [[0,1,0],[1,0,1]]
	 * 
	 * Output: 6
	 * 
	 * Explanation:
	 * 
	 * 
	 * 
	 * The smallest rectangle has a height of 2 and a width of 3, so it has an area
	 * of 2 * 3 = 6.
	 * 
	 * Example 2:
	 * 
	 * Input: grid = [[1,0],[0,0]]
	 * 
	 * Output: 1
	 * 
	 * Explanation:
	 * 
	 * 
	 * 
	 * The smallest rectangle has both height and width 1, so its area is 1 * 1 = 1.
	 * 
	 * ÔøΩ
	 * 
	 * Constraints:
	 * 
	 * 1 <= grid.length, grid[i].length <= 1000
	 * grid[i][j] is either 0 or 1.
	 * The input is generated such that there is at least one 1 in grid.
	 * 
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355386/quadratic-time-complexity-in-finding-min-ulpe/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5359337/simple-easy-intuitive-greedy-solution-ja-4lto/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355827/simple-java-c-code-by-abhinandannaik1717-vham/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355204/easiest-java-solution-by-1asthakhushi1-648z/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355084/easy-java-solution-by-vaibhavbhatt59-sx0j/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355164/easy-java-solution-by-cvxmf4evjh-3z5l/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5357180/beats-100-time-complexity-onm-space-comp-li2i/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355239/easy-program-using-indices-in-java-by-ni-59if/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355531/best-java-solution-best-c-solution-with-f09a9/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5358867/easiest-of-all-by-vaishnavitnaik-rna2/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355293/beginner-friendly-approach-in-java-by-ta-bdxg/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5357923/beats-100-java-beginner-friendly-approac-za0n/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355231/java-solution-by-harsh__005-xllw/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5356615/easy-solution-beats-100-users-with-java-crf4r/
	 * https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
	 * solutions/5355567/beats-100-simple-logic-detailed-step-by-2i3bu/
	 */
	/* public int minimumArea(int[][] grid) */

	public int minimumArea(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int min_i = n;
		int max_i = 0;
		int min_j = m;
		int max_j = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 1) {
					min_i = Math.min(min_i, i);
					max_i = Math.max(max_i, i);
					min_j = Math.min(min_j, j);
					max_j = Math.max(max_j, j);
				}
			}
		}
		return (max_i - min_i + 1) * (max_j - min_j + 1);
	}

}
