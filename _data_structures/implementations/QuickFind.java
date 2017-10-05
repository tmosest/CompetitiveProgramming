package _data_structures.implementations;

import _data_structures.UnionFindADT;
import commons.OutOfBoundsException;

public class QuickFind implements UnionFindADT {

	int[] ids;
	
	public QuickFind(int n) {
		ids = new int[n];
		for(int i = 0; i < n; i++) {
			ids[i] = i;
		}
	}
	
	@Override
	public boolean isConnected(int p, int q) throws OutOfBoundsException {
		if(p < 0 || p >= ids.length || q < 0 || q >= ids.length)
			throw new OutOfBoundsException();
		return ids[p] == ids[q];
	}

	@Override
	public void union(int p, int q) throws OutOfBoundsException {
		if(p < 0 || p >= ids.length || q < 0 || q >= ids.length)
			throw new OutOfBoundsException();
		int pId = ids[p];
		int qId = ids[q]; // what was wrong with my other approach it has one less variable.
		for(int i = 0; i < ids.length; i++) {
			if(ids[i] == pId) {
				ids[i] = qId;
			}
		}
	}
}
