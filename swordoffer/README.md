# 《剑指Offer》 (Java)

- 数据结构
    - [数组](#数组)
    - [字符串](#字符串)
    - [链表](#链表)
    - [树](#树)
    - [栈](#栈)
- 算法思想
    - [递归与循环](#递归与循环)

## 数据结构
### 数组
- 3 数组中重复的数字
    - https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8
    - 请找出数组中任意一个重复的数字
    - 【WA】输入为空时，没有进行边界条件判断
    - 思路：Hash Table
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length==0) {
            return false;
        }
        int[] freq = new int[length];
        for(int i=0; i<numbers.length; i++) {
            freq[numbers[i]]++;
            if(freq[numbers[i]]>1){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    ```
- 4 二维数组中的查找
    - https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e
    - 判断二维数组中是否含有某一整数
    - 思路：双指针
    - 时间复杂度：O(n+m)
    - 空间复杂度：O(1)
    ```java
    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length - 1;
        while(i<array.length && j>=0) {
            if(array[i][j] == target) {
                return true;
            }
            else if(array[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
    ```

# 字符串
- 5 替换空格
    - https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423
    - 替换字符串的空格为“%20”
    - 思路：扫两遍：从前往后记录空格数，接着从后往前替换
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    public String replaceSpace(StringBuffer str) {
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        char[] cArr = new char[str.length()+2*count];
        // 边界条件：>=
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) != ' '){
                cArr[i+2*count] = str.charAt(i);
            }
            else {
                count--;
                cArr[i+2*count] = '%';
                cArr[i+2*count+1] = '2';
                cArr[i+2*count+2] = '0';
            }
        }
        return new String(cArr);
    }
    ```
    - 思路：调用自带replace函数
    ```
    public String replaceSpace(StringBuffer str) {
     return str.toString().replace(" ", "%20");
    }
    ``` 

# 链表
- 6 从尾到头打印链表
    - https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035
    - 反向打印链表
    - 思路1：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null){
            return res;
        }
        printListFromTailToHead(listNode.next);
        res.add(listNode.val);
        return res;
    }
    ```
    - 思路2：栈，利用List的add(index, value)方法
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode cur = listNode;
        while(cur != null) {
            res.add(0, cur.val);
            cur = cur.next;
        }
        return res;
    ```

# 二叉树
- 7 重建二叉树
    - https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6
    - 根据前序和中序遍历的结果，重建二叉树
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    import java.util.Arrays;

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0 || in.length==0) {
            return null;
        }
        // 前序第一个节点为根节点
        TreeNode root = new TreeNode(pre[0]);
        // 中序找前序的根
        for(int i=0; i<in.length; i++) {
            if(in[i] == pre[0]) {
                // copyOfRange左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
                break;
            }
        }
        return root;
    }
    ```
- 8 二叉树的下一个节点
    - https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e
    - 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
    ```java
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        // 中序遍历：左节点 -> 根节点 -> 右节点
        // 如果存在右子树，下一个节点为右子树的最左节点
        // 如果不存在右子树，while循环
        // -- if该节点为父节点的左子树，下一节点是父节点(node.next)
        // -- 沿着父结点追朔，直到找到某个结点是其父结点的左子树
        if(pNode == null)
            return null;
        
        if(pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while(node.left != null) {
                node = node.left;
            }
            return node;
        }
        
        while(pNode.next != null) {
            if(pNode == pNode.next.left) {
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }
    ```

### 栈
- 9 用两个栈来实现队列
    - https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6
    - 用两个栈来实现队列的push和pop
    ```java
    public class Solution {
        // 思路：push到stack1的最低端，stack2作辅助
        private Stack<Integer> stack1 = new Stack<Integer>();
        private Stack<Integer> stack2 = new Stack<Integer>();
    
        public void push(int node) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(node);
            while(!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }
    
        public int pop() {
            return stack1.pop();
        }
    }
    ```

## 算法思想
### 递归与循环
- 10 斐波那契数列
    - https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3
    - 输出斐波那契数列的第n项（从0开始，第0项为0）
    - 思路1：递归
    - 时间复杂度：O(2^n)
    - 空间复杂度：O(1)
    ```java
    public int Fibonacci(int n) {
        // 递归
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    ```
    - 思路2：记忆化搜索
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    int[] memo;
    public int Fibonacci(int n) {
        // 记忆化搜索
        memo = new int[n+2];
        Arrays.fill(memo, -1);
        return getFib(n);
    }
    private int getFib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(memo[n] == -1)
            memo[n] = getFib(n-1) + getFib(n-2);
        return memo[n];
    }
    ```
    - 思路3：动态规划
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    public int Fibonacci(int n) {
        // 动态规划
        int[] memo = new int[n+2];
        if(n == 0) {
            memo[0] = 0;
        }
        else if(n == 1) {
            memo[1] = 1;
        }
        else {
            memo[0] = 0;
            memo[1] = 1;
        }
        for(int i=2; i<=n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
    ```
