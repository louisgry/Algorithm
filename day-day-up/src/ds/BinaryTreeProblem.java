package ds;
import java.util.*;
/**
 * @author Louis
 * @date Create in 2019/11/27 10:01
 */
public class BinaryTreeProblem {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        // 特例1：都在左边
        if(p.val<root.val && q.val<root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        // 特例2：都在右边
        if(p.val>root.val && q.val>root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        // 其他情况
        return root;
    }

    /**
     * https://leetcode.com/problems/path-sum-iii/
     */
    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        // 递归嵌套递归
        int res = getPathNum(root, sum);
        res += pathSum(root.left, sum) + pathSum(root.right, sum);
        return res;
    }
    private int getPathNum(TreeNode node, int sum) {
        if(node == null) {
            return 0;
        }
        int res = 0;
        if(node.val == sum) {
            res += 1;
        }
        res += getPathNum(node.left, sum-node.val);
        res += getPathNum(node.right, sum-node.val);
        return res;
    }

    /**
     * https://leetcode.com/problems/sum-root-to-leaf-numbers/
     */
    public int sumNumbers(TreeNode root) {
        return getSum(root, 0);
    }
    private int getSum(TreeNode root, int curSum) {
        if(root == null) {
            return 0;
        }
        curSum = 10*curSum + root.val;
        if(root.left==null && root.right==null) {
            return curSum;
        }
        return getSum(root.left, curSum) + getSum(root.right, curSum);
    }
    /**
     * https://leetcode.com/problems/path-sum-ii/
     */
    public ArrayList<ArrayList<Integer>> pyyathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        List<Integer> middle = new ArrayList<Integer>();
        getPath(root, sum, middle, res);
        return res;
    }
    private void getPath(TreeNode root, int sum, List<Integer> middle, ArrayList<ArrayList<Integer>> res) {
        if(root == null) {
            return;
        }
        middle.add(root.val);
        if(root.left==null && root.right==null) {
            if(root.val == sum) {
                res.add(new ArrayList<Integer>(middle));
            }
        }
        getPath(root.left, sum-root.val, middle, res);
        getPath(root.right, sum-root.val, middle, res);
        middle.remove(middle.size()-1);
    }

    /**
     * https://leetcode.com/problems/binary-tree-paths/
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        // condition
        if(root == null) {
            return res;
        }
        if(root.left==null && root.right==null) {
            res.add(Integer.toString(root.val));
            return res;
        }
        // recursion
        List<String> leftStr = binaryTreePaths(root.left);
        for(int i=0; i<leftStr.size(); i++) {
            // res.add(Integer.toString(root.val)+"->"+leftStr.get(i));
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(leftStr.get(i));
            res.add(sb.toString());
        }
        List<String> rightStr = binaryTreePaths(root.right);
        for(int i=0; i<rightStr.size(); i++) {
            // res.add(Integer.toString(root.val)+"->"+rightStr.get(i));
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(rightStr.get(i));
            res.add(sb.toString());
        }
        return res;
    }

    /**
     * https://leetcode.com/problems/sum-of-left-leaves/
     */
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null) {
            return 0;
        }
        // 判断左叶子
        if(root.left!=null && root.left.left==null && root.left.right==null) {
            sum += root.left.val;
        }
        sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        return sum;
    }

    /**
     * https://leetcode.com/problems/path-sum/
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        // condition：root一定得是叶子节点
        if(root == null) {
            return false;
        }
        if(root.left==null && root.right==null) {
            return root.val == sum;
        }

        // condition：关键在于将求和改为相减
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

    /**
     * https://leetcode.com/problems/balanced-binary-tree/
     */
    public boolean isBalanced(TreeNode root) {
        // condition：条件设置有点难，平衡指左右子树高度差不超过1
        if(root==null) {
            return true;
        }
        if(Math.abs(getDepth(root.left)-getDepth(root.right))>1){
            return false;
        }
        // recursion
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }
    /**
     * https://leetcode.com/problems/count-complete-tree-nodes/
     */
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    /**
     * https://leetcode.com/problems/symmetric-tree/
     */
    public boolean isSymmetric(TreeNode root) {
        if(root==null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    // 改编isSame
    private boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        if(p==null || q==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
    /**
     * https://leetcode.com/problems/invert-binary-tree/
     */
    public TreeNode invertTree(TreeNode root) {
        // condition
        if(root==null) {
            return null;
        }

        // recursion
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    /**
     * https://leetcode.com/problems/same-tree/
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 条件有点难设置：
        if(p==null && q==null) {
            return true;
        }
        if(p==null || q==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    /**
     * https://leetcode.com/problems/minimum-depth-of-binary-tree/
     */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left==null && root.right==null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if(root.left != null) {
            min =  Math.min(min, minDepth(root.left) + 1);
        }
        if(root.right != null) {
            min =  Math.min(min, minDepth(root.right) + 1);
        }
        return min;
    }

    /**
     * https://leetcode.com/problems/maximum-depth-of-binary-tree/
     */
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }



}
