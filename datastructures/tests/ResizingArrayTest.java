package datastructures.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import datastructures.implementations.ResizingArray;

public class ResizingArrayTest {
	
	ResizingArray<Double> doubleArray;
	ResizingArray<Integer> intArray;
	ResizingArray<String> stringArray;
	
	@Before
	public void setUp() {
		doubleArray = new ResizingArray<Double>();
		intArray = new ResizingArray<Integer>();
		stringArray = new ResizingArray<String>();
	}
	
	@Test
	public void test_canCreateArraysOfDifferentTypes() {
		Assert.assertNotNull(doubleArray);
		Assert.assertNotNull(intArray);
		Assert.assertNotNull(stringArray);		
	}

	@Test
	public void test_SizeShouldBeZeroForNewEmptyArray() {
		Assert.assertTrue(doubleArray.isEmpty());
		Assert.assertEquals(0, doubleArray.size());
		Assert.assertTrue(intArray.isEmpty());
		Assert.assertEquals(0, intArray.size());
		Assert.assertTrue(stringArray.isEmpty());
		Assert.assertEquals(0, stringArray.size());
	}
	
	@Test
	public void test_SizeShouldBeEqualToNumberOfItemsAdded() {
		int n = 0;
		Assert.assertTrue(doubleArray.isEmpty());
		doubleArray.push(1.00);
		++n;
		doubleArray.push(2.00);
		++n;
		Assert.assertEquals(2, doubleArray.size());
		double number = 1.00;
		for(int i = 0; i < 20; i++) {
			++n;
			number += i;
			doubleArray.push(number);
		}
		Assert.assertEquals(n, doubleArray.size());
		Assert.assertEquals((Double) number, doubleArray.peek());
	}
}
