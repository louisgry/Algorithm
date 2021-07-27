package ds.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Louis
 * @date Create in 2020/1/9 20:58
 */
public class PrintBinaryTreeZhi {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 32.3-按之字形顺序打印二叉树
     * - https://www.nowcoder.com/practice/91b69814117f4e8097390d107d2efbe0
     */
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        // 队列，层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        queue.add(pRoot);
        boolean rev = false;
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            // 当前队列的size就是该层的节点数
            int count = queue.size();
            while (count-- > 0) {
                TreeNode t = queue.poll();
                if (t == null) {
                    continue;
                }
                list.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
            if (rev == true) {
                Collections.reverse(list);
            }
            rev = !rev;
            if (list.size() != 0) {
                res.add(list);
            }
        }
        return res;
    }
}
