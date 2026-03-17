class Solution {

    public static int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // LEFT → RIGHT
    public static void leftToRight(TreeNode root, int n, List<Integer> list){
        if(root == null) return;

        if(n == 1){
            list.add(root.val);
            return;
        }

        leftToRight(root.left, n-1, list);
        leftToRight(root.right, n-1, list);
    }

    // RIGHT → LEFT
    public static void rightToLeft(TreeNode root, int n, List<Integer> list){
        if(root == null) return;

        if(n == 1){
            list.add(root.val);
            return;
        }

        rightToLeft(root.right, n-1, list);
        rightToLeft(root.left, n-1, list);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int h = height(root);

        for(int i = 1; i <= h; i++){
            List<Integer> level = new ArrayList<>();

            if(i % 2 == 0){
                rightToLeft(root, i, level); // even → RTL
            } else {
                leftToRight(root, i, level); // odd → LTR
            }

            ans.add(level);
        }

        return ans;
    }
}