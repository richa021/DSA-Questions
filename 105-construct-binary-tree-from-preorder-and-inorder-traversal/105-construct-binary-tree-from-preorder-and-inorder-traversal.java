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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        
        TreeNode root = buildTree(preorder,0,preorder.length-1, inorder, 0, inorder.length-1, map);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int 
                             inEnd, Map<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd)
            return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int inroot= map.get(root.val);
        int numleft = inroot-inStart;
        
        root.left = buildTree(preorder, preStart+1, preStart + numleft, inorder, inStart, inroot-1, map);
        
        root.right = buildTree(preorder, preStart + numleft+1, preEnd, inorder, inroot+1, inEnd, map);
        
        return root;
    }
    
}