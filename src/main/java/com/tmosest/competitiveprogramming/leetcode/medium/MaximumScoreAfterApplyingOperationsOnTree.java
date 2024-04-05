package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class MaximumScoreAfterApplyingOperationsOnTree {
	/**
	 * https://leetcode.com/problems/maximum-score-after-applying-operations-on-a-tree/description/
	 * 
	 * https://leetcode.com/problems/maximum-score-after-applying-operations-on-a-tree/solutions/4250400/recursion-dfs-short-and-easy/
	 * 
	 * @param edges
	 * @param values
	 * @return
	 */
	public long maximumScoreAfterOperations(int[][] edges, int[] values) {
        int n = values.length;
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++)
            graph[i] = new ArrayList<>();
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        // array 0 - maxScore after preserving, 1 - sum
        long[] ans = dfs(graph, 0, -1, values);
        return ans[0];
    }

    private long[] dfs(List<Integer>[] graph, int node, int parent, int[] values){
        
        long sum = values[node];
        
        if(graph[node].size() == 1 && graph[node].get(0) == parent)
            return new long[]{0, sum};
        
        long score = values[node];
        
        for(int child : graph[node]){
            if(child == parent)
                continue;
            long[] ans = dfs(graph, child, node, values); 
            sum += ans[1];
            score += ans[0];
        }
        return new long[]{Math.max(score, sum - values[node]), sum};
    }
}
