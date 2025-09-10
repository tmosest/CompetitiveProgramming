package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MinimumAverageOfSmallestAndLargestElements {
	/*
	 * 3194. Minimum Average of Smallest and Largest Elements
	 * 
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/description/
	 * 
	 * You have an array of floating point numbers averages which is initially
	 * empty. You are given an array nums of n integers where n is even.
	 * 
	 * You repeat the following procedure n / 2 times:
	 * 
	 * Remove the smallest element, minElement, and the largest element
	 * maxElement,ÔøΩfrom nums.
	 * Add (minElement + maxElement) / 2 to averages.
	 * Return the minimum element in averages.
	 * 
	 * ÔøΩ
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [7,8,3,4,15,13,4,1]
	 * 
	 * Output: 5.5
	 * 
	 * Explanation:
	 * 
	 * step nums averages
	 * 0 [7,8,3,4,15,13,4,1] []
	 * 1 [7,8,3,4,13,4] [8]
	 * 2 [7,8,4,4] [8,8]
	 * 3 [7,4] [8,8,6]
	 * 4 [] [8,8,6,5.5]
	 * The smallest element of averages, 5.5, is returned.
	 * Example 2:
	 * 
	 * Input: nums = [1,9,8,3,10,5]
	 * 
	 * Output: 5.5
	 * 
	 * Explanation:
	 * 
	 * step nums averages
	 * 0 [1,9,8,3,10,5] []
	 * 1 [9,8,3,5] [5.5]
	 * 2 [8,5] [5.5,6]
	 * 3 [] [5.5,6,6.5]
	 * Example 3:
	 * 
	 * Input: nums = [1,2,3,7,8,9]
	 * 
	 * Output: 5.0
	 * 
	 * Explanation:
	 * 
	 * step nums averages
	 * 0 [1,2,3,7,8,9] []
	 * 1 [2,3,7,8] [5]
	 * 2 [3,7] [5,5]
	 * 3 [] [5,5,5]
	 * ÔøΩ
	 * 
	 * Constraints:
	 * 
	 * 2 <= n == nums.length <= 50
	 * n is even.
	 * 1 <= nums[i] <= 50
	 * 
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/7048874/fastest-beats-100-time-on-unique-solutio-5i05/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/7024215/easy-java-solution-beats-99-runtime-0ms-5ylg3/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/7009006/easy-simple-java-solution-by-prakhar-131-fgc7/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/7006050/solution-that-beats-98-using-arrays-by-m-xp7a/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/6886301/balanced-pairing-for-minimum-average-by-0kt10/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/6861611/java-solution-by-shubhamxgupta-hr58/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/5355486/easy-java-solution-beats-100-by-rini03-dclr/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/6565265/easiest-way-by-dhci7to7bk-kfuj/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/6726526/easy-peasy-beats-99-by-sagar__26-00b2/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/5356780/solution-by-dare2solve-detailed-solution-70lv/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/5355792/simple-java-c-code-by-abhinandannaik1717-y23c/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/6103938/minimal-approach-two-pointers-by-da_vinc-i70l/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/5359315/beats-100-best-intuitive-solution-must-r-cp4d/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/6658948/minimum-average-of-smallest-and-largest-097ra/
	 * https://leetcode.com/problems/minimum-average-of-smallest-and-largest-
	 * elements/solutions/6469230/java-solution-using-deque-by-vermaanshul-7lpj/
	 */
	/* public double minimumAverage(int[] nums) */

	public double minimumAverage(int[] nums) {
		int l = nums.length;
		List<Double> averages = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < l / 2; i++) {
			double avg = (nums[i] + nums[l - 1 - i]) / 2.0;
			averages.add(avg);
		}
		return Collections.min(averages);
	}

}
