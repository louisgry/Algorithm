# 《剑指Offer》 (Java)

- 数据结构
    - [数组](#数组)
    - [字符串](#字符串)
    - [链表](#链表)
    - [树](#树)
    - [栈](#栈)
- 算法思想
    - [递归与循环](#递归与循环)
    - [查找和排序](#查找和排序)
    - [回溯法](#回溯法)
    - [动态规划](#动态规划)
    - [其他](#其他)

## 数组
- [3-数组中重复的数字](https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8)：[3题解](#3-数组中重复的数字)
- [4-二维数组中的查找](https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e)：[4题解](#4-二维数组中的查找)

## 字符串
- [5-替换空格](https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423)：[5题解](#5-替换空格)

## 链表
- [6-从尾到头打印链表](https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035)：[6题解](#6-从尾到头打印链表)
- [18-删除链表中重复的节点](https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef)：[18题解](#18-删除链表的节点)

## 树
- [7-重建二叉树](https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6)：[7题解](#7-重建二叉树)
- [8-二叉树的下一个节点](https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e)：[8题解](#8-二叉树的下一个节点)

## 栈
- [9-用两个栈来实现队列](https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6)：[9题解](#9-用两个栈来实现队列)

## 递归与循环
- [10-斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3)：[10题解](#10-斐波那契数列)

## 查找和排序
- [11-旋转数组的最小数字](https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba)：[11题解](#11-旋转数组的最小数字)

## 回溯法
- [12-矩阵中的路径](https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc)：[12题解](#12-矩阵中的路径)
- [13-机器人的运动范围](https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8)：[13题解](#13-机器人的运动范围)

## 动态规划
- [14-剪绳子](https://www.nowcoder.com/practice/57d85990ba5b440ab888fc72b0751bf8)：[14题解](#14-剪绳子)

## 其他
- [15-二进制中1的个数](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8)：[15题解](#15-二进制中1的个数)
- [16-数值的整数次方](https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00)：[16题解](#16-数值的整数次方)
- 17-打印从1到最大的n位数：[17题解](#17-打印从1到最大的n位数)


---
### 3-数组中重复的数字
- https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8
- 请找出数组中任意一个重复的数字
- Input: {2,3,1,0,2,5,3}
- Output: 2
- 思路：Hash
- 复杂度：O(n)、O(n)
```java
public class Solution {
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
}
```

### 4-二维数组中的查找
- https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e
- 判断二维数组中是否含有某一整数
- Input: target=5, array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}}
- Output: false
- 思路：双指针，比target大j--，小i++
- 复杂度：O(n+m)、O(1)
```java
public class Solution {
    public boolean Find(int target, int [][] array) {
        // 边界条件判断
        if(array.length==0 || array[0].length==0) {
            return false;
        }
        int i=0, j=array[0].length-1;
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
}
```

### 5-替换空格
- https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423
- 替换字符串的空格为“%20”
- 思路：扫两遍，从前往后记录空格数，接着从后往前替换
- 复杂度：O(n)、O(n)
```java
public class Solution {
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
}
```
- 思路：调用自带replace函数
```
public String replaceSpace(StringBuffer str) {
    return str.toString().replace(" ", "%20");
}
``` 

### 6-从尾到头打印链表
- https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035
- 反向打印链表
- 思路1：模拟栈，利用List的add(index, value)方法
- 复杂度：O(n)、O(n)
```java
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    // 模拟栈，每次在第一个位置插入元素，取出来的就是最新的元素
    ArrayList<Integer> list = new ArrayList<Integer>();
    while(listNode != null) {
        list.add(0, listNode.val);
        listNode = listNode.next;
    }
    return list;
    }
}
```
- 思路2：递归，list要放外面
- 复杂度：O(n)、O(n)
```java
import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null) {
            return res;
        }
        printListFromTailToHead(listNode.next);
        res.add(listNode.val);
        return res;
    }
}
```

### 7-重建二叉树
- https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6
- 根据前序和中序遍历的结果，重建二叉树
- Input: pre={1,2,4,7,3,5,6,8}, in={4,7,2,1,5,3,8,6}
- Output: TreeNode
- 思路：递归，前序找根，中序划分左右子树
- 复杂度：O(n)、O(n)
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

### 8-二叉树的下一个节点
- https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e
- 找出二叉树中序遍历顺序的下一个结点并且返回（包含指向父节点的next指针）
- 思路：分三种情况，有右子树、无右子树且为左、无右子树且为右
- 复杂度：O(n)、O(1)
```java
public class Solution {
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
}
```

### 9-用两个栈来实现队列
- https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6
- 用两个栈来实现队列的push和pop
- 思路：直接push，pop的时候把stack1的放入stack2中
- 复杂度：O(n)、O(n)
```java
import java.util.Stack;
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

### 10-斐波那契数列
- https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3
- 输出斐波那契数列的第n项（从0开始，第0项为0）
- Input: 2
- Output: 1
- 思路1：记忆化搜索
- 复杂度：O(n)、O(n)
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
- 复杂度：O(n)、O(n)
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

### 11-旋转数组的最小数字
- https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba
- 递增的数组会进行旋转，根据该特性找出其最小值
- Input: {3,4,5,1,2}
- Output: 1
- 思路：二分查找，三种情况，处于递增，处于递减，其他情况
- 复杂度：O(logn)、O(1)
```java
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        // 边界条件
        if(array.length == 1) {
            return array[0];
        }
        int l=0, r=array.length-1;
        // mid初始为0
        int mid = 0;
        while(l < r) {
            if(array[l] < array[r]) {
                return array[l];
            }
            mid = l+(r-l)/2;
            // 1. 处于递增，改变l
            if(array[l] < array[mid]) {
                l = mid + 1;
            }
            // 2. 处于递减，改变r
            else if(array[mid] < array[r]) {
                r = mid;
            }
            // 3. 其余情况，l++缩小范围
            else {
                l++;
            }
        }
        return array[l];
    }
}
```

### 12-矩阵中的路径
- https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc
- 在矩阵中搜索是否包含str的路径
- Input: matrix={'a','b','t','g','c','f','c','s','j','d','e','h'}, str={'b','f','c','e'}
- Output: true
- 思路：回溯法，递归树中搜索左上右下四个方向
- 复杂度：`O(m*n*m*n)、O(m*n)`
```java
public class Solution {
  private boolean[] visited;
  // 左上右下
  private int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
  int m, n;
  public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
      m = rows;
      n = cols;
      visited = new boolean[matrix.length];
      for(int i=0; i<rows; i++) {
          for(int j=0; j<cols; j++) {
              if(search(matrix, rows, cols, str, 0, i, j)) {
                  return true;
              }
          }
      }
      return false;
  }
  private boolean search(char[] matrix, int rows, int cols, char[] str, int index, int startx, int starty) {
      if(index == str.length-1) {
          return matrix[startx*cols+starty] == str[index];
      }
      if(matrix[startx*cols+starty] == str[index]) {
          visited[startx*cols+starty] = true;
          // 四个方向寻找
          for(int i=0; i<4; i++) {
              int newx = startx + d[i][0];
              int newy = starty + d[i][1];
              if(inArea(newx, newy) && !visited[newx*cols+newy]) {
                  if(search(matrix, rows, cols, str, index+1, newx, newy)) {
                      return true;
                  }
              }
          }
          visited[startx*cols+starty] = false;
      }
      return false;
  }
  private boolean inArea(int x, int y) {
      return x>=0 && x<m && y>=0 && y<n;
  }
}
```

### 13-机器人的运动范围
- https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8
- 机器人不能进入行坐标和列坐标的数位之和大于k的格子，求总共能访问多少个
- 思路：回溯，递归遍历
- 复杂度：O(n*m)、O(n*m)
```
public class Solution {
    boolean[][] visited;
    public int movingCount(int threshold, int rows, int cols) {
        visited = new boolean[rows][cols];
        return getNumber(threshold, rows, cols, 0, 0);
    }

    private int getNumber(int threshold, int rows, int cols, int x, int y) {
        if(!inArea(threshold, rows, cols, x, y) || visited[x][y]) {
            return 0;
        }
        visited[x][y] = true;
        return getNumber(threshold, rows, cols, x-1, y)
                + getNumber(threshold, rows, cols, x+1, y)
                + getNumber(threshold, rows, cols, x, y-1)
                + getNumber(threshold, rows, cols, x, y+1)
                + 1;
    }
    private boolean inArea(int threshold, int rows, int cols, int x, int y) {
        if(x<0 || x>=rows || y<0 || y>=cols || numSum(x)+numSum(y)>threshold) {
            return false;
        }
        return true;
    }
    private int numSum(int x) {
        int res = 0;
        while(x != 0) {
            res += x%10;
            x /= 10;
        }
        return res;
    }
}
```

### 14-剪绳子
- https://www.nowcoder.com/practice/57d85990ba5b440ab888fc72b0751bf8
- 求绳子分段的乘积最大值
- Input: 8 
- Output: 18（8=2+3+3, 18=2*3*3）
- 思路1：动态规划，$f(n)=max(f(j)*f(n-j))$
- 复杂度：O(n^2)、O(n)
```java
public class Solution {
    public int cutRope(int target) {
        // n<=3，进一步划分
        if(target == 2) {
            return 1;
        }
        if(target == 3) {
            return 2;
        }
        // n>3，不分的情况
        int[] memo = new int[target+1];
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 3;
        int res = 0;
        // 包括target要等于
        for(int i=4; i<=target; i++) {
            for(int j=1; j<=i/2; j++) {
                res = Math.max(res, memo[j]*memo[i-j]);
            }
            memo[i] = res;
        }
        return memo[target];
    }
}
```
- 思路2：贪心，尽量减成3，当剩下长度为4剪成2*2
- 复杂度：O(1)、O(1)
```java
public class Solution {
    public int cutRope(int target) {
        if(target == 2) {
            return 1;
        }
        if(target == 3) {
            return 2;
        }
        int threeTimes = target / 3;
        // 剩下为4时，要剪成2*2
        if(target - threeTimes*3 == 1) {
            threeTimes -= 1;
        }
        int twoTimes = (target - threeTimes*3)/2;
        return (int) (Math.pow(3, threeTimes) * Math.pow(2, twoTimes));
    }
}
```

### 15-二进制中1的个数
- https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8
- 十进制转二进制，求1的个数
- 思路：1的个数就是该数与其减一按位与能进行多少次
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = (n-1)&n;
        }
        return count;
    }
}
```

### 16-数值的整数次方
- https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00
- 实现Math.pow函数
-  思路：指数的正负数情况要区分，res或1/res
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public double Power(double base, int exponent) {
        if(base == 0) {
            return 0.0;
        }
        double res = 1.0;
        int e = Math.abs(exponent);
        for(int i=0; i<e; i++) {
            res *= base;
        }
        return exponent>0 ? res : 1/res;
    }
}
```

### 17-打印从1到最大的n位数
- 如题，输入3，打印1到999
- 思路：大数问题，直接for打印会出现整型溢出问题，改用字符串模拟
- 复杂度：O(n)、O(n)
```
    public void Print1ToMaxOfNDigits(int n) {
        if(n <= 0) {
            return;
        }
        StringBuilder num = new StringBuilder(n);
        for(int i=0; i<n; i++) {
            num.append('0');
        }
        while(increment(num)) {
            String res = num.toString().replaceFirst("^0*", "");
            System.out.println(res);
        }
    }
    private boolean increment(StringBuilder str) {
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i)>='0' && str.charAt(i)<'9') {
                str.setCharAt(i, (char) (str.charAt(i)+1));
                return true;
            }
            else if(str.charAt(i) == '9') {
                str.setCharAt(i, '0');
            }
            else {
                return false;
            }
        }
        return false;
    }
```

### 18-删除链表的节点
- 题目1：在O(1)时间内删除链表节点
- 思路：修改链表的值
- 复杂度：O(1)、O(1)
```
    public void deleteNode(ListNode node) {
        if(node == null) {
            return;
        }
        if(node.next == null) {
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }
```
- 题目2：删除链表中重复的节点
- https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef
- 排序的链表里删除重复的节点
- 思路：
- 复杂度：
```java
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null || pHead.next==null) {
            return pHead;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = pHead;
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        while(cur != null) {
            if(cur.next!=null && cur.val == cur.next.val) {
                // 一直搜索到不同为止
                while(cur.next!=null && cur.val==cur.next.val) {
                    cur = cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            }
            else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
```