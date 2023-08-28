package daily;

import basic.entity.TreeNode;

/**
 * Created by asxy on 2023/8/25
 */
class GoodNodes {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode node, Integer max) {
        if (node == null) return 0;

        int res = 0;

        if (node.val >= max) {
            res++;
            max = node.val;
        }

        res += dfs(node.right, max) + dfs(node.left, max);
        return res;
    }
}