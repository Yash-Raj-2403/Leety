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
    // void inorder(TreeNode root, List<Integer> lst)
    // {
    //     if(root == null) return;
    //     inorder(root.left,lst);
    //     lst.add(root.val);
    //     inorder(root.right,lst);
    // }
    int leftheight(TreeNode root)
    {
        if(root == null) return 0;
        int hl=0;
        while(root!=null)
        {
            hl++;
            root = root.left;
        }
        return hl;
    }
    int rightheight(TreeNode root)
    {
        if(root == null) return 0;
        int hl=0;
        while(root!=null)
        {
            hl++;
            root = root.right;
        }
        return hl;
    }
    public int countNodes(TreeNode root) {
        // List<Integer> lst = new ArrayList<>();
        // inorder(root,lst);
        // return lst.size()   ;
        if(root == null) return 0;
        int lh = leftheight(root);
        int rh = rightheight(root);
        if(rh == lh) return (1 << lh)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}