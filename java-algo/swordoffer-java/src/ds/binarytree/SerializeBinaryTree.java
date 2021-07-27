package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2020/1/15 18:48
 */
public class SerializeBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 37-序列化二叉树
     * - https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84
     */
    // 使用index设置树节点的val值，
    int index = -1;

    String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        // 前序遍历
        return root.val + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    TreeNode Deserialize(String str) {
        // 将序列化str按分隔符转为数组
        String[] s = str.split(" ");
        index++;
        // 下标越界则返回空
        if (index > s.length) {
            return null;
        }
        // 前序遍历递归，如果值为#返回空节点
        TreeNode t = null;
        if (!s[index].equals("#")) {
            t = new TreeNode(Integer.parseInt(s[index]));
            t.left = Deserialize(str);
            t.right = Deserialize(str);
        }
        return t;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        SerializeBinaryTree serializeBinaryTree = new SerializeBinaryTree();
        TreeNode node = serializeBinaryTree.new TreeNode(1);
        node.left = serializeBinaryTree.new TreeNode(2);
        node.right = serializeBinaryTree.new TreeNode(3);
        node.left.left = serializeBinaryTree.new TreeNode(4);
        node.right.left = serializeBinaryTree.new TreeNode(5);
        // serialize
        String str = serializeBinaryTree.Serialize(node);
        System.out.println(str);
        // deserialize
        TreeNode root = serializeBinaryTree.Deserialize(str);
        System.out.println(root.val);
        System.out.println(root.left.left.val);
        System.out.println(root.right.left.val);
    }
}
