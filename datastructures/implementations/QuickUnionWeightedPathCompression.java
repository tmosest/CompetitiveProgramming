package datastructures.implementations;

import commons.OutOfBoundsException;
import datastructures.UnionFindADT;

/**
 * Another implementation of Union Find.
 * 
 * This version improves upon the Weighted Version by adding Path Compression to it.
 * 
 * Path Compressions helps to to keep the tree flat by pointing the nodes to the root as we try to find it.
 * 
 * There is really no reason not to do this since it really only adds one line of code.
 * 
 * @author tmosest
 */
public class QuickUnionWeightedPathCompression implements UnionFindADT {

	private int[] parents;
	private int[] weights;
	
	public QuickUnionWeightedPathCompression(int size) {
		parents = new int[size];
		weights = new int[size];
		
		for(int i = 0; i < size; i++) {
			parents[i] = i;
			weights[i] = 1;
		}
	}
	
	/**
	 * Function to find the root of a node p.
	 * The main difference between this implementation and the last two is path compression.
	 * @param p The node we are looking for the root of.
	 * @return The root of node p.
	 */
	private int root(int p) {
		while(p != parents[p]) {
			p = parents[p];
			// This next line is all we need for compression!
			parents[p] = parents[parents[p]];
		}
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
	 * This version includes the improvement of the previous Weighted version.
	 * @param p First point to link.
	 * @param q Second point to link.
	 * @throws OutOfBoundsException If either point is outside of the node range.
	 */
	@Override
	public void union(int p, int q) throws OutOfBoundsException {
		if(p < 0 || p >= parents.length || q < 0 || q >= parents.length)
			throw new OutOfBoundsException();
		int rootP = root(p);
		int rootQ = root(q);
		// Weighted part!
		if(weights[rootP] < weights[rootQ]) {
			parents[rootP] = rootQ;
			weights[rootQ] += weights[rootP];
		} else {
			parents[rootQ] = rootP;
			weights[rootP] += weights[rootQ];
		}
	}

}
