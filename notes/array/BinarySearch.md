# Binary Search

This is a searching algorith that divides the array in half over and over again until we find the desired result. 

In my old math classes we called this lion hunting. If you want a lion in Africa we can start by diving Africa into North and South.

## Explanation:

- Divide the search space into two halves by finding the middle index “mid”. 
- Compare the middle element of the search space with the key. 
- If the key is found at middle element, the process is terminated.
- If the key is not found at middle element, choose which half will be used as the next search space.
    - If the key is smaller than the middle element, then the left side is used for next search.
    - If the key is larger than the middle element, then the right side is used for next search.
- This process is continued until the key is found or the total search space is exhausted.

We can implement both iterative and recursive version of this algorithm.

## Iterative Binary Search Algorithm:

Here we use a while loop to continue the process of comparing the key and splitting the search space in two halves.

```java
// Java implementation of iterative Binary Search

import java.io.*;

class BinarySearch {

	// Returns index of x if it is present in arr[].
	int binarySearch(int arr[], int x)
	{
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// If we reach here, then element was
		// not present
		return -1;
	}

	// Driver code
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println(
				"Element is not present in array");
		else
			System.out.println("Element is present at "
							+ "index " + result);
	}
}
```

## Recursive  Binary Search Algorithm:

Create a recursive function and compare the mid of the search space with the key. And based on the result either return the index where the key is found or call the recursive function for the next search space.

```java
// Java implementation of recursive Binary Search
class BinarySearch {

	// Returns index of x if it is present in arr[l..
	// r], else return -1
	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver code
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println(
				"Element is not present in array");
		else
			System.out.println(
				"Element is present at index " + result);
	}
}
/* This code is contributed by Rajat Mishra */
```

## Examples:
- [LeetCode: 3007. Maximum Number That Sum of the Prices Is Less Than or Equal to K (med)](https://leetcode.com/problems/maximum-number-that-sum-of-the-prices-is-less-than-or-equal-to-k/description/)
- [LeetCode: 3008. Find Beautiful Indices in the Given Array II (hard)](https://leetcode.com/problems/find-beautiful-indices-in-the-given-array-ii/description/)

## References
- [Geeks4Geeks](https://www.geeksforgeeks.org/binary-search/)