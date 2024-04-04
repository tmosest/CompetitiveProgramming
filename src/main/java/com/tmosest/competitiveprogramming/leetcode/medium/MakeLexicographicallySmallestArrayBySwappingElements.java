package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class MakeLexicographicallySmallestArrayBySwappingElements {
	/**
	 * https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/
	 * 
	 * https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/solutions/4330395/dsu-sorting-o-n-logn/
	 * 
	 * @param a
	 * @param limit
	 * @return
	 */
	public int[] lexicographicallySmallestArray(int[] a, int limit) {
        int n = a.length;
        
        int[][] b = new int[n][2];
        for(int i=0; i<n; i++) {
            b[i][0] = a[i];
            b[i][1] = i;
        }
        
        Arrays.sort(b, (p, q)->{
            return p[0]-q[0];
        });
        
        DSU dsu = new DSU(n);
        
        for(int i=1; i<n; i++) {
            if (b[i][0]-b[i-1][0]<=limit) {
                dsu.union(b[i][1], b[i-1][1]);
            }
        }
        
        Map<Integer, List<Integer>> subtrees = new HashMap<>();
        for(int i=0; i<n; i++) subtrees.put(i, new ArrayList<>());
        for(int i=0; i<n; i++) {
            subtrees.get(dsu.root(i)).add(i);
        }
       
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++) {
            if (dsu.root(i)!=i) continue;
            List<int[]> component = new ArrayList<>();
            for(int j: subtrees.get(i)) {
                component.add(new int[]{j, a[j]});
            }
            Collections.sort(component, (p, q)->p[1]-q[1]);
            
            for(int j=0; j<component.size(); j++) {
                ans[subtrees.get(i).get(j)] = component.get(j)[1];
            }
        }
        return ans;
    }
    
    private  class DSU {
		private int[] id;
		private int[] size;
		private int n;
		private long count;

		public DSU(int n) {
			this.n = n;
			id = new int[n];
			size = new int[n];

			for (int i = 0; i < n; i++) {
				id[i] = i;
				size[i] = 1;
			}
		}

		public int root(int u) {
			while (u != id[u]) {
				id[u] = id[id[u]];
				u = id[u];
			}
			return u;
		}
        
        public boolean connected(int u, int v) {
            return root(u)==root(v);
        }

		public void union(int u, int v) {
			if (connected(u, v))
				return;

			int p = root(u);
			int q = root(v);

			count -= size[p] * 1L * (size[p] - 1);
			count -= size[q] * 1L * (size[q] - 1);

			id[p] = q;
			size[q] += size[p];
			count += size[q] * 1L * (size[q] - 1);
		}

	}
}
