package  com.tmosest.competitiveprogramming.leetcode;

class MultiplesOfThreeAndFive {

	// This is the brute force way of doing it and it will not work!
	// Instead what we need to do is use Gauss' sum formula. We count the multiples of 3 using it and then also sum the 5's and remove the 15's.
	// The sum from 1 to n is n * (n + 1) / 2
	// First we need to get all multiples below a number. Below 10 there is 3, 6, 9 because 10/3 = 3 when floored and there sum is 3( 1 + 2 + 3).
	// So we need 3(1 + 2 + ... + n / 3) + 5(1 + 2 + ... + n / 5) - 15(1 + 2 + ... + n / 15)
	public long sumOf3and5BelowNumber(int num) { 
		/* 
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (i % 3 == 0)
				sum += i;

			else if (i % 5 == 0)
				sum += i;		
		}

		return sum;
		*/
		// The formulas below are inclusive so we decrement by 1.
		num = num - 1;
		return sumofMultBelowNumber(num, 3) + sumofMultBelowNumber(num, 5) - sumofMultBelowNumber(num, 15);
	}

	public long gaussSum(long n) {
		return (n * (n + 1)) / 2;
	}

	public long sumofMultBelowNumber(long num, long mult) {
		return mult * gaussSum(num / mult);
	}
}
