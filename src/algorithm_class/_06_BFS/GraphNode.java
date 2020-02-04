package algorithm_class._06_BFS;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

  public int key;
  public List<GraphNode> neighbors;

  public GraphNode(int key) {
    this.key = key;
    this.neighbors = new ArrayList<GraphNode>();
  }
}
