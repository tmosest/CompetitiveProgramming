package  com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;


class EvenFibonacciNumbers {

	private List<Long> fibonacciNumbers = new ArrayList<>();

	private void generateFibonacciNumbers(long num) {
		
		if (fibonacciNumbers.size() == 0) {
			fibonacciNumbers.add(1L);
			fibonacciNumbers.add(1L);
		}

		long last = fibonacciNumbers.get(fibonacciNumbers.size() - 1);

		if (last < num) {
			fibonacciNumbers.add(fibonacciNumbers.get(fibonacciNumbers.size() - 1) + fibonacciNumbers.get(fibonacciNumbers.size() - 2));
			generateFibonacciNumbers(num);
		}
	}
	
	public long sumEvenFibonacci(long num) { 
		generateFibonacciNumbers(num);

		long sum = 0;

		for (long f : fibonacciNumbers) {
			
			if (f >= num) {
				break;
			}
			
			if (f % 2 == 0)
				sum += f;
		}

		return sum;
	}

}
