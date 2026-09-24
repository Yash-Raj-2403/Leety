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
    void inorder(TreeNode root,List<Integer> lst)
    {
        if(root == null) return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> lst = new ArrayList<>();
        inorder(root,lst);
        int l=0,r=lst.size()-1;

        while(l<r)
        {
            int sum = lst.get(l)+lst.get(r);
            if(sum == k) return true;
            if(sum>k) r--;
            if(sum<k) l++;
        }
        return false;
    }
}