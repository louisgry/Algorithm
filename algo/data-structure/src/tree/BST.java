package tree;

import linear.Queue;
import linear.Stack;

/**
 * @author Louis
 * @date Create in 2019/12/3 21:38
 */
public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    /**
     * 添加
     */
    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if(node == null) {
            size ++;
            return new Node(e);
        }
        if(e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        }
        else if(e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    /**
     * 删除
     */
    public void remove(E e){
        root = remove(root, e);
    }

    private Node remove(Node node, E e){
        if( node == null ) {
            return null;
        }
        if( e.compareTo(node.e) < 0 ){
            node.left = remove(node.left , e);
            return node;
        }
        else if(e.compareTo(node.e) > 0 ){
            node.right = remove(node.right, e);
            return node;
        }
        else{
            if(node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size --;
                return rightNode;
            }
            if(node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size --;
                return leftNode;
            }
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;
            node.left = node.right = null;
            return successor;
        }
    }

    /**
     * 包含
     */
    public boolean contains(E e){
        return contains(root, e);
    }

    private boolean contains(Node node, E e){
        if(node == null) {
            return false;
        }
        if(e.compareTo(node.e) == 0) {
            return true;
        }
        else if(e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        }
        else {
            return contains(node.right, e);
        }
    }

    /**
     * 前序遍历
     */
    public void preOrder(){
        // 非递归，借助Stack
        if(root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            Node cur = stack.pop();
            System.out.println(cur.e);

            if(cur.right != null) {
                stack.push(cur.right);
            }
            if(cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    /**
     * 中序遍历
     */
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        // 递归
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    /**
     * 层序遍历
     */
    public void levelOrder(){
        // 非递归，借助Queue
        if(root == null) {
            return;
        }
        Queue<Node> q = new Queue<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            System.out.println(cur.e);
            if(cur.left != null) {
                q.add(cur.left);
            }
            if(cur.right != null) {
                q.add(cur.right);
            }
        }
    }

    /**
     * 最值
     */
    public E maximum(){
        if(size == 0) {
            throw new IllegalArgumentException("BST is empty");
        }
        return maximum(root).e;
    }

    private Node maximum(Node node){
        if(node.right == null) {
            return node;
        }
        return maximum(node.right);
    }

    public E minimum(){
        if(size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return minimum(root).e;
    }

    private Node minimum(Node node){
        if(node.left == null) {
            return node;
        }
        return minimum(node.left);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E removeMin(){
        E ret = minimum();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node node){
        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

}
