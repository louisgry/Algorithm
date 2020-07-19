package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Louis
 * @date Create in 2020/7/12 21:33
 */
public class LeetCode_111_MinDepth {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /** 111-二叉树的最小深度：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/ */
    public int minDepth(TreeNode root) {
        // 非空判断
        if(root == null) {
            return 0;
        }
        // root入队
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        // BFS搜索
        while(!queue.isEmpty()) {
            int size = queue.size();
            // 向四周扩散
            for(int i=0; i<size; i++) {
                TreeNode cur = queue.poll();
                // 判断是否达到终点：到底
                if(cur.left==null && cur.right==null) {
                    return depth;
                }
                if(cur.left != null) {
                    queue.add(cur.left);
                }
                if(cur.right != null) {
                    queue.add(cur.right);
                }
            }
            // 向下一层
            depth++;
        }
        return depth;
    }
    /** main */
    public static void main(String[] args) {
        LeetCode_111_MinDepth solution = new LeetCode_111_MinDepth();
        TreeNode root = solution.new TreeNode(3);
        root.left = solution.new TreeNode(9);
        root.right = solution.new TreeNode(20);
        root.right.left = solution.new TreeNode(15);
        System.out.println(solution.minDepth(root));
    }
}
