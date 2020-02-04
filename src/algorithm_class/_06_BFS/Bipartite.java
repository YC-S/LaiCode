package algorithm_class._06_BFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

// Determine if an undirected graph is bipartite. A bipartite graph is one in which the nodes can be
// divided into two groups such that no nodes have direct edges to other nodes in the same group.
//
// Examples
//
// 1  --   2
//
//    /
//
// 3  --   4
//
// is bipartite (1, 3 in group 1 and 2, 4 in group 2).
//
// 1  --   2
//
//    /   |
//
// 3  --   4
//
// is not bipartite.
//
// Assumptions
//
// The graph is represented by a list of nodes, and the list of nodes is not null.
public class Bipartite {

  public static boolean isBipartite(List<GraphNode> graph) {
    Map<GraphNode, Integer> visited = new HashMap<>();
    for (GraphNode node : graph) {
      if (!BFS(node, visited)) {
        return false;
      }
    }
    return true;
  }

  private static boolean BFS(GraphNode node, Map<GraphNode, Integer> visited) {
    if (visited.containsKey(node)) {
      return true;
    }
    Queue<GraphNode> queue = new LinkedList<>();
    queue.offer(node);
    visited.put(node, 0);
    while (!queue.isEmpty()) {
      GraphNode cur = queue.poll();
      int curGroup = visited.get(cur);
      int neiGroup = curGroup == 0 ? 1 : 0;
      for (GraphNode nei : cur.neighbors) {
        if (!visited.containsKey(nei)) {
          visited.put(nei, neiGroup);
          queue.offer(nei);
        } else if (visited.get(nei) != neiGroup) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    GraphNode g1 = new GraphNode(1);
    GraphNode g2 = new GraphNode(2);
    GraphNode g3 = new GraphNode(3);
    GraphNode g4 = new GraphNode(4);
    g1.neighbors.add(g2);
    g2.neighbors.add(g1);
    g2.neighbors.add(g3);
    g3.neighbors.add(g2);
    g2.neighbors.add(g4);
    g4.neighbors.add(g2);
    g3.neighbors.add(g4);
    g4.neighbors.add(g3);
    List<GraphNode> graph = new LinkedList<>();
    graph.add(g1);
    graph.add(g2);
    graph.add(g3);
    graph.add(g4);

    System.out.println(isBipartite(graph));
  }
}
