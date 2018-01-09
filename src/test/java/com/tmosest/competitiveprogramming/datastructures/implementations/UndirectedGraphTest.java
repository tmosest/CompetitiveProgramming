package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.GraphAdt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Graphs: Undirected Graph")
public class UndirectedGraphTest {

  int nodes = 100;
  GraphAdt undirectedGraph;

  @BeforeEach
  void setup() {
    undirectedGraph = new UndirectedGraph(nodes);
    undirectedGraph.addEdge(0, 1);
    undirectedGraph.addEdge(1, 1);
    undirectedGraph.addEdge(2, 1);
    undirectedGraph.addEdge(5, 1);
    undirectedGraph.addEdge(7, 1);
  }

  @Test
  @DisplayName("Can get the number of nodes in the graph")
  void canGetTheNumNodes() {
    Assertions.assertEquals(nodes, undirectedGraph.nodes());
  }

  @Test
  @DisplayName("Can get the number of edges in the graph")
  void canGetTheNumEdges() {
    Assertions.assertEquals(5, undirectedGraph.edges());
  }

  @Test
  @DisplayName("Can iterate over the adjacency matrix")
  void canIterateOverConnectingdges() {
    Iterable<Integer> adj = undirectedGraph.adj(7);
    for (int i : adj) {
      Assertions.assertEquals(1, i);
    }
  }
}
