package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2020/1/10 14:19
 */
public class BSTPostorder {
    /**
     * 33-二叉搜索树的后序遍历序列
     * - https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null || sequence.length==0) {
            return false;
        }
        return verify(sequence, 0, sequence.length-1);
    }
    private boolean verify(int[] sequence, int start, int root) {
        if(start >= root) {
            return true;
        }
        int key = sequence[root];
        int cur;
        // 找到左右子树的分界点
        for(cur=start; cur<root; cur++) {
            if(sequence[cur] > key) {
                break;
            }
        }
        // 左右子树中判断是否有小于root的值，有返回false
        for(int i=cur; i<root; i++) {
            if(sequence[i] < key) {
                return false;
            }
        }
        return verify(sequence, start, cur-1) &&
                verify(sequence, cur, root-1);
    }
    /** main */
    public static void main(String[] args) {
        int[] seq = {1,3,2};
        System.out.println((new BSTPostorder()).VerifySquenceOfBST(seq));
    }
}
