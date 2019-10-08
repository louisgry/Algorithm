package ds.queue;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Louis
 * @date Create in 2019/10/24 20:53
 */
public class BinaryTreeLevelOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 102 Binary Tree Level Order Traversal
     * https://leetcode.com/problems/binary-tree-level-order-traversal/
     *
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        // LinkedList实现Queue
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        queue.addLast(new Pair<TreeNode, Integer>(root, 0));
        while(!queue.isEmpty()) {
            Pair<TreeNode, Integer> front = queue.removeFirst();
            TreeNode node = front.getKey();
            int level = front.getValue();
            // 等于表示在新的一层中
            if(level == res.size()){
                res.add(new ArrayList<Integer>());
            }
            // 需用get方法，不能直接使用下标索引
            res.get(level).add(node.val);
            if(node.left != null){
                queue.addLast(new Pair<TreeNode, Integer>(node.left, level+1));
            }
            if(node.right != null){
                queue.addLast(new Pair<TreeNode, Integer>(node.right, level+1));
            }
        }
        return res;
    }
    /** main */
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        // binary tree [3,9,20,null,null,15,7]
        TreeNode root = binaryTreeLevelOrderTraversal.new TreeNode(3);
        root.left = binaryTreeLevelOrderTraversal.new TreeNode(9);
        root.right = binaryTreeLevelOrderTraversal.new TreeNode(20);
        root.right.left = binaryTreeLevelOrderTraversal.new TreeNode(15);
        root.right.right = binaryTreeLevelOrderTraversal.new TreeNode(7);
        // ==> [[3], [9,20], [15,7]]
        List<List<Integer>> res = binaryTreeLevelOrderTraversal.levelOrder(root);
        System.out.println(res.toString());
    }
}
