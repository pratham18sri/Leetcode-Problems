class Solution {

    public static int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void nthlevel(TreeNode root, int n, List<Integer> list, boolean leftToRight){
        if(root == null) return;

        if(n == 1){
            list.add(root.val);
            return;
        }

        if(leftToRight){
            nthlevel(root.left, n-1, list, leftToRight);
            nthlevel(root.right, n-1, list, leftToRight);
        } else {
            nthlevel(root.right, n-1, list, leftToRight);
            nthlevel(root.left, n-1, list, leftToRight);
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int h = height(root);

        boolean leftToRight = true;

        for(int i = 1; i <= h; i++){
            List<Integer> level = new ArrayList<>();
            nthlevel(root, i, level, leftToRight);
            ans.add(level);
            leftToRight = !leftToRight; // flip direction
        }

        return ans;
    }
}