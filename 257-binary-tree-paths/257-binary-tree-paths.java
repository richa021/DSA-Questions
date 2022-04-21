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
    List<String> list = new ArrayList<>();
    
    public void findPaths(TreeNode root, String s){
        if(root==null){
            return;
        }
        s+=root.val;
        
        if(root.left==null && root.right==null){
            list.add(s);
        }
        else{
            s+="->";
        }
        findPaths(root.left,s);
        findPaths(root.right,s);
    }
    
    
    public List<String> binaryTreePaths(TreeNode root) {
        findPaths(root,"");
        return list;
    }
}