package ds.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Louis
 * @date Create in 2020/1/8 21:02
 */
public class PrintBinaryTreeByLevel {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 32.2-把二叉树打印成多行
     * - https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288
     */
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        // 队列，层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            // 当前队列的size就是该层的节点数
            int count = queue.size();
            while(count-- > 0) {
                TreeNode t = queue.poll();
                if(t == null) {
                    continue;
                }
                list.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
            if(list.size() != 0) {
                res.add(list);
            }
        }
        return res;
    }
}
