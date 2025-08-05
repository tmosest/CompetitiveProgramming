package com.tmosest.competitiveprogramming.leetcode.easy;

class MinimumNumberOfChairsInWaitingRoom {
	/*
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * description/
	 * 
	 * You are given a string s. Simulate events at each second i:
	 * 
	 * If s[i] == 'E', a person enters the waiting room and takes one of the chairs
	 * in it.
	 * If s[i] == 'L', a person leaves the waiting room, freeing up a chair.
	 * Return the minimum number of chairs needed so that a chair is available for
	 * every person who enters the waiting room given that it is initially empty.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: s = "EEEEEEE"
	 * 
	 * Output: 7
	 * 
	 * Explanation:
	 * 
	 * After each second, a person enters the waiting room and no person leaves it.
	 * Therefore, a minimum of 7 chairs is needed.
	 * 
	 * Example 2:
	 * 
	 * Input: s = "ELELEEL"
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * Let's consider that there are 2 chairs in the waiting room. The table below
	 * shows the state of the waiting room at each second.
	 * 
	 * Second Event People in the Waiting Room Available Chairs
	 * 0 Enter 1 1
	 * 1 Leave 0 2
	 * 2 Enter 1 1
	 * 3 Leave 0 2
	 * 4 Enter 1 1
	 * 5 Enter 2 0
	 * 6 Leave 1 1
	 * Example 3:
	 * 
	 * Input: s = "ELEELEELLL"
	 * 
	 * Output: 3
	 * 
	 * Explanation:
	 * 
	 * Let's consider that there are 3 chairs in the waiting room. The table below
	 * shows the state of the waiting room at each second.
	 * 
	 * Second Event People in the Waiting Room Available Chairs
	 * 0 Enter 1 2
	 * 1 Leave 0 3
	 * 2 Enter 1 2
	 * 3 Enter 2 1
	 * 4 Leave 1 2
	 * 5 Enter 2 1
	 * 6 Enter 3 0
	 * 7 Leave 2 1
	 * 8 Leave 1 2
	 * 9 Leave 0 3
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 50
	 * s consists only of the letters 'E' and 'L'.
	 * s represents a valid sequence of entries and exits.
	 * 
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/5256703/2-method-very-easy-solution-is-0ms-by-at-c9t9/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/6914705/java-solution-by-monish1153-a5gf/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/5243793/simple-detailed-explanation-on-o1-by-muh-9jey/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/5337450/simple-c-java-code-easy-to-understand-be-ukk1/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/5341015/beats-100-users-in-java-simple-code-by-a-ysid/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/6739082/java-easy-100-solution-by-ytchouar-glt3/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/5337297/simple-java-c-javascript-code-by-abhinan-ti2m/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/5243366/java-solution-by-harsh__005-05i9/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/6702162/easy-approach-beats-100-by-sobika751-0v5w/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/6630772/simple-simple-counttttttttttttttttt-by-s-uhtx/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/5247046/python-java-elegant-short-one-pass-count-bv4q/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/7048574/simple-approach-to-find-the-minimum-numb-b4q7/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/7011711/java-solution-beats-100-users-q-3168-min-iv6f/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/6986638/100-beats-by-nikhil_chahar-yiwt/
	 * https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
	 * solutions/6919342/easy-by-karthikashanmugam-gczm/
	 */
	public int minimumChairs(String s) {
		while (s.contains("LE"))
			s = s.replace("LE", "");

		s = s.replace("L", "");
		return s.length();

	}
}
