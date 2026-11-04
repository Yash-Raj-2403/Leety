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
    TreeNode insert(TreeNode root,int x){
        TreeNode nn = new TreeNode(x);
        if(root == null){
            return nn;
        }else if(root.val>x){
            root.left = insert(root.left,x);
        }else{
            root.right = insert(root.right,x);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int x:preorder){
            root = insert(root,x);
        }
        return root;
    }
}