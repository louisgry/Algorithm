package algo.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Louis
 * @date Create in 2020/7/2 22:51
 */
public class MinimumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
     */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // root第一层，depth=1
        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            // 将队列中的所有节点向四周扩展
            for(int i=0; i<size; i++) {
                TreeNode cur = queue.poll();
                // 判断是否到达终点
                if(cur.left==null && cur.right==null) {
                    return depth;
                }
                // 将cur相邻节点加入队列
                if(cur.left != null) {
                    queue.add(cur.left);
                }
                if(cur.right != null) {
                    queue.add(cur.right);
                }
            }
            // 增加深度
            depth++;
        }
        return depth;
    }
    /** main */
    public static void main(String[] args) {
        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
        TreeNode root = minimumDepthOfBinaryTree.new TreeNode(3);
        root.left = minimumDepthOfBinaryTree.new TreeNode(9);
        root.right = minimumDepthOfBinaryTree.new TreeNode(20);
        root.right.left = minimumDepthOfBinaryTree.new TreeNode(15);
        root.right.right = minimumDepthOfBinaryTree.new TreeNode(7);
        // ==> 2
        System.out.println(minimumDepthOfBinaryTree.minDepth(root));
    }
}
