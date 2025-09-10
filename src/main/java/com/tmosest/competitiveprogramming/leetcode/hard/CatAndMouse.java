package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CatAndMouse {
	/*
	 * 913. Cat and Mouse
	 * 
	 * https://leetcode.com/problems/cat-and-mouse/description/
	 * 
	 * A game on an undirected graph is played by two players, Mouse and Cat, who
	 * alternate turns.
	 * 
	 * The graph is given as follows: graph[a] is a list of all nodes b such that ab
	 * is an edge of the graph.
	 * 
	 * The mouse starts at node 1 and goes first, the cat starts at node 2 and goes
	 * second, and there is a hole at node 0.
	 * 
	 * During each player's turn, they must travel along one�edge of the graph that
	 * meets where they are.� For example, if the Mouse is at node 1, it must travel
	 * to any node in graph[1].
	 * 
	 * Additionally, it is not allowed for the Cat to travel to the Hole (node 0).
	 * 
	 * Then, the game can end in three�ways:
	 * 
	 * If ever the Cat occupies the same node as the Mouse, the Cat wins.
	 * If ever the Mouse reaches the Hole, the Mouse wins.
	 * If ever a position is repeated (i.e., the players are in the same position as
	 * a previous turn, and�it is the same player's turn to move), the game is a
	 * draw.
	 * Given a graph, and assuming both players play optimally, return
	 * 
	 * 1�if the mouse wins the game,
	 * 2�if the cat wins the game, or
	 * 0�if the game is a draw.
	 * �
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
	 * Output: 0
	 * Example 2:
	 * 
	 * 
	 * Input: graph = [[1,3],[0],[3],[0,2]]
	 * Output: 1
	 * �
	 * 
	 * Constraints:
	 * 
	 * 3 <= graph.length <= 50
	 * 1�<= graph[i].length < graph.length
	 * 0 <= graph[i][j] < graph.length
	 * graph[i][j] != i
	 * graph[i] is unique.
	 * The mouse and the cat can always move.
	 * 
	 * https://leetcode.com/problems/cat-and-mouse/solutions/3224728/java-easy-top-
	 * down-dp-by-code_alone-3jdt/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/3108176/913-cat-and-
	 * mouse-by-stormsunshine-yzt2/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/3606518/java-solution-
	 * with-approach-beats-80-by-oqqbh/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/3514720/solution-by-
	 * deleted_user-q5qf/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/3241876/java-easy-
	 * solution-0sec-by-sadanandsidhu-j64l/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/6151525/cat-mouse-
	 * problem-1-by-shubhadeep23-wbnh/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/6215698/913-cat-and-
	 * mouse-by-g8xd0qpqty-r94b/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/6525109/java-optimal-
	 * solution-by-heyysankalp-knne/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/6366982/beats-9939-by-
	 * rhyd3dxa6x-h1n9/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/5894695/java-bfs-
	 * solution-by-realhandle-2o0y/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/4532774/cat-and-mouse-
	 * by-muskan_chaudhary01-zj8d/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/3512317/java-solution-
	 * with-by-safo-samson-hof6/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/2203459/java-draw-is-
	 * kinda-tricky-short-solution-868u/
	 * https://leetcode.com/problems/cat-and-mouse/solutions/1949123/cat-and-mouse-
	 * solution-java-by-bhupendra-bsb7/
	 */
	/* public int catMouseGame(int[][] graph) */
    public int catMouseGame(int[][] graph) {
        int N = graph.length;
        final int DRAW = 0, MOUSE = 1, CAT = 2;

        int[][][] color = new int[50][50][3];
        int[][][] degree = new int[50][50][3];

        // degree[node] : the number of neutral children of this node
        for (int m = 0; m < N; ++m)
            for (int c = 0; c < N; ++c) {
                degree[m][c][1] = graph[m].length;
                degree[m][c][2] = graph[c].length;
                for (int x: graph[c]) if (x == 0) {
                    degree[m][c][2]--;
                    break;
                }
            }

        // enqueued : all nodes that are colored
        Queue<int[]> queue = new LinkedList();
        for (int i = 0; i < N; ++i)
            for (int t = 1; t <= 2; ++t) {
                color[0][i][t] = MOUSE;
                queue.add(new int[]{0, i, t, MOUSE});
                if (i > 0) {
                    color[i][i][t] = CAT;
                    queue.add(new int[]{i, i, t, CAT});
                }
            }

        // percolate
        while (!queue.isEmpty()) {
            // for nodes that are colored :
            int[] node = queue.remove();
            int i = node[0], j = node[1], t = node[2], c = node[3];
            // for every parent of this node i, j, t :
            for (int[] parent: parents(graph, i, j, t)) {
                int i2 = parent[0], j2 = parent[1], t2 = parent[2];
                // if this parent is not colored :
                if (color[i2][j2][t2] == DRAW) {
                    // if the parent can make a winning move (ie. mouse to MOUSE), do so
                    if (t2 == c) {
                        color[i2][j2][t2] = c;
                        queue.add(new int[]{i2, j2, t2, c});
                    } else {
                        // else, this parent has degree[parent]--, and enqueue
                        // if all children of this parent are colored as losing moves
                        degree[i2][j2][t2]--;
                        if (degree[i2][j2][t2] == 0) {
                            color[i2][j2][t2] = 3 - t2;
                            queue.add(new int[]{i2, j2, t2, 3 - t2});
                        }
                    }
                }
            }
        }

        return color[1][2][1];
    }

    // What nodes could play their turn to
    // arrive at node (m, c, t) ?
    public List<int[]> parents(int[][] graph, int m, int c, int t) {
        List<int[]> ans = new ArrayList();
        if (t == 2) {
            for (int m2: graph[m])
                ans.add(new int[]{m2, c, 3-t});
        } else {
            for (int c2: graph[c]) if (c2 > 0)
                ans.add(new int[]{m, c2, 3-t});
        }
        return ans;
    }
}
