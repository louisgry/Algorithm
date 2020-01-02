# Algorithm
- [LeetCode](#LeetCode)：[leetcode](https://github.com/louisgry/Algorithm/tree/master/leetcode)
- [剑指Offer](#剑指Offer)：[swordoffer](https://github.com/louisgry/Algorithm/tree/master/swordoffer)

## LeetCode
> 题解：https://github.com/louisgry/Algorithm/tree/master/leetcode

- 数据结构
    - [stack](#stack)
    - [queue](#queue)
    - [linkedlist](#linkedlist)
    - [binarytree](#binarytree)
    - [collection](#collection)
- 算法思想
    - [cursor](#cursor)
    - [partition](#partition)
    - [pointers](#pointers)
    - [window](#window)
    - [dp](#dp)
    - [greedy](#greedy)
    - [backtracking](#backtracking)
    - [math](#math)

## 数据结构
### stack
- [栈](#栈)
    - [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)：[【20题解】](#20题解) 
    - [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)：[【144题解】](#144题解)
    - more
    - [150. Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)：[【150题解】](#150题解)
    - [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)：[【42题解】](#42题解)

### queue
- [队列](#队列)
    - [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)：[【347题解】](#347题解)
    - [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)：[【102题解-BFS】](#102题解)
    - [279. Perfect Squares](https://leetcode.com/problems/perfect-squares/)：[【279题解-BFS】](#279题解-BFS)

### linkedlist
- [链表](#链表)
    - [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)：[【206题解】](#206题解)
    - [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)：[【203题解】](#203题解)
    - [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)：[【24题解】](#24题解)
    - [237. Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)：[【237题解】](#237题解)
    - [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)：[【19题解】](#19题解)
    - more
    - [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)：[【234题解】](#234题解)

### binarytree
- [二叉树](#二叉树)
    - [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)：[【104题解】](#104题解)
    - [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)：[【11题解】](#111题解)
    - [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)：[【226题解】](#226题解)
    - [112. Path Sum](https://leetcode.com/problems/path-sum/)：[【112题解】](#112题解)
    - [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)：[【257题解】](#257题解)
    - [437. Path Sum III](https://leetcode.com/problems/path-sum-iii/)：[【437题解】](#437题解)
    - [235. Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)：[【235题解】](#235题解)
    - more
    - [100. Same Tree](https://leetcode.com/problems/same-tree/)：[【100题解】](#100题解)
    - [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)：[【101题解】](#101题解)
    - [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/)：[【222题解】](#222题解)
    - [110. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)：[【110题解】](#110题解)
    - [404. Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)：[【404题解】](#404题解)
    - [113. Path Sum II](https://leetcode.com/problems/path-sum-ii/)：[【113题解】](#113题解)
    - [129. Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/)：[【129题解】](#129题解)

### collection
- [查找表](#查找表)
    - [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)：[【349题解】](#349题解)
    - [350. Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)：[【350题解】](#350题解)
    - [1. Two Sum](https://leetcode.com/problems/two-sum/)：[【1题解-Map】](#1题解-Map)
    - [454. 4Sum II](https://leetcode.com/problems/4sum-ii/)：[【454题解】](#454题解)
    - [447. Number of Boomerangs](https://leetcode.com/problems/number-of-boomerangs/)：[【447题解】](#447题解)
    - [219. Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)：[【219题解】](#219题解)
    - [220. Contain Duplicate III](https://leetcode.com/problems/contains-duplicate-iii/)：[【220题解】](#220题解)
    - more
    - [136. Single Number](https://leetcode.com/problems/single-number/)：[【136题解】](#136题解)
    - [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)：[【242题解】](#242题解)
    - [202. Happy Number](https://leetcode.com/problems/happy-number/)：[【202题解】](#202题解)
    - [290. Word Pattern](https://leetcode.com/problems/word-pattern/)：[【290题解】](#290题解)
    - [804. Unique Morse Code Words](https://leetcode.com/problems/unique-morse-code-words/)：[【804题解】](#804题解)

## 算法思想
### cursor
- [游标](#游标)
    - [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/)：[【283题解】](#283题解)
    - more
    - [27. Remove Element](https://leetcode.com/problems/remove-element/)：[【27题解】](#27题解)
    - [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)：[【122题解】](#122题解)

### partition
- [Partition](#Partition)
    - [75. Sort Colors](https://leetcode.com/problems/sort-colors/)：[【75题解】](#75题解)
    - [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)：[【215题解】](#215题解)


### pointers
- [双指针](#双指针)
    - [167. Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)：[【167题解】](#167题解)
    - [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)：[【11题解】](#11题解)
    - [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)：[【125题解】](#125题解)
    - [345. Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)：[【345题解】](#345题解)


### window
- [滑动窗口](#滑动窗口)
    - [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)：[【209题解】](#209题解)
    - [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)：[【3题解】](#3题解)
    - [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)：[【438题解】](#438题解)
    - [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)：[【76题解】](#76题解)
    - [567. Permutation in String](https://leetcode.com/problems/permutation-in-string/)：[【567题解】](#567题解)
    - [424. Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/)：[【424题解】](#424题解)


### dp
- [动态规划](#动态规划)
    - [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)：[【70题解】](#70题解)
    - [343. Integer Break](https://leetcode.com/problems/integer-break/)：[【343题解】](#343题解)
    - [198. House Robber](https://leetcode.com/problems/house-robber/)：[【198题解】](#198题解)
    - [279. Perfect Squares](https://leetcode.com/problems/perfect-squares/)：[【279题解】](#279题解)
    - [91. Decode Ways](https://leetcode.com/problems/decode-ways/)：[91题解](#91题解)
    - [416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)：[【416题解】](#416题解)
    - [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)：[【300题解】](#300题解)
    - [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)：[【1143题解】](#1143题解)

### greedy
- [贪心](#贪心)
    - [455. Assign Cookies](https://leetcode.com/problems/assign-cookies/)：[【455题解】](#455题解)
    - [435. Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)：[【435题解】](#435题解)

### backtracking
- [回溯](#回溯)
    - [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)：[【17题解】](#17题解)
    - [46. Permutations](https://leetcode.com/problems/permutations/)：[【46题解】](#46题解)
    - [77. Combinations](https://leetcode.com/problems/combinations/)：[【77题解】](#77题解)
    - [79. Word Search](https://leetcode.com/problems/word-search/)：[【79题解】](#79题解)
    - [200. Number of Islands](https://leetcode.com/problems/number-of-islands/)：[【200题解】](#200题解)
    - [51. N Queens](https://leetcode.com/problems/n-queens/)：[【51题解】](#51题解)
    
### math
- [数学](#数学)
    - [136. Single Number](https://leetcode.com/problems/single-number/)：[【136题解-异或】](#136题解-异或)
    - [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/)：[【9题解】](#9题解)


## 剑指Offer
> 题解：https://github.com/louisgry/Algorithm/tree/master/swordoffer


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

### 数组
- [3-数组中重复的数字](https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8)：[3题解](#3-数组中重复的数字)
- [4-二维数组中的查找](https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e)：[4题解](#4-二维数组中的查找)
- [21-调整数组顺序使奇数位于偶数前面](https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593)：[21题解](#21-调整数组顺序使奇数位于偶数前面)
- [29-顺时针打印矩阵](https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a)：[29题解](#29-顺时针打印矩阵)

### 字符串
- [5-替换空格](https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423)：[5题解](#5-替换空格)
- [19-正则表达式匹配](https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c)：[19题解](#19-正则表达式匹配)
- [20-表示数值的字符串](https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2)：[20题解](#20-表示数值的字符串)

### 链表
- [6-从尾到头打印链表](https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035)：[6题解](#6-从尾到头打印链表)
- [18-删除链表中重复的节点](https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef)：[18题解](#18-删除链表的节点)
- [22-链表中倒数第k个结点](https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a)：[22题解](#22-链表中倒数第k个结点)
- [23-链表中环的入口结点](https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4) ：[23题解](#23-链表中环的入口结点)
- [24-反转链表](https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca)：[24题解](#24-反转链表)
- [25-合并两个排序的链表](https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337)：[25题解](#25-合并两个排序的链表)

### 树
- [7-重建二叉树](https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6)：[7题解](#7-重建二叉树)
- [8-二叉树的下一个节点](https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e)：[8题解](#8-二叉树的下一个节点)
- [26-树的子结构](https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88)：[26题解](#26-树的子结构)
- [27-二叉树的镜像](https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011)：[27题解](#27-二叉树的镜像)
- [28-对称的二叉树](https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb)：[28题解](#28-对称的二叉树)

### 栈
- [9-用两个栈来实现队列](https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6)：[9题解](#9-用两个栈来实现队列)
- [30-包含min函数的栈](https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49)：[30题解](#30-包含min函数的栈)

### 递归与循环
- [10-斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3)：[10题解](#10-斐波那契数列)

### 查找和排序
- [11-旋转数组的最小数字](https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba)：[11题解](#11-旋转数组的最小数字)

### 回溯法
- [12-矩阵中的路径](https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc)：[12题解](#12-矩阵中的路径)
- [13-机器人的运动范围](https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8)：[13题解](#13-机器人的运动范围)

### 动态规划
- [14-剪绳子](https://www.nowcoder.com/practice/57d85990ba5b440ab888fc72b0751bf8)：[14题解](#14-剪绳子)

### 其他
- [15-二进制中1的个数](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8)：[15题解](#15-二进制中1的个数)
- [16-数值的整数次方](https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00)：[16题解](#16-数值的整数次方)
- 17-打印从1到最大的n位数：[17题解](#17-打印从1到最大的n位数)


