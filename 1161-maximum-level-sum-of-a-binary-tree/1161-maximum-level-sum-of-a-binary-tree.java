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
    public int maxLevelSum(TreeNode root) {
        int ans =0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return 0;
        q.add(root);
        List<Integer> l = new ArrayList<>();
        while(!q.isEmpty()){
            int n = q.size();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            l.add(sum);
        }
        List<Integer> sorted = new ArrayList<>(l);
        Collections.sort(sorted);
        int maxa = sorted.get(sorted.size()-1);
        for(int i=0;i<l.size();i++)
        {
            if(maxa == l.get(i))
            {
                return i+1;
            }
        }
        return 0;
    }
}