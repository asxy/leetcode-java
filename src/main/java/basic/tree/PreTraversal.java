package basic.tree;


import basic.entity.TreeNode;

/**
 * 二叉树前序遍历
 * 根->左->右
 * Created by asxy on 2023/8/25
 */
public class PreTraversal {

    public void preTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preTraversal(root.left);
        preTraversal(root.right);
    }
}
