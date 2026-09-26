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
    void inorder(TreeNode r1,List<Integer> lst)
    {
        if(r1 == null) return;
        inorder(r1.left,lst);
        lst.add(r1.val);
        inorder(r1.right,lst);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        inorder(root1,l1);
        inorder(root2,l2);
        l1.addAll(l2);
        Collections.sort(l1);
        return l1;
    }
}