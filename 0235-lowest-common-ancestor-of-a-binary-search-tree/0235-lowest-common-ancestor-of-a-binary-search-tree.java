/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    boolean helper(TreeNode root, TreeNode p, List<TreeNode> lst) {
        if (root == null)
            return false;
        lst.add(root);
        if (root == p) {
            //lst.add(root); 
            return true;
        }
        boolean lans = helper(root.left, p, lst);
        if (lans)
            return true;
        boolean rans = helper(root.right, p, lst);
        if (rans)
            return true;
        lst.remove(lst.size() - 1);
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> p1 = new ArrayList<>();
        helper(root, p, p1);
        List<TreeNode> q1 = new ArrayList<>();
        helper(root, q, q1);
        int n = Math.min(p1.size(), q1.size());
        TreeNode ans = null;
        for (int i = 0; i < n; i++) {
            if (p1.get(i) == q1.get(i)) {
                ans = p1.get(i);
            }
        }
        return ans;
    }
}