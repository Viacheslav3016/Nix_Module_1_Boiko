package Level2.Task2;

public class Task2 {
    public static void main(String[] args) {
        TreeNode root =
                new TreeNode(30,
                        new TreeNode(7,
                                new TreeNode(4, null, new TreeNode(6)), new TreeNode(9)),
                        new TreeNode(35,
                                new TreeNode(31, new TreeNode(38), null),
                                new TreeNode(40, new TreeNode(46), new TreeNode(72))));
        System.out.println("Максимальная глубина: " + root.SumOfDepth(root));
    }

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int x) {
            val = x;
        }

        public int SumOfDepth(TreeNode root)
        {
            if (root == null)
                return 0;
            int nleft = SumOfDepth(root.left);
            int nright = SumOfDepth(root.right);

            return nleft > nright ? nleft + 1 : nright + 1;
        }
    }
}
