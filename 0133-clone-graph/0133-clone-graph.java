/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        // {key: old_node, value: new_node}
        // Edge Case:
        if(node == null) return null;
        
        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    // Performs a depth-first search to clone the graph
    private Node dfs(Node node, Map<Node, Node> map) {
        // If the node has already been cloned, return the cloned node
        if (map.containsKey(node))
            return map.get(node);

        // Create a clone of the current node
        Node clone = new Node(node.val, new ArrayList<>());
        map.put(node, clone);

        // Clone the neighbors by recursively calling dfs
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfs(neighbor, map));
        }

        return clone;
    }
}
