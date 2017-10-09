package _data_structures.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import _data_structures.UnionFindADT;
import _data_structures.implementations.QuickUnionWeighted;
import commons.OutOfBoundsException;

public class QuickUnionWeightedTest {
	
	int size = 10;
	UnionFindADT uf;
	
	@Before
	public void setUp() {
		uf = new QuickUnionWeighted(10);
	}

	@Test
	public void testIsConnectedForNewUF() throws OutOfBoundsException {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i == j) {
					// Test Reflexive Property.
					Assert.assertTrue(uf.isConnected(i, j));
				} else {
					// Otherwise shouldn't be connected.
					Assert.assertFalse(uf.isConnected(i, j));
				}
			}
		}
	}

	@Test
	public void testUnion() throws OutOfBoundsException {
		uf.union(0, 1);
		Assert.assertTrue(uf.isConnected(0, 1));
		// Test Transitivity
		uf.union(1, 2);
		Assert.assertTrue(uf.isConnected(0, 2));
	}

}
