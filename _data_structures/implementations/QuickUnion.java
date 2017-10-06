package _data_structures.implementations;

import _data_structures.UnionFindADT;
import commons.OutOfBoundsException;

public class QuickUnion implements UnionFindADT {

	/**
	 * In this implementation we think of nodes as a 
	 * nested tree. The value of the node in the array is its parent
	 * If the node value is itself then we have the root of the tree.
	 */
	private int[] parents;
	
	public QuickUnion(int size) {
		parents = new int[size];
		for(int i = 0; i < parents.length; i++) {
			parents[i] = i;
		}
	}
	
	/**
	 * This function is the bread and butter of this approach.
	 * @param p
	 * @return
	 */
	private int findRoot(int p) {
		int root = p;
		while(root != parents[root]) {
			root = parents[root];
		}
		return root;
	}
	
	/**
	 * Check if p and q have the same root.
	 */
	@Override
	public boolean isConnected(int p, int q) throws OutOfBoundsException {
		if(p < 0 || p >= parents.length || q < 0 || q >= parents.length)
			throw new OutOfBoundsException();
		return findRoot(p) == findRoot(q);
	}

	/**
	 * Set the id of p's root to the id of q's root.
	 */
	@Override
	public void union(int p, int q) throws OutOfBoundsException {
		if(p < 0 || p >= parents.length || q < 0 || q >= parents.length)
			throw new OutOfBoundsException();
		int rootQ = findRoot(q);
		int rootP = findRoot(p);
		parents[rootP] = rootQ;
	}

}
