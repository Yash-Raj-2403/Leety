/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return -1;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode c = q.poll();
                l.add(c.val);
                if(c.left != null) q.add(c.left);
                if(c.right != null) q.add(c.right);
            }
            lst.add(l);
        }
        int n = lst.size();
        return lst.get(n-1).get(0);
    }
}