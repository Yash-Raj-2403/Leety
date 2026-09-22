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
    void adda(TreeNode root, List<Integer> lst)
    {
        if(root == null) return;
        lst.add(root.val);
        adda(root.left,lst);
        adda(root.right,lst);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> lst = new ArrayList<>();
        adda(root,lst);
        int sum=0;
        for(int x:lst)
        {
            if(x>=low && x<=high)
            {
                sum+=x;
            }
        }
        return sum;
    }
}