# Breadth First Search

A fundamental graph search algorithm that explorers all the verticles in a graph and find the shortest path between two nodes.

Commonly used for pathfinding, connected component, shortest path problems, etc.

When used on graphs there is a chance for cycles so we need to mark which ones we have visited before.

## History:

BFS and its application in finding connected components of graphs were invented in 1945 by Konrad Zuse, in his (rejected) Ph.D. thesis on the Plankalkül programming language, but this was not published until 1972. It was reinvented in 1959 by Edward F. Moore, who used it to find the shortest path out of a maze, and later developed by C. Y. Lee into a wire routing algorithm (published in 1961).

## Sudo Code:

We use a queue to process videos.

```
procedure BFS(G, root) is
       let Q be a queue
       label root as explored
       Q.enqueue(root)
       while Q is not empty do
            v := Q.dequeue()
            if v is the goal then
                return v
           for all edges from v to w in G.adjacentEdges(v) do
                if w is not labeled as explored then
                    label w as explored
                    w.parent := v
                    Q.enqueue(w)
```

This non-recursive implementation is similar to the non-recursive implementation of depth-first search, but differs from it in two ways:
1. it uses a queue (First In First Out) instead of a stack (Last In First Out) and
2. it checks whether a vertex has been explored before enqueueing the vertex rather than delaying this check until the vertex is dequeued from the queue.

## Explanation:

![BFS](../../images/graphs/bfs-1.png)

1. Initially queue and visited arrays are empty.
2. Push node 0 into queue and mark it visited.
3. Remove node 0 from the front of queue and visit the unvisited neighbours and push them into queue.
4. Remove node 1 from the front of queue and visit the unvisited neighbours and push them into queue.
5. Remove node 2 from the front of queue and visit the unvisited neighbours and push them into queue.
6. Remove node 3 from the front of queue and visit the unvisited neighbours and push them into queue. 
As we can see that every neighbours of node 3 is visited, so move to the next node that are in the front of the queue.
7. Remove node 4 from the front of queue and visit the unvisited neighbours and push them into queue. 
As we can see that every neighbours of node 4 are visited, so move to the next node that is in the front of the queue.

## Complexity:
The time complexity is `O(V + E)` where `V` is the number of vertices and `E` is the number of edges. Note: `E` may vary between `O(1)` & `O(V^2)`.

Typically for graphs, we will also need some way of tracking which vertices we have visited. If we know before hand `V` then we will typically create an array of size `V`. Making a space complexity of `O(V)`.

## Applications:
- Copying garbage collection, Cheney's algorithm
- Finding the shortest path between two nodes u and v, with path length measured by number of edges (an advantage over depth-first search)[14]
- (Reverse) Cuthill–McKee mesh numbering
- Ford–Fulkerson method for computing the maximum flow in a flow network
- Serialization/Deserialization of a binary tree vs serialization in sorted order, allows the tree to be re-constructed in an efficient manner.
- Construction of the failure function of the Aho-Corasick pattern matcher.
- Testing bipartiteness of a graph.
- Implementing parallel algorithms for computing a graph's transitive closure.

## Examples:
- TODO

## Code Samples:

### Java

```
import java.util.LinkedList;
import java.util.Queue;
 
// Class to represent a graph using adjacency list
class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;
 
    @SuppressWarnings("unchecked") Graph(int vertices)
    {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjList[i] = new LinkedList<>();
    }
 
    // Function to add an edge to the graph
    void addEdge(int u, int v) { adjList[u].add(v); }
 
    // Function to perform Breadth First Search on a graph
    // represented using adjacency list
    void bfs(int startNode)
    {
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
 
        // Mark the current node as visited and enqueue it
        visited[startNode] = true;
        queue.add(startNode);
 
        // Iterate over the queue
        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");
 
            // Get all adjacent vertices of the dequeued
            // vertex currentNode If an adjacent has not
            // been visited, then mark it visited and
            // enqueue it
            for (int neighbor : adjList[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
 
public class Main {
    public static void main(String[] args)
    {
        // Number of vertices in the graph
        int vertices = 5;
 
        // Create a graph
        Graph graph = new Graph(vertices);
 
        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
 
        // Perform BFS traversal starting from vertex 0
        System.out.print(
            "Breadth First Traversal starting from vertex 0: ");
        graph.bfs(0);
    }
}
```

## References:
- [Geeks4Geeks BFS](https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/)
- [Wikipedia](https://en.wikipedia.org/wiki/Breadth-first_search)