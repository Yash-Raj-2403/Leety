/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    void helper(Node root, List<Integer> lst)
    {
        if(root == null) return;
        for(Node c:root.children)
        {
            helper(c,lst);
        }
        lst.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> lst = new ArrayList<>();
        helper(root,lst);
        return lst;
    }
}