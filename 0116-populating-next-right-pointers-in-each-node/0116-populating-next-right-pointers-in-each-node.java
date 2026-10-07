/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            Node prev = null;
            for(int i=0;i<n;i++){
                Node c = q.poll();
                if(prev !=null){
                    prev.next = c;
                }
                prev = c;
                if(c.left!= null) q.add(c.left);
                if(c.right != null) q.add(c.right);
            }
            prev.next = null;
        }
        return root;
    }
}