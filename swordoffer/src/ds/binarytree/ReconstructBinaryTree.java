package ds.binarytree;

import java.util.Arrays;
/**
 * @author Louis
 * @date Create in 2019/10/27 14:25
 */
public class ReconstructBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 7 重建二叉树
     * https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        // 边界条件
        if(pre.length==0 || in.length==0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        // 遍历in，在中序里找前序的根
        for(int i=0; i<in.length; i++) {
            if(in[i] == pre[0]) {
                // copyOfRange函数，左闭右开
                int[] leftPre = Arrays.copyOfRange(pre, 1, i+1);
                int[] leftIn = Arrays.copyOfRange(in, 0, i);
                root.left = reConstructBinaryTree(leftPre, leftIn);
                // i为中序的下标找到前序根，pre包括下标i，in不包括i
                int[] rightPre = Arrays.copyOfRange(pre, i+1, pre.length);
                int[] rightIn = Arrays.copyOfRange(in, i+1, in.length);
                root.right = reConstructBinaryTree(rightPre, rightIn);
                break;
            }
        }
        return root;
    }
    /** main */
    public static void main(String[] args) {
        ReconstructBinaryTree reconstructBinaryTree = new ReconstructBinaryTree();
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode head = reconstructBinaryTree.reConstructBinaryTree(pre, in);
        // ==> [1,2,3,4,5,6,7,8]
        System.out.print(head.val + " ");
        System.out.print(head.left.val + " ");
        System.out.print(head.right.val + " ");
        System.out.print(head.left.left.val + " ");
        System.out.print(head.right.left.val + " ");
        System.out.print(head.right.right.val + " ");
        System.out.print(head.left.left.right.val + " ");
        System.out.print(head.right.right.left.val + " ");
    }
}
