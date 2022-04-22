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
    int max=Integer.MIN_VALUE;
    public int check(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum = check(root.left);
        //System.out.println(leftsum);
        int rightsum = check(root.right);
        //System.out.println(rightsum);
        
        int sum =  leftsum+rightsum+root.val;
        max=Math.max(max,Math.max(leftsum+root.val, Math.max(rightsum+root.val, Math.max(root.val, sum))));
        //System.out.println(max);
        
       // System.out.println(leftsum+root.val + "  " + rightsum+root.val);
        //System.out.println(Math.max(leftsum+root.val, rightsum+root.val) +"..");
        return Math.max(root.val, Math.max(leftsum+root.val, rightsum+root.val));
        
    }
    public int maxPathSum(TreeNode root) {
        int a = check(root);
        return max;
        
    }
}