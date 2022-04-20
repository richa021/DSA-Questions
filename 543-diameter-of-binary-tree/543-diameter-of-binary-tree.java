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
    
    public class TreeInfo{
        int ht;
        int diam;
        
        public TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    
    public TreeInfo diameter(TreeNode root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        
        int myheight = Math.max(left.ht, right.ht) + 1;
        int dia1 = left.diam;
        int dia2 = right.diam;
        int dia3 = left.ht + right.ht +1;
        
        int mydia = Math.max(dia1, Math.max(dia2,dia3));
        
        return new TreeInfo(myheight,mydia);
    }
        
        
    public int diameterOfBinaryTree(TreeNode root) {
        TreeInfo info = diameter(root);
        return info.diam-1;
    }
}