《剑指Offer》（Java）
==
- 数据结构
    - [数组](#数组)
    - [字符串](#字符串)
    - [栈](#栈)
    - [队列](#队列)
    - [堆](#堆)
    - [链表](#链表)
    - [树](#树)
    - [哈希](#哈希)
- 算法思想
    - [递归与循环](#递归与循环)
    - [二分查找](#二分查找)
    - [滑动窗口](#滑动窗口)
    - [动态规划](#动态规划)
    - [回溯法](#回溯法)
    - [其他](#其他)

# 题目
## 数据结构
### 数组
- [3-数组中重复的数字](https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8)：[3题解](#3-数组中重复的数字)
- [4-二维数组中的查找](https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e)：[4题解](#4-二维数组中的查找)
- [21-调整数组顺序使奇数位于偶数前面](https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593)：[21题解](#21-调整数组顺序使奇数位于偶数前面)
- [29-顺时针打印矩阵](https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a)：[29题解](#29-顺时针打印矩阵)
- [39-数组中出现次数超过一半的数字](https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163)：[39题解](#39-数组中出现次数超过一半的数字)
- [43-从1到n整数中1出现的次数](https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6)：[43题解](#43-从1到n整数中1出现的次数)
- [45-把数组排列成最小的数](https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993)：[45题解](#45-把数组排列成最小的数)

### 字符串
- [5-替换空格](https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423)：[5题解](#5-替换空格)
- 17-打印从1到最大的n位数：[17题解](#17-打印从1到最大的n位数)
- [19-正则表达式匹配](https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c)：[19题解](#19-正则表达式匹配)
- [20-表示数值的字符串](https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2)：[20题解](#20-表示数值的字符串)

### 栈
- [9-用两个栈来实现队列](https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6)：[9题解](#9-用两个栈来实现队列)
- [30-包含min函数的栈](https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49)：[30题解](#30-包含min函数的栈)
- [31-栈的压入、弹出序列](https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106)：[31题解](#31-栈的压入、弹出序列)

### 队列
- [32.1-从上往下打印二叉树](https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701)：[32.1题解](#32.1-从上往下打印二叉树)
- [32.2-把二叉树打印成多行](https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288)：[32.2题解](#32.2-把二叉树打印成多行)
- [32.3-按之字形顺序打印二叉树](https://www.nowcoder.com/practice/91b69814117f4e8097390d107d2efbe0)：[32.3题解](#32.3-按之字形顺序打印二叉树)
- [41.2-字符流中第一个不重复的字符](https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720)：[41.2题解](#41.2-字符流中第一个不重复的字符)

### 堆
- [40-最小的K个数](https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf)：[40题解](#40-最小的K个数)
- [41.1-数据流中的中位数](https://www.nowcoder.com/practice/9be0172896bd43948f8a32fb954e1be1)：[41.1题解](#41.1-数据流中的中位数)
- [59-滑动窗口的最大值](https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788)：[59题解](#59-滑动窗口的最大值)

### 链表
- [6-从尾到头打印链表](https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035)：[6题解](#6-从尾到头打印链表)
- 18.1-在O(1)时间内删除链表节点：[18.1题解](#18.1-在O(1)时间内删除链表节点)
- [18.2-删除链表中重复的节点](https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef)：[18.2题解](#18.2-删除链表的节点)
- [22-链表中倒数第k个结点](https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a)：[22题解](#22-链表中倒数第k个结点)
- [23-链表中环的入口结点](https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4) ：[23题解](#23-链表中环的入口结点)
- [24-反转链表](https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca)：[24题解](#24-反转链表)
- [25-合并两个排序的链表](https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337)：[25题解](#25-合并两个排序的链表)
- [35-复杂链表的复制](https://www.nowcoder.com/practice/f836b2c43afc4b35ad6adc41ec941dba)：[35题解](#35-复杂链表的复制)
- [52-两个链表的第一个公共节点](https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46)：[52题解](#52-两个链表的第一个公共节点)

### 树
- [7-重建二叉树](https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6)：[7题解](#7-重建二叉树)
- [8-二叉树的下一个节点](https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e)：[8题解](#8-二叉树的下一个节点)
- [26-树的子结构](https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88)：[26题解](#26-树的子结构)
- [27-二叉树的镜像](https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011)：[27题解](#27-二叉树的镜像)
- [28-对称的二叉树](https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb)：[28题解](#28-对称的二叉树)
- [33-二叉搜索树的后序遍历序列](https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd)：[33题解](#33-二叉搜索树的后序遍历序列)
- [34-二叉树中和为某一值的路径](https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca)：[34题解](#34-二叉树中和为某一值的路径)
- [36-二叉搜索树与双向链表](https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5)：[36题解](#36-二叉搜索树与双向链表)
- [37-序列化二叉树](https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84)：[37题解](#37-序列化二叉树)

### 哈希
- [50-第一个只出现一次的字符](https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c)：[50题解](#50-第一个只出现一次的字符)

## 算法思想
### 二分查找
- [11-旋转数组的最小数字](https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba)：[11题解](#11-旋转数组的最小数字)
- [53-数字在排序数组中出现的次数](https://www.nowcoder.com/practice/70610bf967994b22bb1c26f9ae901fa2)：[53题解](#53-数字在排序数组中出现的次数)

### 滑动窗口
- [48-最长不含重复字符的子字符串](https://leetcode.com/problems/longest-substring-without-repeating-characters/)：[48题解](#48-最长不含重复字符的子字符串)

### 动态规划
- [10.1-斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3)：[10.1题解](#10.1-斐波那契数列)
- [10.2-矩形覆盖](https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6)：[10.2题解](#10.2-矩形覆盖)
- [10.3-跳台阶](https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4)：[10.3题解](#10.3-跳台阶)
- [10.4-变态跳台阶](https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387)：[10.4题解](#10.4-变态跳台阶)
- [14-剪绳子](https://www.nowcoder.com/practice/57d85990ba5b440ab888fc72b0751bf8)：[14题解](#14-剪绳子)
- [42-连续子数组的最大和](https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484)：[42题解](#42-连续子数组的最大和)
- 46-把数字翻译成字符串：[46题解](#46-把数字翻译成字符串)
- [47-礼物的最大值](https://www.nowcoder.com/questionTerminal/72a99e28381a407991f2c96d8cb238ab)：[47题解](#47-礼物的最大值)
- [49-丑数](https://www.nowcoder.com/practice/6aa9e04fc3794f68acf8778237ba065b)：[49题解](#49-丑数)

### 回溯法
- [12-矩阵中的路径](https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc)：[12题解](#12-矩阵中的路径)
- [13-机器人的运动范围](https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8)：[13题解](#13-机器人的运动范围)
- [38-字符串的排列](https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7)：[38题解](#38-字符串的排列)

### 其他
- [15-二进制中1的个数](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8)：[15题解](#15-二进制中1的个数)
- [16-数值的整数次方](https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00)：[16题解](#16-数值的整数次方)
- 44-数字序列中的某一位数字：[44题解](#44-数字序列中的某一位数字)
- [51-数组中的逆序对](https://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5)：[51题解](#51-数组中的逆序对)

# 题解
## 数据结构题解
### 3-数组中重复的数字
- https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8
- 请找出数组中任意一个重复的数字
- Input: {2,3,1,0,2,5,3}
- Output: 2
- 思路1：Hash
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
- 思路2：把值为i的元素调到i的位置
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length<=0) {
            return false;
        }
        for(int i=0; i<length; i++) {
            while(numbers[i] != i) {
                if(numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, numbers[i], i);
            }
        }
        return false;
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
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
- 思路：扫两遍，从前往后append空格数*2，接着从后往前替换
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public String replaceSpace(StringBuffer str) {
        // 从前往后遍历，append空格数*2
        int size1 = str.length()-1;
        for(int i=0; i<=size1; i++) {
            if(str.charAt(i) == ' ') {
                str.append(" ");
            }
        }
        // 从后往前，替换
        int size2 = str.length()-1;
        while(size1>=0 && size1<size2) {
            char c = str.charAt(size1--);
            if(c == ' ') {
                str.setCharAt(size2--, '0');
                str.setCharAt(size2--, '2');
                str.setCharAt(size2--, '%');
            }
            else {
                str.setCharAt(size2--, c);
            }
        }
        return str.toString();
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
- 思路1：递归，list要放外面
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
- 思路2：迭代
- 复杂度：O(n)、O(1)
```java
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(listNode == null) {
            return res;
        }
        ListNode pre = null;
        ListNode cur = listNode;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        // 输出结果
        while(pre != null) {
            res.add(pre.val);
            pre = pre.next;
        }
        return res;
    }
}
```
- 思路3：模拟栈，利用List的add(index, value)方法
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
- 思路：直接push，pop的时候把in的放入out中
- 复杂度：O(n)、O(n)
```java
import java.util.Stack;
public class Solution {
    private Stack<Integer> in = new Stack<Integer>();
    private Stack<Integer> out = new Stack<Integer>();
    public void push(int node) {
       in.push(node);
    }
    public int pop() {
        if(out.empty()) {
            while(!in.empty()) {
               out.push(in.pop());
            }
        }
        return out.pop();
    }
}
```

## 算法思想题解
### 10.1-斐波那契数列
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

### 10.2-矩形覆盖
- https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6
- 用n个2*1形状的小矩形覆盖一个2*n的大矩形，有几种方法
- 思路：dp，当n=1时只有一种，n=2时只有两种，递归函数f(n)=f(n-1)+f(n-2)
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public int RectCover(int target) {
        if(target <= 2) {
            return target;
        }
        int t1 = 1, t2 = 2;
        int res = 0;
        for(int i=3; i<=target; i++) {
            res = t1 + t2;
            t1 = t2;
            t2 = res;
        }
        return res;
    }
}
```

### 10.3-跳台阶
- https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4
- 可以跳一个台阶，也可以跳两个台阶，求n级台阶有几种跳法
- 思路：dp
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public int JumpFloor(int target) {
        if(target<=0) {
            return -1;
        }
        int[] dp = new int[target+2];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=target; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[target];
    }
}
```

### 10.4-变态跳台阶
- https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387
- 可以跳1阶至n阶，求n级台阶有几种跳法
- 思路：dp，递归函数`f(n)=2*f(n-1)`，分析如下
    - `f(n-1)=f(n-2)+...+f(0)`：跳到n-1级，可以从n-2级到0级开始跳上去
    - `f(n)=f(n-1)+f(n-2)+...+f(0)`：由上述式子得，`f(n)=2*f(n-1)`
- 复杂度：O(n)、O(n)
```java
import java.util.Arrays;
public class Solution {
    public int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        // f(n) = 2*f(n-1);
        for(int i=1; i<target; i++) {
            dp[i] = 2*dp[i-1];
        }
        return dp[target-1];
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

### 18.1-在O(1)时间内删除链表节点
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

### 18.2-删除链表中重复的结点
- https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef
- 排序的链表里删除重复的节点
- 思路：dummyHead
- 复杂度：O(n)、O(1)
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

### 19-正则表达式匹配
- https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c
- 实现一个函数用来匹配包含'.'和'*'的正则表达式
- 思路：递归
- 复杂度：O(n^2)、O(n)
```java
public class Solution {
    public boolean match(char[] str, char[] pattern) {
        if(str==null || pattern==null) {
            return false;
        }
        return matchCore(str, pattern, 0, 0);
    }
    private boolean matchCore(char[] str, char[] pattern, int s, int p) {
        // 两个都到尾，则成功
        if(s==str.length && p==pattern.length) {
            return true;
        }
        // pattern先到尾，则失败
        if(s!=str.length && p==pattern.length) {
            return false;
        }
        // pattern下一个是*
        // 时刻注意判断是否越界
        if(p+1<pattern.length && pattern[p+1]=='*') {
            // 匹配，则str后移1位或pattern后移2位
            if(s!=str.length && (str[s]==pattern[p] || pattern[p]=='.')) {
                return matchCore(str, pattern, s+1, p)
                        || matchCore(str, pattern, s, p+2);
            }
            // 不匹配，pattern后移2位，跳过*
            else {
                return matchCore(str, pattern, s, p+2);
            }
        }
        // pattern下一个不是*，且匹配，则str和pattern都后移1位
        if(s!=str.length && (str[s]==pattern[p] || pattern[p]=='.')) {
            return matchCore(str, pattern, s+1, p+1);
        }
        return false;
    }
}
```

### 20-表示数值的字符串
- https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2
- 判断字符串是否为数值
- 思路：正则表达式
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public boolean isNumeric(char[] str) {
        if(str==null || str.length==0) {
            return false;
        }
        return new String(str).matches("^[+-]?\\d*(?:\\.\\d*)?(?:[eE][+\\-]?\\d+)?$");
    }
}
```

### 21-调整数组顺序使奇数位于偶数前面
- https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593
- 重排序，奇数在前偶数在后，注意相对位置不能变
- 思路：游标，但要保持相对位置，所以要对子数组再排序
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public void reOrderArray(int [] array) {
        int k = 0;
        for(int i=0; i<array.length; i++) {
            if(Math.abs(array[i])%2 != 0) {
                int j = i;
                while(j > k) {
                    swap(array, j, j-1);
                    j--;
                }
                k++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
```

### 22-链表中倒数第k个结点
- https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a
- 返回倒数第k个节点
- 思路：快慢指针
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        // 边界条件判断
        if(head == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        for(int i=0; i<k; i++) {
            // 如果k大于链表的长度
            if(q == null) {
                return null;
            }
            q = q.next;
        }
        while(q != null) {
            q = q.next;
            p = p.next;
        }
        return p;
    }
}
```

### 23-链表中环的入口结点
- https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4
- 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
- 思路：快慢指针
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        // 边界条件判断
        if(pHead==null || pHead.next==null) {
            return null;
        }
        // 快慢指针
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while(fast != slow);
        
        // 如果存在环，fast从起点slow从相遇点开始，则会在入口处相遇
        fast = pHead;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
```

### 24-反转链表
- https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca
- 反转链表，输出新的头结点
- 思路：递归
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next==null) {
            return head;
        }
        ListNode node = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
```

### 25-合并两个排序的链表
- https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337
- 合并两个单调递增的链表为一个，保持单调递增
- 思路1：递归
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        if(list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        }
        else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
```
- 思路2：迭代
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(list1!=null && list2!=null) {
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }
            else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 != null) {
            cur.next = list1;
        }
        if(list2 != null) {
            cur.next = list2;
        }
        return head.next;
    }
}
```

### 26-树的子结构
- https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88
- 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
- 思路：递归，两个递归方法
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null) {
            return false;
        }
        return isSubtree(root1, root2) || 
            HasSubtree(root1.left, root2) ||
            HasSubtree(root1.right, root2);
    }
    private boolean isSubtree(TreeNode root1, TreeNode root2) {
        // 顺序不能变
        if(root2 == null) {
            return true;
        }
        if(root1 == null) {
            return false;
        }
        if(root1.val != root2.val) {
            return false;
        }
        return isSubtree(root1.left, root2.left) && 
            isSubtree(root1.right, root2.right);
    }
}
```

### 27-二叉树的镜像
- https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011
- 操作给定的二叉树，将其变换为源二叉树的镜像
- 思路：递归
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null) {
            return;
        }
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
```

### 28-对称的二叉树
- https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb
- 判断一颗二叉树是不是对称的
- 思路：递归
-复杂度：O(n)、O(n)
```java
public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) {
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }
    private boolean isSymmetrical(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        if(p==null || q==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSymmetrical(p.left, q.right) && 
            isSymmetrical(p.right, q.left);
    }
}
```

### 29-顺时针打印矩阵
- https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a
- 按顺时针螺旋状打印数组元素
- 思路：定义四个变量表示范围，上下左右边界
- 复杂度：O(n)、O(1)
```java
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix==null || matrix.length==0 || matrix[0].length==0) {
            return res;
        }
        // 定义四个变量表示范围，上下左右边界
        int up=0, down=matrix.length-1, left=0, right=matrix[0].length-1;
        while(up<=down && left<=right) {
            // 先向右记录
            for(int i=left; i<=right; i++) {
                res.add(matrix[up][i]);
            }
            // 再向下记录
            for(int i=up+1; i<=down; i++) {
                res.add(matrix[i][right]);
            }
            // 再向左记录
            if(up != down) {
                for(int i=right-1; i>=left; i--) {
                    res.add(matrix[down][i]);
                }
            }
            // 再向上记录（注意边界）
            if(left != right) {
                for(int i=down-1; i>up; i--) {
                    res.add(matrix[i][left]);
                }
            }
            // 更新边界
            up++;down--;left++;right--;
        }
        return res;
    }
}
```

### 30-包含min函数的栈
- https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49
- 实现一个能够得到栈中所含最小元素的min函数，时间复杂度应为O(1)
- 思路：minStack只push最小值
- 复杂度：O(1)、O(n)
```java
import java.util.Stack;
public class Solution {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    
    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.empty() ? node : Math.min(minStack.peek(), node));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
```

### 31-栈的压入、弹出序列
- https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106
- 输入两个序列，一个是压入序列，一个弹出序列，判断是否匹配
- 思路：用栈模拟
- 复杂度：O(n)、O(n)
```java
import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0 || popA.length==0) {
            return false;
        }
        // 序列的下标索引
        int popIndex = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<pushA.length; i++) {
            stack.push(pushA[i]);
            // 如果栈顶元素与popA的相同，则出栈
            while(!stack.isEmpty() && stack.peek()==popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        // 栈为空，则说明全部匹配
        return stack.isEmpty();
    }
}
```

### 32.1-从上往下打印二叉树
- https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701
- 从上往下，从左向右打印二叉树节点
- 思路：队列
- 复杂度：O(n)、O(n)
```java
import java.util.*;
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            // 当前队列的size就是该层的节点数
            int cnt = queue.size();
            while(cnt-- > 0) {
                TreeNode node = queue.poll();
                if(node == null) {
                    continue;
                }
                res.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return res;
    }
}
```

### 32.2-把二叉树打印成多行
- https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288
- 打印二叉树，按层打印
- 思路：队列
- 复杂度：O(n)、O(n)
```java
import java.util.*;
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()) {
            // 用List存每一层的节点
            ArrayList<Integer> list = new ArrayList<>();
            // 当前队列的size就是该层的节点数
            int cnt = queue.size();
            while(cnt-- > 0) {
                TreeNode node = queue.poll();
                if(node == null) {
                    continue;
                }
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            // 非空判断，不然会添加空list
            if(list.size() != 0) {
                res.add(list);
            }
        }
        return res;
    }
}
```

### 32.3-按之字形顺序打印二叉树
- https://www.nowcoder.com/practice/91b69814117f4e8097390d107d2efbe0
- 先从左向右，再从右向左
- 思路：队列，设置布尔变量rev
- 复杂度：O(n)、O(n)
```java
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        // 设置布尔变量表示逆序
        boolean reverse = false;
        while(!queue.isEmpty()) {
            // 用List存每一层的节点
            ArrayList<Integer> list = new ArrayList<>();
            // 当前队列的size就是该层的节点数
            int cnt = queue.size();
            while(cnt-- > 0) {
                TreeNode node = queue.poll();
                if(node == null) {
                    continue;
                }
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            // 使用Collections反转
            if(reverse == true) {
                Collections.reverse(list);
            }
            reverse = !reverse;
            if(list.size() != 0) {
                res.add(list);
            }
        }
        return res;
    }
}
```

### 33-二叉搜索树的后序遍历序列
- https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd
- 判断数组是否为二叉搜索树后序遍历结果
- 思路：递归
- 复杂度：O(n^2)、O(n)
```java
public class Solution {
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
}
```

### 34-二叉树中和为某一值的路径
- https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca
- 返回二叉树中和为某一值的所有路径
- 思路：回溯法，递归target-node.val
- 复杂度：O(n)、O(h)
```java
import java.util.ArrayList;
public class Solution {
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
}
```

### 35-复杂链表的复制
- https://www.nowcoder.com/practice/f836b2c43afc4b35ad6adc41ec941dba
- 复制一个复杂的链表，不能用原来的引用
- 思路：迭代，分三步进行（插入新节点、建立random链接、拆分）
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        // 1. 插入新节点
        RandomListNode cur = pHead;
        while(cur != null) {
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        // 2. 建立random链接
        cur = pHead;
        while(cur != null) {
            RandomListNode clone = cur.next;
            if(cur.random != null) {
                // random的下一个
                clone.random = cur.random.next;
            }
            cur = clone.next;
        }
        // 3. 拆分
        cur = pHead;
        RandomListNode cHead = pHead.next;
        // 要判断next是否为空
        while(cur.next != null) {
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return cHead;
    }
}
```

### 36-二叉搜索树与双向链表
- https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5
- 将二叉搜索树改成双向链表
- 思路：中序遍历
- 复杂度：O(n)、O(n)
```java
public class Solution {
    // 双向链表左边头结点、右边头结点
    private TreeNode lHead = null;
    private TreeNode rHead = null;
    
    public TreeNode Convert(TreeNode pRootOfTree) {
        // 中序遍历
        if(pRootOfTree == null) {
            return null;
        }
        // 最左的叶子节点作为链表第一个结点
        Convert(pRootOfTree.left);
        if(rHead == null) {
            lHead = pRootOfTree;
            rHead = pRootOfTree;
        }
        else {
            // 根节点插入链表右边，rHead向后移
            rHead.right = pRootOfTree;
            pRootOfTree.left = rHead;
            rHead = pRootOfTree;
        }
        // 插入右叶子节点
        Convert(pRootOfTree.right);
        // 返回左边头结点
        return lHead;
    }
}
```

### 37-序列化二叉树
- https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84
- 序列化和反序列化二叉树，以#结束
- 思路：递归，序列化前序遍历，反序列化
- 复杂度：O(n)、O(n)
```
public class Solution {
    // 使用index设置树节点的val值，
    int index = -1;
    
    String Serialize(TreeNode root) {
        if(root == null) {
            return "#";
        }
        // 前序遍历
        return root.val+" "+Serialize(root.left)+" "+Serialize(root.right);
    }
    
    TreeNode Deserialize(String str) {
        // 将序列化str按分隔符转为数组
        String[] s = str.split(" ");
        index++;
        // 下标越界则返回空
        if(index > s.length) {
            return null;
        }
        // 前序遍历递归，如果值为#返回空节点
        TreeNode t = null;
        if(!s[index].equals("#")) {
            t = new TreeNode(Integer.parseInt(s[index]));
            t.left = Deserialize(str);
            t.right = Deserialize(str);
        }
        return t;
    }
}
```

### 38-字符串的排列
- https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7
- 字符串按字典序排序
- 思路：回溯法，按递归树固定第一位、第二位
- 复杂度：O(n^n)、O(n)
```java
import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str!=null && str.length()>0) {
            backtracking(str.toCharArray(), 0, res);
            // list按字典序排序
            Collections.sort(res);
        }
        return res;
    }
    private void backtracking(char[] cArr, int index, ArrayList<String> list) {
        if(index == cArr.length-1) {
            String str = String.valueOf(cArr);
            if(!list.contains(str)) {
                list.add(str);
            }
        }
        else {
            // 第二层，变换第一位
            for(int i=index; i<cArr.length; i++) {
                swap(cArr, i, index);
                // 第三层，变换第二位
                backtracking(cArr, index+1, list);
                // 再swap一次调整回原样
                swap(cArr, i, index);
            }
        }
    }
    private void swap(char[] cArr, int i, int j) {
        char t = cArr[i];
        cArr[i] = cArr[j];
        cArr[j] = t;
    }
}
```

### 39-数组中出现次数超过一半的数字
- https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163
- 有一个数字出现次数超过了一半，找到则返回，没找到返回0
- 思路：多数投票算法（排序O(nlogn)、哈希时空都是O(n)）
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        // 第一遍扫描，得到候选节点
        int candidate = array[0];
        int count = 1;
        int n = array.length;
        for(int i=1; i<n; i++) {
            // 计数
            if(array[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
            // 改变candidate
            if(count == 0) {
                candidate = array[i];
                count = 1;
            }
        }
        // 第二遍扫描，判断次数是否过半
        count = 0;
        for(int i=0; i<n; i++) {
            if(array[i] == candidate) {
                count++;
            }
        }
        if(count > n/2) {
            return candidate;
        }
        return 0;
    }
}
```

### 40-最小的K个数
- https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf
- 找出数组中最小的k个数
- 思路1：最大堆维护最小堆，适合海量数据输入（直接用最小堆每次添加都要入堆重建）
- 复杂度：O(nlogk)、O(k)
```java
import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k<=0 || k>input.length) {
            return new ArrayList<>();
        }
        // 最大堆维护最小堆，只剩k个最小的
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> o2-o1);
        for(int num : input) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return new ArrayList<>(pq);
    }
}
```
- 思路2：Partition快速选择，会修改数组
- 复杂度：O(n)、O(1)
```java
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        // 边界条件，注意k的边界
        if(input==null || input.length==0 || k<=0 || k>input.length) {
            return res;
        }
        // 返回前k个是最小的
        findKSmall(input, k-1);
        for(int i=0; i<k; i++) {
            res.add(input[i]);
        }
        return res;
    }
    private void findKSmall(int[] nums, int k) {
        int l=0, r=nums.length-1;
        while(l < r) {
            int i = partition(nums, l, r);
            if(i == k) {
                break;
            }
            if(i > k) {
                r = i - 1;
            }
            else {
                l = i + 1;
            }
        }
    }
    private int partition(int[] nums, int l , int r){
        int p = nums[l];
        int i=l, j=r+1;
        while(true) {
            while(i!=r && nums[++i]<p);
            while(j!=l && nums[--j]>p);
            if(i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
```

### 41.1-数据流中的中位数
- https://www.nowcoder.com/practice/9be0172896bd43948f8a32fb954e1be1
- 实现添加和获取中位数操作
- 思路：两个优先队列
- 复杂度：O(n)、O(n)
```java
import java.util.*;
public class Solution {
    // 最大堆：左边是较小的元素
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2-o1);
    // 最小堆：右边是较大的元素
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    // 个数
    private int n = 0;
    
    public void Insert(Integer num) {
        n++;
        // 保证两个堆平衡
        if(n%2 == 0) {
            // 偶数：添加最小的到左边
            right.add(num);
            left.add(right.poll());
        }
        else {
            // 奇数：添加最大的到右边
            left.add(num);
            right.add(left.poll());
        }
    }

    public Double GetMedian() {
        if(n%2 == 0 ) {
            return (left.peek()+right.peek())/2.0;
        }
        else {
            return (double) right.peek();
        }
    }
}
```

### 41.2-字符流中第一个不重复的字符
- https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720
- 找出第一个不重复的字符
- 思路：hash+队列
- 复杂度：O(n)、O(n)
```java
import java.util.*;
public class Solution {
    private int[] hash = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        hash[ch]++;
        queue.add(ch);
        // 重复的字符出队
        while(!queue.isEmpty() && hash[queue.peek()]>1) {
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if(queue.isEmpty()) {
            return '#';
        }
        else {
            return queue.peek();
        }
    }
}
```

### 42-连续子数组的最大和
- https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484
- 求连续的子数组之和的最大值
- 思路：动态规划，如果和小于等于0重新加，否则累加
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null || array.length==0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : array) {
            if(sum <= 0) {
                sum = num;
            } 
            else {
                sum += num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
```

### 43-从1到n整数中1出现的次数
- https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6
- 计算从1开始到n，出现的1的次数
- 思路：分别计算个位、十位、百位...上1出现的次数
- 复杂度：O(logn)、O(1)
```java
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i*=10) {
            // 高位a，低位b
            int a = n/i, b = n%i;
            // 加8处理：当百位为0，则a/10==(a+8)/10，当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a+8)/10*i;
            // b+1处理：当百位对应0或>=2时，有(a+8)/10次包含所有100个点，还有当百位为1(a%10==1)
            if(a%10 == 1) {
                count += b+1;
            }
        }
        return count;
    }
}
```

### 44-数字序列中的某一位数字
- 序列化012345678910...，求第n位对应的数字
- 思路：找规律
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public int getDigitAtIndex(int index) {
        if(index < 0) {
            return -1;
        }
        // 1是个位，2是百位...
        int place = 1;
        while(true) {
            int amount = getAmountOfPlace(place);
            int total = amount*place;
            if(index < total) {
                return getDigitAtIndex(index, place);
            }
            index -= total;
            place++;
        }
    }
    /**
     * place位数的数字组成的字符串长度：10,90,900
     */
    private int getAmountOfPlace(int place) {
        if(place == 1) {
            return 10;
        }
        return (int) Math.pow(10, place-1)*9;
    }
    /**
     * place位数组成的字符串中，第index个数
     */
    private int getDigitAtIndex(int index, int place) {
        int begin = getBeginNumberOfPlace(place);
        int shift = index / place;
        String num = (begin + shift) + "";
        int count = index % place;
        return num.charAt(count) - '0';
    }
    /**
     * place位数的起始数字
     */
    private int getBeginNumberOfPlace(int place) {
        if(place == 1) {
            return 0;
        }
        return (int) Math.pow(10, place-1);
    }
}
```

### 45-把数组排列成最小的数
- https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993
- 数组的数字排序组成最小的一个数
- 思路：排序
- 复杂度：O(n)、O(1)
```java
import java.util.*;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null || numbers.length==0) {
            return "";
        }
        int n = numbers.length;
        // 转换为字符串数组
        String[] nums = new String[n];
        for(int i=0; i<n; i++) {
            nums[i] = numbers[i]+"";
        }
        // 字符串数组排序：比较s1+s2和s2+s1的大小
        Arrays.sort(nums, (s1,s2)->(s1+s2).compareTo(s2+s1));
        String res = "";
        for(String num : nums) {
            res += num;
        }
        return res;
    }
}
```

### 46-把数字翻译成字符串
- 将数字对应成字母，计算一个数字对应的字符串有几种
- 思路：动态规划
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        // 判断首位是否为零
        dp[1] = s.charAt(0)=='0' ? 0 : 1;
        for(int i=2; i<=n; i++) {
            // 当前位的数字
            int one = Integer.parseInt(s.substring(i-1, i));
            if(one != 0) {
                dp[i] += dp[i-1];
            }
            if(s.charAt(i-2) == '0') {
                continue;
            }
            // 两位数字
            int two = Integer.parseInt(s.substring(i-2, i));
            // 累加次数
            if(two <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}
```

### 47-礼物的最大值
- https://www.nowcoder.com/questionTerminal/72a99e28381a407991f2c96d8cb238ab
- 在m*n的棋盘格里，从左上角开始拿礼物，求礼物拿到的最大值
- 思路：动态规划（dfs不是最优解）
- 复杂度：O(n^2)、O(n)
```java
public class Solution {
    public int getMost(int [][] values) {
        if(values==null || values.length==0 || values[0].length==0) {
            return 0;
        }
        int n = values[0].length;
        int[] dp = new int[n];
        for(int[] value : values) {
            dp[0] += value[0];
            for(int i=1; i<n; i++) {
                dp[i] = Math.max(dp[i], dp[i-1]) + value[i];
            }
        }
        return dp[n-1];
    }
}
```

### 48-最长不含重复字符的子字符串
- https://leetcode.com/problems/longest-substring-without-repeating-characters/
- 找不含重复字符的子字符串，使其最长
- 思路：滑动窗口
- 复杂度：O(n)、O(len(charset))
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 非空判断
        if(s==null || s.length()==0) {
            return 0;
        }
        // 滑动窗口为s[l...r]
        int l=0, r=-1;
        // 记录字符频率
        int[] freq = new int[256];
        int max = Integer.MIN_VALUE;

        while(l < s.length()) {
            // 右边界往前移动
            if(r+1<s.length() && freq[s.charAt(r+1)]==0) {
                // 需判断数组下标是否越界
                freq[s.charAt(++r)]++;
            }
            else {
                freq[s.charAt(l++)]--;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}
``` 

### 49-丑数
- https://www.nowcoder.com/practice/6aa9e04fc3794f68acf8778237ba065b
- 丑数的因子只包含2,3,5，输出第index个丑数
- 思路：动态规划，丑数可分解为2^x * 3^y * 5^z
- 复杂度：O(n)、O(n)
```java
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        // 丑数：因子只含2,3,5
        if(index <= 6) {
            return index;
        }
        int i2=0, i3=0, i5=0;
        int[] dp = new int[index];
        // 1是第一个丑数
        dp[0] = 1;
        for(int i=1; i<index; i++) {
            int two=dp[i2]*2, three=dp[i3]*3, five=dp[i5]*5;
            // 取三者的最小值
            dp[i] = Math.min(two, Math.min(three, five));
            // 丑数 = 2^x * 3^y * 5^z
            if(dp[i] == two) { i2++; }
            if(dp[i] == three) { i3++; }
            if(dp[i] == five) { i5++; }
        }
        return dp[index-1];
    }
}
```

### 50-第一个只出现一次的字符
- https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c
- 找字符串中，第一个频率为1的字符
- 思路1：HashMap计算频率
- 复杂度：O(n)、O(n)
```java
import java.util.HashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        // 计算频率：Map
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : str.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }
            else {
                map.put(c, map.get(c)+1);
            }
        }
        // 找第一个频率为1的字符
        for(int i=0; i<str.length(); i++) {
            if(map.get(str.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}
```
- 思路2：优化空间复杂度，用数组代替HashMap（再进一步BitSet存01）
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int[] hash = new int[256];
        // 优化计算频率：数组
        for(int i=0; i<str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        // 找第一个频率为1的字符
        for(int i=0; i<str.length(); i++) {
            if(hash[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
```

### 51-数组中的逆序对
- https://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5
- 逆序对：前面的数字大于后面
- 思路：二路归并时计算（暴力TLE）
- 复杂度：O(logn)、O(1)
```java
public class Solution {
    private long cnt = 0;
    // 辅助数组
    private int[] tmp;
    public int InversePairs(int [] array) {
        // 二路归并
        tmp = new int[array.length];
        mergeSort(array, 0, array.length-1);
        // %运算必须加括号
        return (int) (cnt%1000000007);
    }
    private void mergeSort(int[] nums, int l, int r) {
        if(r-l < 1) {
            return;
        }
        int mid = l + (r-l)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }
    private void merge(int[] nums, int l, int mid, int r) {
        int i=l, j=mid+1, k=l;
        while(i<=mid || j<=r) {
            if(i > mid) {
                tmp[k] = nums[j++];
            }
            else if(j > r) {
                tmp[k] = nums[i++];
            }
            else if(nums[i] <= nums[j]) {
                tmp[k] = nums[i++];
            }
            else {
                tmp[k] = nums[j++];
                // nums[i] > nums[j]，说明 nums[i...mid] 都大于 nums[j]
                this.cnt += mid-i+1;
            }
            k++;
        }
        for(k=l; k<=r; k++) {
            nums[k] = tmp[k];
        }
    }
}
```

### 52-两个链表的第一个公共节点
- https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46
- 返回两个链表的公共节点
- 思路：遍历两遍链表，控制两者同时访问到交点
- 复杂度：O(m+n)、O(1)
```java
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         // p1到尾时从p2头开始，p2到尾时从p1头开始
        ListNode p1=pHead1, p2=pHead2;
        while(p1 != p2) {
            // p1 = (p1==null) ? pHead2 : p1.next;
            if(p1==null) {
                p1 = pHead2;
            }
            else {
                p1 = p1.next;
            }
            
            if(p2==null) {
                p2 = pHead1;
            }
            else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
```

### 53-数字在排序数组中出现的次数
- https://www.nowcoder.com/practice/70610bf967994b22bb1c26f9ae901fa2
- 统计一个数字在排序数组中出现的次数
- 思路：使用二分法可以把复杂度降至O(logn)
- 复杂度：O(logn)、O(1)
```java
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       // 二分搜索k两端，求下标之差
        int l = binarySearch(array, k-0.5);
        int r = binarySearch(array, k+0.5);
        return r-l;
    }
    private int binarySearch(int[] nums, double target) {
        // target为double类型
        int l=0, r=nums.length-1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(target <= nums[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        // 返回最左边的开始下标
        return l;
    }
}
```

### 59-滑动窗口的最大值
- https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788
- 找数组中，窗口大小为size里的最大值，返回list
- 思路1：直接遍历，for查找最大值
- 复杂度：O((n-size)*size)、O(1)
```java
import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        // 边界条件判断
        if(size==0) {
            return res;
        }
        for(int i=0; i<=num.length-size; i++) {
            int max = 0;
            for(int j=0; j<size; j++) {
                max = Math.max(num[i+j], max);
            }
            res.add(max);
        }
        return res;
    }
}
```
- 思路2：堆，维护一个大小为size的最大堆
- 复杂度：O(n)、O(size)
```java
import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        // 边界条件判断
        if(size < 1 || size > num.length) {
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2-o1);
        for(int i=0; i<size; i++) {
            maxHeap.add(num[i]);
        }
        res.add(maxHeap.peek());
        // i从1到n-size
        for(int i=1; i<=num.length-size; i++) {
            // 删除上一个访问过的元素
            maxHeap.remove(num[i-1]);
            // 添加size长度的下一个元素
            maxHeap.add(num[i+size-1]);
            res.add(maxHeap.peek());
        }
        return res;
    }
}
```