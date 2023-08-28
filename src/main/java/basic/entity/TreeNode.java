package basic.entity;

/**
 * Created by asxy on 2023/8/25
 */

public class TreeNode {

     public int val;
     public TreeNode left;
     public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(){}

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


//public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
