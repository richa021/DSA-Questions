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
    public boolean check(TreeNode left, TreeNode right){
        if(left==null && right == null){
            return true;
        }
        
        if(left==null || right==null){
            return false;
        }
        if(left.val==right.val){
            boolean l = check(left.left, right.right);
            boolean r = check(left.right, right.left);
            if(l==true && r==true){
                return true;
            }
            return false;
        }
        return false;
        
    }
    public boolean isSymmetric(TreeNode root) {
        boolean ans = check(root.left, root.right);
        return ans;
    }
}