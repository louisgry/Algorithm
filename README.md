# Algorithm
- [LeetCode](#LeetCode)
- [剑指Offer](#剑指Offer)

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