package ds.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Louis
 * @date Create in 2020/1/8 20:55
 */
public class PrintBinaryTreeFromHome {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 32.1-从上往下打印二叉树
     * - https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        // 队列，层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            // 当前队列的size就是该层的节点数
            int count = queue.size();
            while(count-- > 0) {
                TreeNode t = queue.poll();
                if(t == null) {
                    continue;
                }
                res.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
        }
        return res;
    }
}
