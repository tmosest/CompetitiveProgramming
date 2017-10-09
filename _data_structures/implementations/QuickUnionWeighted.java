package _data_structures.implementations;

import _data_structures.UnionFindADT;
import commons.OutOfBoundsException;
/**
 * QuickUnionWeighted: 
 * 
 * The goal of this class is to improve on the previous implementation (QuickUnion).
 * 
 * In the previous implementation we created an array to store the parent id of each node.
 * 
 * To determine if two points were connected we found the roots of each node and then saw they were eqaul.
 * 
 * We knew we had found the root of a forest when the index was equal to the value stored in that index.
 * 
 * To make this algorith faster we are going to implement another array that contains weights and look at those too.
 * 
 * @author tmosest (Tyler Moses)
 */
public class QuickUnionWeighted implements UnionFindADT {

	/**
	 * This array determines helps point each index to its parent index.
	 * Starts with each value equal to the arrau index so we know that they are not connected.
	 */
	private int[] parents;
	/**
	 * This array keeps track of how big each tree is getting.
	 * Should start with a value of one for each tree.
	 */
	private int[] weights;
	/**
	 * Public constructor.
	 * Complexity of O(size).
	 * Sets up the parents and weights arrays.
	 * @param size
	 */
	public QuickUnionWeighted(int size) {
		parents = new int[size];
		weights = new int[size];
		for(int i = 0; i < size; i++) {
			parents[i] = i;
			weights[i] = 1;
		}
	}
	/**
	 * This function is the key to the Quick Union Algorithm.
	 * The faster we make this algorithm the better the solution.
	 * In this implementation we ensure that the Algorithm is better
	 * by making the forest flatter.
	 * @param p The point to find the root of.
	 * @return The index of the root node for this point.
	 */
	private int root(int p) {
		while(p != parents[p])
			p = parents[p];
		return p;
	}
	/**
	 * This function determines if two points are connected or not.
	 * @param p One of the points.
	 * @param q The other point.
	 * @throws OutOfBoundsException If either point is outside of the node range.
	 * @return True if the two points are connected and false otherwise.
	 */
	@Override
	public boolean isConnected(int p, int q) throws OutOfBoundsException {
		if(p < 0 || p >= parents.length || q < 0 || q >= parents.length)
			throw new OutOfBoundsException();
		return root(p) == root(q);
	}
	/**
	 * This function links two points by making sure that the root of one points to root of the other.
	 * @param p First point to link.
	 * @param q Second point to link.
	 * @throws OutOfBoundsException If either point is outside of the node range.
	 */
	@Override
	public void union(int p, int q) throws OutOfBoundsException {
		int rootP = root(p);
		int rootQ = root(q);
		// This is how we keep the tree flat.
		// We look at the weights and always make sure that the smaller tree points to the larger.
		if(weights[rootP] > weights[rootQ]) {
			parents[q] = rootP;
			weights[rootP] += weights[rootQ];
		} else {
			parents[p] = rootQ;
			weights[rootQ] += weights[rootP];
		}
	}
	
}
