# 《剑指Offer》 (Java)

- 数据结构
    - [数组](#数组)
    - [字符串](#字符串)
    - [链表](#链表)
    - [树](#树)
    - [栈](#栈)
- 算法思想
    - [递归与循环](#递归与循环)

### 3.数组中重复的数字
- 3 数组中重复的数字
- https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8
- 请找出数组中任意一个重复的数字
- 思路：Hash
- 时间复杂度：O(n)
- 空间复杂度：O(n)
```java
public boolean duplicate(int numbers[],int length,int [] duplication) {
    // 边界条件判断
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

### 4.二维数组中的查找
- 4 二维数组中的查找
- https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e
- 判断二维数组中是否含有某一整数
- 思路：双指针，比target大j--，小i++
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

### 5.替换空格
- 5 替换空格
- https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423
- 替换字符串的空格为“%20”
- 思路：扫两遍，从前往后记录空格数，接着从后往前替换
- 时间复杂度：O(n)
- 空间复杂度：O(n)
```java
public String replaceSpace(StringBuffer str) {
    // 从前往后遍历，记录空格数
    int count = 0;
    for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == ' ') {
            count++;
        }
    }
    // 从后往前，替换
    char[] charArr = new char[str.length()+2*count];
    for(int i=str.length()-1; i>=0; i--) {
        if(str.charAt(i) != ' ') {
            charArr[i+2*count] = str.charAt(i);
        }
        else {
            count--;
            charArr[i+2*count] = '%';
            charArr[i+2*count+1] = '2';
            charArr[i+2*count+2] = '0';
        }
    }
    return new String(charArr);
}
```
- 思路：调用自带replace函数
```
public String replaceSpace(StringBuffer str) {
 return str.toString().replace(" ", "%20");
}
``` 

### 6.从尾到头打印链表
- 6 从尾到头打印链表
- https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035
- 反向打印链表
- 思路1：模拟栈，利用List的add(index, value)方法
- 时间复杂度：O(n)
- 空间复杂度：O(n)
```
public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    // 模拟栈，每次在第一个位置插入元素，取出来的就是最新的元素
    ArrayList<Integer> list = new ArrayList<Integer>();
    while(listNode != null) {
        list.add(0, listNode.val);
        listNode = listNode.next;
    }
    return list;
}
```
- 思路2：递归，list要放外面
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

### 7.重建二叉树
- 7 重建二叉树
- https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6
- 根据前序和中序遍历的结果，重建二叉树
- 思路：递归，前序找根，中序划分左右子树
- 时间复杂度：O(n)
- 空间复杂度：O(n)
```java
import java.util.*;
public class Solution {
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
}
```

### 8.二叉树的下一个节点
- 8 二叉树的下一个节点
- https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e
- 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
```java
public TreeLinkNode GetNext(TreeLinkNode pNode) {
    // 关键：next为指向父节点的指针
    if(pNode == null) {
        return null;
    }
    // 1. 有右子树：则下一个为右子树的最左孩子
    if(pNode.right != null) {
        TreeLinkNode pRight = pNode.right;
        while(pRight.left != null) {
            pRight = pRight.left;
        }
        return pRight;
    }
    // 2. 无右子树，且该节点为父节点的左子树：则下一个为该节点的父节点
    if(pNode.next!=null && pNode.next.left==pNode) {
        return pNode.next;
    }
    // 3. 无右子树，且该节点为父节点的右子树：则下一个为该节点的最父节点
    if(pNode.next != null) {
        TreeLinkNode pNext = pNode.next;
        while(pNext.next!=null && pNext.next.right==pNext) {
            pNext = pNext.next;
        }
        return pNext.next;
    }
    return null;
}
```

### 9.用两个栈来实现队列
- 9 用两个栈来实现队列
- https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6
- 用两个栈来实现队列的push和pop
- 思路：直接push，pop的时候把stack1的放入stack2中
- 复杂度：O(n)、O(n)
```java
public class Solution {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
```

### 10.斐波那契数列
- 10 斐波那契数列
- https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3
- 输出斐波那契数列的第n项（从0开始，第0项为0）
- 思路1：记忆化搜索
- 时间复杂度：O(n)
- 空间复杂度：O(n)
```java
import java.util.*;
public class Solution {
    int[] memo;
    public int Fibonacci(int n) {
        /** 思路1：记忆化搜索 */
        memo = new int[n+2];
        Arrays.fill(memo, -1);
        return getFib(n, memo);
    }
    private int getFib(int n, int[] memo) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(memo[n] == -1) {
            memo[n] = getFib(n-1, memo) + getFib(n-2, memo);
        }
        return memo[n];
    }
}
```
- 思路2：动态规划
- 时间复杂度：O(n)
- 空间复杂度：O(n)
```java
public class Solution {
    public int Fibonacci(int n) {
        /** 思路2：动态规划 */
        int[] memo = new int[n+2];
        memo[0] = 0;
        memo[1] = 1;
        for(int i=2; i<=n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}
```
