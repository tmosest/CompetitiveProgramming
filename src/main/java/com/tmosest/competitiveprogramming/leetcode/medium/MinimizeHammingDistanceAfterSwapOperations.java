package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;

class MinimizeHammingDistanceAfterSwapOperations {
	//DSU to store root of conected compoenents
    private int[] parent;
	private int[] rank;
    
	private int find(int u){
        if(parent[u] == u) return u;

        return parent[u] = find(parent[u]);
    }

    private void union(int u, int v){
        int lu = find(u), lv = find(v);
        if( lu != lv){
            if( rank[lu]> rank[lv])
                parent[lv] = lu;
            else if( rank[lu] < rank[lv])
                parent[lu] = lv;
            else{
                parent[lv] = lu;
                rank[lu]++;
            }
        }
    } 
    /**
	 * https://leetcode.com/contest/weekly-contest-223/problems/minimize-hamming-distance-after-swap-operations/
	 * @param source
	 * @param target
	 * @param allowedSwaps
	 * @return
	 */
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        parent = new int[n];
        rank = new int[n];
        for( int i = 0; i < n; i++) parent[i] = i;
        //making DSU
        for( int[] swap : allowedSwaps){
            union(swap[0], swap[1]);
        }
        //adding source values of connected components to same map of their root
        HashMap<Integer, Integer>[] maps = new HashMap[n];
        for( int i = 0; i < n; i++){
            int root = find(i);
            if( maps[root] == null) maps[root] = new HashMap<>();
            maps[root].put(source[i], maps[root].getOrDefault(source[i], 0)+1);
        }
        //if we found the target value in the hashmap of the root of the component(node) then we will decrease the count and if count ==1 remove the source value from map and if not found increase hd(hamming distance)
        int hd = 0;
        for( int i = 0; i < n; i++){
            int root = find(i);
            if( maps[root].containsKey(target[i])){
                int freq = maps[root].get(target[i]);
                if( freq == 1)
                    maps[root].remove(target[i]);
                else
                    maps[root].put(target[i], freq-1);
            }else{
                hd++;
            }
        }
        return hd;
    }
}
