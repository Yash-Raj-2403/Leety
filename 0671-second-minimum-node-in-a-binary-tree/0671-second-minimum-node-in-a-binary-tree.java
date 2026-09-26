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
    void inorder(TreeNode r, List<Integer> lst){
        if(r == null) return ;
        inorder(r.left,lst);
        lst.add(r.val);
        inorder(r.right,lst);
    }
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        inorder(root,lst);
        Set<Integer> s = new TreeSet<>(lst);
        if(s.size() == 1) return -1;
        List<Integer> ls = new ArrayList<>(s);
        return ls.get(1);
    }
}