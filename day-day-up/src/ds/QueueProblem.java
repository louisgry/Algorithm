package ds;
import java.util.*;

public class QueueProblem {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * https://leetcode.com/problems/binary-tree-level-order-traversal/
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root == null) {
            return res;
        }
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        queue.add(new Pair<>(root, 0));
        while(!queue.isEmpty()) {
            Pair<TreeNode, Integer> front = queue.poll();
            TreeNode node = front.getKey();
            int level = front.getValue();
            // 新的一层
            if(level == res.size()) {
                res.add(new ArrayList<>());
            }
            // 把值放到level层的res
            res.get(level).add(node.val);
            if(node.left != null) {
                queue.add(new Pair<TreeNode, Integer>(node.left, level+1));
            }
            if(node.right != null) {
                queue.add(new Pair<TreeNode, Integer>(node.right, level+1));
            }
        }
        return res;
    }
    private class Pair<K, V> {
        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }
    }

}
