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
    int getSize(TreeNode root)
    {
        if(root == null) return 0;
        return 1+getSize(root.left)+getSize(root.right);
    }
    void inorder(TreeNode root, List<Integer> lst)
    {
        if(root == null) return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
    public boolean isValidBST(TreeNode root) {
        int n = getSize(root);
        List<Integer> lst = new ArrayList<>();
        inorder(root,lst);
        for(int i=0;i<lst.size()-1;i++)
        {
            if(lst.get(i)>=lst.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}