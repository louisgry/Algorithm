package ds.binarytree;

import java.util.ArrayList;

/**
 * @author Louis
 * @date Create in 2020/1/12 20:28
 */
public class PathSumII {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 34-二叉树中和为某一值的路径
     * - https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        backtracking(root, target, res, path);
        return res;
    }
    private void backtracking(TreeNode node, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> path) {
        if(node == null) {
            return;
        }
        path.add(node.val);
        if(node.left==null && node.right==null) {
            if(node.val == target) {
                res.add(new ArrayList<>(path));
            }
        }
        // 用减去node值的方法替代求和
        backtracking(node.left, target-node.val, res, path);
        backtracking(node.right, target-node.val, res, path);
        path.remove(path.size()-1);
    }
    /** main */
    public static void main(String[] args) {
        PathSumII pathSumII = new PathSumII();
        TreeNode node = pathSumII.new TreeNode(1);
        node.left = pathSumII.new TreeNode(2);
        node.left.left = pathSumII.new TreeNode(3);
        System.out.println(pathSumII.FindPath(node, 6));
    }
}
