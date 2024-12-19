package Tree;

public class Day41DiameterOfBinaryTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs (root);
        return res;
    }
    private int dfs (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs (root.left);
        int right = dfs (root.right);

        res = Math.max (res, left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

    }
}