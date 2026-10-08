package Days45.Tree;

public class symmetric_tree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        
    }
    public static boolean symmetric(TreeNode root){
        return symmetricity(root.left, root.right);
    }
    public static boolean symmetricity(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        else if(root1==null || root2==null) return false;
        else if(root1.val !=  root2.val) return false;
        boolean left=symmetricity(root1.left, root2);
        boolean right=symmetricity(root1, root2.right);
        return left && right;
    }
}
