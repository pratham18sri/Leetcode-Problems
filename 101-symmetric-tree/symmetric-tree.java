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
    // same tree
     public boolean sametree(TreeNode a,TreeNode b){
        if( a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val!=b.val) return false;
        return sametree(a.left,b.left)&& sametree(a.right ,b.right);
     }
     // inver tree
     public TreeNode inverttree( TreeNode a){
        if(a==null) return null;
        TreeNode temp=a.left;
        a.left=a.right;
        a.right=temp;
        inverttree(a.left);
        inverttree(a.right);
        return a;
     }
    public boolean isSymmetric(TreeNode root) {
        root.left=inverttree(root.left); 
        // left sub tree ko inver karenge to bo bhi right i tara ho jayegi ager fir check kar leneg inverted left subtree right k equal hai ki nhi bus 
        return sametree(root.left,root.right);
    }
}