package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumOperationsToMakeTheIntegerZero {
	/**
	 * https://leetcode.com/problems/minimum-operations-to-make-the-integer-zero/description/
	 * 
	 * Solution: https://leetcode.com/problems/minimum-operations-to-make-the-integer-zero/solutions/3679174/o-1-with-detailed-explanation-and-prove/
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int makeTheIntegerZero(int num1, int n2) {
        long n1 = num1;
        for (int x = 1; x < 64; x++) {
            n1 -= n2;
            // case a num1 becomes <= 0
            if (n1 <= 0) return -1;
            
            // case b and c
            if (n1 > 0) {
                int cnt = cntBit(n1);
                // case c bitOfnum1 <= x
                if (cnt <= x) {
                    if (n1 >= x) return x;
                    // if set all operations to 2^0, x still > n1
                    else return -1;
                } 
                // case b, continue iteration, try x + 1
            }
        }
        return -1;
    }
    
    private int cntBit(long num) {
        int cnt = 0;
        for (int i = 0; i < 64; i++) {
            long x = 1;
            x <<= i;
            if ((x & num) != 0) cnt++;
        }
        return cnt;
    }
}
