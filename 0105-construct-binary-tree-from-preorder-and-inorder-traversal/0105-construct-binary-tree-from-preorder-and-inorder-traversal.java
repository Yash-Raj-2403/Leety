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
    TreeNode buildtree(int[] pre,int pst, int pend,int[] inor,int inst,int inend,Map<Integer,Integer> mp){
        if(pst>pend || inst>inend) return null;
        TreeNode root = new TreeNode(pre[pst]);
        int pos = mp.get(root.val);
        int nleft = pos-inst;
        root.left = buildtree(pre,pst+1,pst+nleft,inor,inst,pos-1,mp);
        root.right = buildtree(pre,pst+nleft+1,pend,inor,pos+1,inend,mp);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root = buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        return root;
    }
}