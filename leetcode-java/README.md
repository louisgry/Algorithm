
# LeetCode分类汇总 (Java)
> https://github.com/louisgry/Algorithm/tree/master/leetcode

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
    - [160-相交链表](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/)：[160题解](#160-相交链表)

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

# 题解
## 栈
### 20题解
- stack
    - 20 Valid Parentheses：https://leetcode.com/problems/valid-parentheses/
        - 判断括号是否匹配
        - Input: "()[]{}"
        - Output: true
    - 思路：栈（只关心最近一次操作）
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    public boolean isValid(String s) {
        // 遍历string
        // -- 如果是左括号，压入栈
        // -- 如果是右括号，弹出栈
        // ---- 如果不匹配，返回false
        // ---- 如果for结束，栈不为空，返回false
        // ---- 否则，返回true
       
        Stack<Character> stack = new Stack<Character>();
        char[] matchs = {'(', '{', '['};
       
        for(int i=0; i<s.length(); i++) {
            // s.charAt(i) (
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                stack.push(s.charAt(i));   
            }
            else {
                // 【Runtime Error："]"】没有进行size为0的判断
                if(stack.size()==0) {
                    return false;
                }
                char c = stack.pop();
                char match;
                if(s.charAt(i)==')') {
                    match = matchs[0];
                }
                else if(s.charAt(i)=='}') {
                    match = matchs[1];
                }
                else {
                    match = matchs[2];
                }
               
                if(c != match) {
                    return false;
                }
            }
        }
       
        if(stack.size()!=0) {
            return false;
        }
        return true;
    }
    ```

### 144题解
- stack
    - 144 Binary Tree Preorder Traversal：https://leetcode.com/problems/binary-tree-preorder-traversal/
        - 二叉树的前序遍历
        - Input: binary tree [1,2,3]
        - Output: [1,2,3]
    - 思路1：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public List<Integer> preorderTraversal(TreeNode root) {
        // 递归解法：根节点->左节点->右节点
        // 要返回List，所以需要辅助函数来做递归

        List<Integer> res = new ArrayList<Integer>();
        preorderTraversal(root, res);
        return res;
    }
    private void preorderTraversal(TreeNode root, List<Integer> res) {
        // condition
        if(root == null) {
            return;
        }
        // recursion
        res.add(root.val);
        preorderTraversal(root.left, res);
        preorderTraversal(root.right, res);
    }
    ```
    - 思路2：非递归（栈+Command）
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public List<Integer> preorderTraversal(TreeNode root) {
        // 非递归解法：栈（递归的本质是栈）
        // 把第一个指令go-root压入栈，while循环直到stack为空
        // -- 如果指令是print，把command.node的值add进List
        // -- 否则指令就是go，把指令倒序压入stack：print-root, go-left, go-right
       
        List<Integer> res = new ArrayList<Integer>();
        // 【Runtime Error: []】没有进行非空判断
        if(root == null) {
            return res;
        }
        Stack<Command> stack = new Stack<Command>();
        stack.push(new Command("go", root));
        while(!stack.empty()) {
            // 取出栈顶元素
            Command command = stack.pop();
            if(command.s == "print") {
                res.add(command.node.val);
            }
            else {
                // 如果是go命令，倒序压入指令
                if(command.node.right != null) {
                    stack.push(new Command("go", command.node.right));
                }
                if(command.node.left != null) {
                    stack.push(new Command("go", command.node.left));
                }
                stack.push(new Command("print", command.node));
            }
        }
        return res;
    }
    public class Command {
        // 指令：print、go
        String s;
        // 指令要作用于某个节点上
        TreeNode node;
        Command(String s, TreeNode node) {
            this.s = s;
            this.node = node;
        }
    }
    ```

### 150题解
- 150 Evaluate Reverse Polish Notation：https://leetcode.com/problems/evaluate-reverse-polish-notation/
    - 逆波兰表达式求值
    - Input: ["2", "1", "+", "3", "*"]
    - Output: 9
    - Explanation: ((2 + 1) * 3) = 9
- 思路：Stack存num，遇到运算符pop，注意减和除的处理
- 复杂度：O(n)、O(n)
```java
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<tokens.length; i++) {
            if(tokens[i].equals("+")) {
                stack.push(stack.pop()+stack.pop());
            }
            else if(tokens[i].equals("-")) {
                int num = stack.pop();
                stack.push(stack.pop()-num);
            }
            else if(tokens[i].equals("*")) {
                stack.push(stack.pop()*stack.pop());
            }
            else if(tokens[i].equals("/")) {
                int num = stack.pop();
                stack.push(stack.pop()/num);
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
```

### 42题解
- 42 Trapping Rain Water：https://leetcode.com/problems/trapping-rain-water/
    - 接雨水
    - Input: [0,1,0,2,1,0,1,3,2,1,2,1]
    - Output: 6
- 思路1：暴力解法
- 复杂度：O(n^2)、O(n)
```java
    public int trap(int[] height) {
        // 暴力解法
        int res = 0;
        for(int i=1; i<height.length; i++) {
            int maxLeft = 0, maxRight = 0;
            // 往左
            for(int j=i; j>=0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            // 往右
            for(int j=i; j<height.length; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            res += Math.min(maxLeft, maxRight)-height[i];
        }
        return res;
    }
```
- 思路2：Stack
- 复杂度：O(n)、O(n)
```java
    public int trap(int[] height) {
        // Stack
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0, i = 0;
        while(i < height.length) {
            if(stack.empty() || height[i]<height[stack.peek()]) {
                // 左边界坐标入栈
                stack.push(i);
                i++;
            }
            else {
                // 栈顶元素就是可以装雨水的坑
                int hole_idx = stack.pop();
                if (stack.empty()) {
                    continue;
                }
                // 距离=右边界坐标-左边界坐标-1
                int dist = i - stack.peek() - 1;
                // 新栈顶是左边界，取左右的最小高度减去坑的高度
                int h = Math.min(height[i], height[stack.peek()])-height[hole_idx];
                res += dist * h;
            }
        }
        return res;
    }
```

## 队列
### 347题解
- queue
    - 347 Top K Frequent Elements：https://leetcode.com/problems/top-k-frequent-elements/
        - 返回前k个出现频率最高的元素
        - Input: nums = [1,1,1,2,2,3], k = 2
        - Output: [1,2]
    - 思路：前K大（优先队列+PairComparator），频率（Map）
    - 时间复杂度：O(nlogk)
    - 空间复杂度：O(n+k)
    ```java
    import javafx.util.Pair;

    public List<Integer> topKFrequent(int[] nums, int k) {
        // 优先队列，频率为优先级(频率，元素)
        // 怎么计算频率：Map（元素，频率）
        // 怎么根据频率排序：PairComparator
       
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
       
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(new PairComparator());
        for(Integer num : map.keySet()) {
            int freq = map.get(num);
            // 维护最高的k个：如果频率大于队首的频率，队首出队，该元素入队
            if(pq.size() == k) {
                if(freq > pq.peek().getKey()) {
                    pq.poll();
                    pq.add(new Pair<Integer, Integer>(freq, num));
                }
            }
            else {
                pq.add(new Pair<Integer, Integer>(freq, num));
            }
        }
       
        List<Integer> res = new ArrayList<Integer>();
        while(!pq.isEmpty()) {
            res.add(pq.poll().getValue());
        }
        return res;
    }
    private class PairComparator implements Comparator<Pair<Integer, Integer>> {
        @Override
        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
            if(p1.getKey() != p2.getKey()){
                return p1.getKey() - p2.getKey();
            }
            return p1.getValue() - p2.getValue();
        }
    }
    ```
 
### 102题解
- queue
    - 102 Binary Tree Level Order Traversal：https://leetcode.com/problems/binary-tree-level-order-traversal/
        - 二叉树的层序遍历
        - Input: binary tree [3,9,20,null,null,15,7]
        - Output: [[3], [9,20], [15,7]]
    - 思路：基于队列的BFS层次遍历
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    import javafx.util.Pair;

    public List<List<Integer>> levelOrder(TreeNode root) {
        // 层次遍历：BFS（基于队列）
        // 先进行非空判断
        // 队列（节点值，层）：LinkedList<Pair<TreeNode, Integer>>
        // 初始化是(root, 0)
        // 当queue不为空时，while循环
        // -- 如果level==res.size()：是新一层，res新增list
        // -- 把值add进level层的res
        // -- 如果有左子树，入队left，level+1
        // -- 如果有右子树，入队right，level+1
       
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        queue.add(new Pair<>(root, 0));
        while(!queue.isEmpty()) {
            Pair<TreeNode, Integer> front = queue.poll();
            TreeNode node = front.getKey();
            int level = front.getValue();
            // 新的一层
            if(level == res.size()) {
                res.add(new ArrayList<>());
            }
            // 把值放到level层的res
            res.get(level).add(node.val);
            if(node.left != null) {
                queue.add(new Pair<TreeNode, Integer>(node.left, level+1));
            }
            if(node.right != null) {
                queue.add(new Pair<TreeNode, Integer>(node.right, level+1));
            }
        }
        return res;
    }
    ```

### 279题解-BFS
- queue
    - 279 Perfect Squares：https://leetcode.com/problems/perfect-squares/
        - 给定一个正整数n，求其由最少个完全平方数组成的和等于n的个数
        - Input: n = 13
        - Output: 2
        - Explanation: 13 = 4 + 9.
    - 思路：转化为BFS求无权图的最短路径
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    import javafx.util.Pair;

    public int numSquares(int n) {
        // BFS求无权图中n到0的最短路径问题：node是数字，edge为是否相差一个完全平方数
        // 声明队列<num, step>，先入队<数字：n, 步数：0>
        // 声明BFS的visited数组(0到n个)。最后一个数字n设为已访问
        // 当队列不为空时，while循环
        // -- 取出队首，若num为0，return step
        // -- for循环，i从1开始自增，当num-i*i>=0
        // ---- 如果num-i*i没有被访问过，入队，step+1。且visited设为true
       
        Queue<Pair<Integer, Integer>> queue = new LinkedList<Pair<Integer, Integer>>();
        boolean[] visited = new boolean[n+1];
        queue.add(new Pair(n, 0));
        visited[n] = true;
        while(!queue.isEmpty()) {
            Pair<Integer, Integer> front = queue.poll();
            int num = front.getKey();
            int step = front.getValue();
            if(num == 0) {
                return step;
            }
            for(int i=0; num-i*i>=0; i++) {
                if(!visited[num-i*i]) {
                    queue.add(new Pair(num-i*i, step+1));
                    visited[num-i*i] = true;
                }
            }
        }
        throw new IllegalStateException("no solution");
    }
    ```

## 链表
### 206题解
- linkedlist
    - 206 Reverse Linked List：https://leetcode.com/problems/reverse-linked-list/
        - 反转一个链表
        - Input: 1->2->3->4->5->NULL
        - Output: 5->4->3->2->1->NULL
    - 思路1：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    public ListNode reverseList(ListNode head) {
        // condition
        if(head==null || head.next==null) {
            return head;
        }

        // recursion
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
       
        return node;
    }
    ```
    - 思路2：迭代
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
           
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    ```

### 203题解
- linkedlist
    - 203 Remove Linked List Elements：https://leetcode.com/problems/remove-linked-list-elements/
        - 删除链表中特定值的所有元素
        - Input: 1->2->6->3->4->5->6, val = 6
        - Output: 1->2->3->4->5
    - 思路：dummy head
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
       
        ListNode cur = dummyHead;
        while(cur.next != null) {
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
    ```

### 24题解
- linkedlist
    - 24 Swap Nodes in Pairs：https://leetcode.com/problems/swap-nodes-in-pairs/
        - 链表两两交换节点
        - Input: 1->2->3->4->null
        - Output: 2->1->4->3->null
    - 思路：dummy head
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public ListNode swapPairs(ListNode head) {
        // 涉及头结点：dummyHead，四指针（p、node1、node2、next）
        // 定义pre指向dummyHead
        // while循环：当pre.next(node1)和pre.next.next(node2)不为空时
        // -- 定义node1、node2
        // -- 更改指向
        // -- 将pre指向下一个目标之前(node1)
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
       
        ListNode pre = dummyHead;
       
        while(pre.next != null && pre.next.next != null) {
            ListNode node1 = pre.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;
           
            pre.next = node2;
            node2.next = node1;
            node1.next = next;
           
            pre = node1;
        }
       
        return dummyHead.next;
    }
    ```
 
### 237题解
- linkedlist
    - 237 Delete Node in a Linked List：https://leetcode.com/problems/delete-node-in-a-linked-list/
        - 给定链表中的一个节点，删除该节点
        - Input: head = [4,5,1,9], node = 5
        - Output: [4,1,9]
        - Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
    - 思路：修改链表的值
    - 时间复杂度：O(1)
    - 空间复杂度：O(1)
    ```java
    public void deleteNode(ListNode node) {
        if(node == null) {
            return;
        }
        if(node.next == null){
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }
    ```
 
### 19题解
- linkedlist
    - 19 Remove Nth Node From End of List：https://leetcode.com/problems/remove-nth-node-from-end-of-list/
        - 删除链表的倒数第N个元素
        - Input: 1->2->3->4->5, n = 2
        - Output: 1->2->3->5
    - 思路：双指针，p和q之间的长度是固定的，只遍历一遍
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
       
        ListNode p = dummyHead;
        ListNode q = dummyHead;
        for(int i=0; i<n+1; i++){
            assert q != null;
            q = q.next;
        }
       
        while(q != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
       
        return dummyHead.next;
    }
    ```
    - 基础解法：遍历两遍，第一遍求链表的size，第二遍使用dummyHead删除第size-n个元素
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
       
        ListNode cur = dummyHead.next;
        int index = 0;
        while(cur != null){
            index ++;
            cur = cur.next;
        }
        cur = dummyHead;
        for(int i=0; i<index-n; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummyHead.next;
    }
    ```
 
### 234题解
- linkedlist
    - 234 Palindrome Linked List：https://leetcode.com/problems/palindrome-linked-list/
        - 判断链表是否是回文的
        - Input: 1->2->2->1
        - Output: true
    - 思路：双指针
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while(q!=null && q.next!=null) {
            q = q.next.next;
            p = p.next;
        }
        if(q != null){
            p = p.next;
        }
        p = reverse(p);

        q = head;
        while(p != null) {
            if(p.val != q.val){
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }
    private ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    ```

### 160-相交链表
- https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
- 编写程序，找到两个链表的相交节点
- 思路：两个节点同时开始，若pA到尾部移到pB链，若pB到尾部移到pA链，最终会同时走到相交节点处
- 复杂度：O(n)、O(1)
```java
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // pA, pB同时开始
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB) {
            // 若pA到尾部移到pB链，若pB到尾部移到pA链
            if(pA == null) {
                pA = headB;
            }
            else {
                pA = pA.next;
            }
            if(pB == null) {
                pB = headA;
            }
            else {
                pB = pB.next;
            }      
        }
        // 会同时走到相交节点处
        return pA;
    }
}
```

## 二叉树
### 104题解
- 104题解
    - 104 Maximum Depth of Binary Tree：https://leetcode.com/problems/maximum-depth-of-binary-tree/
        - 返回二叉树的最大深度
        - Input: Given binary tree [3,9,20,null,null,15,7]
        - Output: 3
    - 知识：深度K=「log2n」+1（向下取整）
    - 思路：递归
    - 时间复杂度：O(n)，n是节点数
    - 空间复杂度：O(h)，h是树深度
    ```java
    public int maxDepth(TreeNode root) {
        // 递归终止条件
        if (root==null) {
            return 0;
        }
        // 递归过程
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
    ```
 
### 111题解
- 111题解
    - 111 Minimum Depth of Binary Tree：https://leetcode.com/problems/minimum-depth-of-binary-tree/
        - 求二叉树的最低深度
        - Input: Given binary tree [3,9,20,null,null,15,7]
        - Output: 2
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public int minDepth(TreeNode root) {
        // 递归终止条件
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        }
        // 递归过程
        int min = Integer.MAX_VALUE;
        if (root.left!=null) {
            min = Math.min(min, minDepth(root.left)+1);
        }
        if (root.right!=null) {
            min = Math.min(min, minDepth(root.right)+1);
        }
        return min;
    }
    ```
 
### 226题解
- 226题解
    - 226 Invert Binary Tree：https://leetcode.com/problems/invert-binary-tree/
        - 反转二叉树，左右子树对调
        - Input: Given binary tree [4,2,7,1,3,6,9]
        - Output: return binary tree [4,7,2,9,6,3,1]
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public TreeNode invertTree(TreeNode root) {
        // 递归终止条件
        if (root==null) {
            return null;
        }
        // 递归过程
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // swap
        root.left = right;
        root.right = left;
        return root;
    }
    ```

### 112题解
- 112题解
    - 112 Path Sum：https://leetcode.com/problems/path-sum/
        - 找出二叉树路径中的是否有一条和等于sum
        - Input: binary tree [5,4,8,11,null,13,4,7,2]
        - Output: true
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public boolean hasPathSum(TreeNode root, int sum) {
        // 递归终止条件
        if (root == null) {
            return false;
        }
        if (root.left==null && root.right==null) {
            return root.val == sum;
        }
        // 递归过程
        return hasPathSum(root.left, sum-root.val) ||
                hasPathSum(root.right, sum-root.val);
    }
    ```

### 257题解
- 257题解
    - 257 Binary Tree Paths：https://leetcode.com/problems/binary-tree-paths/
        - 返回二叉树所有路径的path
        - Input: binary tree [1,2,3,null,5]
        - Output: ["1->2->5", "1->3"]
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        // 递归终止条件
        if (root == null ) {
            return result;
        }
        if (root.left==null && root.right==null) {
            result.add(Integer.toString(root.val));
            return result;
        }
        // 递归过程
        List<String> leftPath = binaryTreePaths(root.left);
        for (String i : leftPath) {
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(i);
            result.add(sb.toString());
        }
        List<String> rightPath = binaryTreePaths(root.right);
        for (String j : rightPath) {
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(j);
            result.add(sb.toString());
        }
        return result;
    }
    ```

### 437题解
- 437题解
    - 437 Path Sum III：https://leetcode.com/problems/path-sum-iii/
        - 求二叉树中等于给定sum的路径，路径可以不从根节点开始
        - Input: binary tree [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
        - Output: 3
        - Explanation: three paths [[5,3], [5,2,1], [-3,11]]
    - 思路：递归嵌套递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public int pathSum(TreeNode root, int sum) {
        // condition
        if(root == null) {
            return 0;
        }
        // recursion
        return findPath(root, sum)
                + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    private int findPath(TreeNode node, int sum) {
        // condition
        if(node == null) {
            return 0;
        }
        int res = 0;
        if(node.val == sum){
            res += 1;
        }
        // recursion
        res += findPath(node.left, sum-node.val);
        res += findPath(node.right, sum-node.val);

        return res;
    }
    ```

### 235题解
- 235题解
    - 235 Lowest Common Ancestor of a Binary Search Tree：https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
        - 寻找两个节点最近的公共祖先
        - Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
        - Output: 2
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // condition: 如果root为null，则不存在公共祖先
        if(root == null) {
            return null;
        }

        // recursion: 
        // 如果p、q都在左边，则公共祖先在左边
        if(p.val<root.val && q.val<root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        // 如果p、q都在右边，则公共祖先在右边
        if(p.val>root.val && q.val>root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        // 其他情况，root为公共祖先
        return root;
    }
    ```
 
### 100题解
- 100题解
    - 100 Same Tree：https://leetcode.com/problems/same-tree/
        - 判断两颗二叉树是否相同
        - Input: binary tree [1,2,null], [1,null,2]
        - Output: false
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
        if (p==null || q==null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    ```

### 101题解
- 101题解
    - 101 Symmetric Tree：https://leetcode.com/problems/symmetric-tree/
        - 判断二叉树是否对称
        - Input: binary tree [1,2,2,null,3,null,3]
        - Output: false
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public boolean isSymmetric(TreeNode root) {
        // 递归终止条件
        if (root == null) {
            return true;
        }
        // 递归过程
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
        if (p==null || q==null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
    ```

### 222题解
- 222题解
    - 222 Count Complete Tree Nodes：https://leetcode.com/problems/count-complete-tree-nodes/
        - 计算完全二叉树节点个数
        - Input: binary tree [1,2,3,4,5,6,null]
        - Output: 6
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public int countNodes(TreeNode root) {
        // 递归终止条件
        if (root==null) {
            return 0;
        }

        // 递归过程
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    ```

### 110题解
- 110题解
    - 110 Balanced Binary Tree：https://leetcode.com/problems/balanced-binary-tree/
        - 判断是否为平衡二叉树（每个节点的左右子树高度差不超过1）
        - Input: binary tree [1,2,2,3,3,null,null,4,4]
        - Output: false
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public boolean isBalanced(TreeNode root) {
        // 递归终止条件
        if (root == null) {
            return true;
        }
        if (Math.abs(getDepth(root.left)-getDepth(root.right))>1) {
            return false;
        }

        // 递归过程
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
    ```

### 404题解
- 404题解
    - 404 Sum of Left Leaves：https://leetcode.com/problems/sum-of-left-leaves/
        - 求左叶子节点的和
        - Input: binary tree [3,9,20,null,null,15,7]
        - Output: 24
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        // 递归终止条件
        if (root == null) {
            return 0;
        }
        if (root.left!=null && root.left.left==null && root.left.right==null) {
            sum += root.left.val;
        }
        // 递归过程
        sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        return sum;
    }
    ```

### 113题解
- 113题解
    - 113 Path Sum II：https://leetcode.com/problems/path-sum-ii/
        - 返回二叉树路径中的所有等于sum的路径
        - Input: binary tree [5,4,8,11,null,13,4,7,2,null,null,5,1]
        - Output: [[5,4,11,2],[5,8,4,5]]
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> middle = new ArrayList<>();
        getPathSum(root, sum, middle, result);
        return result;
    }
    private void getPathSum(TreeNode root, int sum, ArrayList<Integer> middle, List<List<Integer>> result) {
        // condition
        if(root == null) {
            return;
        }
        middle.add(root.val);
        if(root.left==null && root.right==null) {
            if(root.val == sum) {
                result.add(new ArrayList<>(middle));
            }
        }
        // recursion
        getPathSum(root.left, sum-root.val, middle, result);
        getPathSum(root.right, sum-root.val, middle, result);
        middle.remove(middle.size()-1);
    }
    ```
 
### 129题解
- 129题解
    - 129 Sum Root to Leaf Numbers：https://leetcode.com/problems/sum-root-to-leaf-numbers/
        - 求所有路径组成的数字的和
        - Input: binary tree [1,2,3]
        - Output: 25
        - Explanation:
            - The root-to-leaf path 1->2 represents the number 12.
            - The root-to-leaf path 1->3 represents the number 13.
            - Therefore, sum = 12 + 13 = 25.
    - 思路：递归
    - 时间复杂度：O(n)
    - 空间复杂度：O(h)
    ```java
    public int sumNumbers(TreeNode root) {
        return getSum(root, 0);
    }
    private int getSum(TreeNode root, int curSum) {
        // condition
        if(root == null) {
            return 0;
        }
        curSum = curSum*10 + root.val;
        if(root.left==null && root.right==null) {
            return curSum;
        }
        // recursion
        return getSum(root.left, curSum) + getSum(root.right, curSum);
    }
    ```


## 查找表
### 349题解
- 349题解
    - 349 Intersection of Two Arrays：https://leetcode.com/problems/intersection-of-two-arrays/
        - 找两个数组的交集
        - Input: nums1 = [1,2,2,1], nums2 = [2,2]
        - Output: [2]
    - 思路：HashSet，一个set、一个resultSet
    - 时间复杂度：O(n+m)
    - 空间复杂度：O(n)
    ```java
    public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            for(int i=0; i<nums1.length; i++) {
                set.add(nums1[i]);
            }
            HashSet<Integer> resultSet = new HashSet<>();
            for(int num : nums2) {
                if(set.contains(num)) {
                    resultSet.add(num);
                }
            }
            int[] res = new int[resultSet.size()];
            int index = 0;
            for(Integer num : resultSet) {
                res[index++] = num;
            }
            return res;
        }
    ```

### 350题解
- 350题解
    - 350 Intersection of Two Arrays II：https://leetcode.com/problems/intersection-of-two-arrays-ii/
        - 找两个数组的交集（包括重复的）
        - Input: nums1 = [1,2,2,1], nums2 = [2,2]
        - Output: [2,2]
    - 思路：HashMap，计算元素个数
    - 时间复杂度：O(n+mlogn)
    - 空间复杂度：O(n)
    ```java
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums1) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num)+1);
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num)>0) {
                result.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for(Integer num : result) {
            res[index++] = num;
        }
        return res;
    }
    ```

### 1题解-Map
- 1题解
    - 1 Two Sum：https://leetcode.com/problems/two-sum/
        - 找出数组中和等于target的数字的下标（注意nums不是有序的）
        - Input: nums = [2, 7, 11, 15], target = 9
        - Output: [0,1]
    - 思路：将元素a放入Map中，之后查找target-a是否存在
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```java
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                res[0] = i;
                res[1] = map.get(complement);
            }
            map.put(nums[i], i);
        }
        return res;
    }
    ```

### 454题解
- 454题解
    - 454 4Sum II：https://leetcode.com/problems/4sum-ii/
        - 求四个整型数组的有多少种组合相加等于0
        - Input: A = [ 1, 2], B = [-2,-1], C = [-1, 2], D = [ 0, 2]
        - Output: 2
        - Explanation: The two tuples are:
            1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
            2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
    - 思路：将C+D的所有组合放入Map中，查找0-A-B
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n^2)
    ```java
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                if(!map.containsKey(sum)) {
                    map.put(sum, 1);
                }
                else {
                    map.put(sum, map.get(sum)+1);
                }
            }
        }

        int res = 0;
        for(int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                if(map.containsKey(0-A[i]-B[j])) {
                    res += map.get(0-A[i]-B[j]);
                }
            }
        }
        return res;
    }
    ```

### 447题解
- 447题解
    - 447 Number of Boomerangs：https://leetcode.com/problems/number-of-boomerangs/
        - 寻找符合Boomerangs定义的三元组的个数
        - Input: [[0,0],[1,0],[2,0]]
        - Output: 2
        - Explanation: The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
    - 思路：以i为枢纽点，把其他点跟i的距离放入map<距离，频数>，查找距离相同的点组合个数(频数*频数-1)
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n)
    ```java
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        // 遍历枢纽点i
        for(int i=0; i<points.length; i++) {
            // 把其他点的距离放入Map
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int j=0; j<points.length; j++) {
                if(j != i) {
                    // 对比距离时使用距离的平方，无浮点数误差问题
                    int dist = dis(points[i], points[j]);
                    if(!map.containsKey(dist))
                        map.put(dist, 1);
                    else
                        map.put(dist, map.get(dist)+1);
                }
            }
            // 计算相同距离点的个数的组合
            for(Integer dis : map.keySet())
                res += map.get(dis) * (map.get(dis)-1);
        }
        return res;
    }
    private int dis(int[] a, int[] b) {
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
    ```

### 219题解
- 219题解
    - 219 Contains Duplicate II：https://leetcode.com/problems/contains-duplicate-ii/
        - 判断数组是否在k长度内有重复元素
        - Input: nums = [1,2,3,1], k = 3
        - Output: true
    - 思路：Set+滑动窗口
    - 时间复杂度：O(n)
    - 空间复杂度：O(k)
    ```java
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

            // 保持set中最多有k个元素（边界：i-k）
            if(set.size() == k+1){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    ```
 
### 220题解
- 220题解
    - 220 Contain Duplicate III：https://leetcode.com/problems/contains-duplicate-iii/
        - 判断数组是否在k长度内有差值不大于t的两个数
        - Input: nums = [1,2,3,1], k = 3, t = 0
        - Output: true
    - 思路：Set+滑动窗口：TreeSet(有序)，查找比x-t大的最小的元素(ceiling)是否<=x+t
    - 时间复杂度：O(nlogk)
    - 空间复杂度：O(k)
    ```java
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // 需要用long，否则会发生整型溢出
        TreeSet<Long> set = new TreeSet<Long>();
        for(int i=0; i<nums.length; i++) {
            if(set.ceiling((long)nums[i]-(long)t) != null && set.ceiling((long)nums[i]-(long)t)<=(long)nums[i]+(long)t){
                return true;
            }
            set.add((long)nums[i]);
            if(set.size() == k+1){
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
    ```
 
### 136题解
- 136 Single Number：https://leetcode.com/problems/single-number/
    - 找出数组中只出现过一次的元素，其他元素出现两次
    - Input: [2,2,1]
    - Output: 1
- 思路1：HashMap
- 复杂度：O(n)、O(n)
```java
    public int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<A.length; i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i], 1);
            }
            else {
                map.put(A[i], map.get(A[i])+1);
            }
        }
        for(Integer num : map.keySet()) {
            if(map.get(num) == 1) {
                return num;
            }
        }
        throw new IllegalStateException("no solution");
    }
```
- 思路2：异或，两个相同的数异或为0，与0异或为本身
> 假设 数组为 2,3,2,3,4,1,4 那么结果应该为1，过程如下：
2^3=0000 0010 ^ 0000 0011 = 0000 0001 1
1^2=0000 0001 ^ 0000 0010 = 0000 0011 3
3^3=0000 0011 ^ 0000 0011 = 0000 0000 0
0^4=0000 0000 ^ 0000 0100 = 0000 0100 4
4 ^ 1 =0000 0100 ^ 0000 0001 = 0000 0101 5
5 ^ 4= 0000 0101 ^ 0000 0100 =0000 0001 1

- 复杂度：O(n)、O(1)
```java
    public int singleNumber(int[] A) {
        int res= 0;
        for(int i=0; i<A.length; i++) {
            res ^= A[i];
        }
        return res;
    }
```

### 242题解
- 242题解
    - 242 Valid Anagram：https://leetcode.com/problems/valid-anagram/
        - 判断两个字符串是否为回文串
        - Input: s = "anagram", t = "nagaram"
        - Output: true
    - 思路：Hash Table
    - 时间复杂度：O(n)
    - 空间复杂度：O(26)
    ```
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // HashTable
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)-'a']--;
            if(freq[t.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    ```

### 202题解
- 202题解
    - 202 Happy Number：https://leetcode.com/problems/happy-number/
        - 判断一个数字是否为happy number
        - Input: 19
        - Output: true
        - Explanation:
            - 1^2 + 9^2 = 82
            - 8^2 + 2^2 = 68
            - 6^2 + 8^2 = 100
            - 1^2 + 0^2 + 0^2 = 1
    - 思路：Set
    - 时间复杂度：O(?)
    - 空间复杂度：O(?)
    ```
   public boolean isHappy(int n) {
        if(n<1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        int t;
        int newN;
        while(n!=1 && !set.contains(n)) {
            set.add(n);
            newN = 0;
            while(n>0) {
                t = n%10;
                n /= 10;
                newN += t*t;
            }
            n = newN;
        }
        return n == 1;
    }
    ```

### 290题解
- 290题解
    - 290 Word Pattern：https://leetcode.com/problems/word-pattern/
        - 判断所给的string是否是pattern的形式
        - Input: pattern = "abba", str = "dog cat cat dog"
        - Output: true
    - 思路：Map
    - 时间复杂度：O(nlogm)
    - 空间复杂度：O(n+m)
    ```
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        char[] patterns = pattern.toCharArray();
        String[] strs = str.split(" ");

        if(patterns.length != strs.length) {
            return false;
        }

        for(int i=0; i<patterns.length; i++) {
            char c = patterns[i];
            if(!map.containsKey(c)) {
                if(map.containsValue(strs[i])) {
                    return false;
                }
                map.put(c, strs[i]);
            }
            else {
                String value = map.get(c);
                if(!value.equals(strs[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    ```

### 804题解
- 804题解
    - 804 Unique Morse Code Words：https://leetcode.com/problems/unique-morse-code-words/
        - 返回不同摩斯码的个数
        - Input: words = ["gin", "zen", "gig", "msg"]
        - Output: 2
        - Explanation: There are 2 different transformations, "--...-." and "--...--.".
    - 思路：使用Set返回不同摩斯码的个数
    - 时间复杂度：O(n+s)
    - 空间复杂度：O(n)
    ```
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> set = new TreeSet<String>();
        for(String word : words) {
            StringBuilder res = new StringBuilder();
            for(int i=0; i<word.length(); i++)
                res.append(codes[word.charAt(i)-'a']);
            set.add(res.toString());
        }
        return set.size();
    }
    ```

## 游标
### 283题解
- 283题解
    - 283 Move Zeroes：https://leetcode.com/problems/move-zeroes/
        - 把数组中的零移到后面去
        - Input: [0,1,0,3,12]
        - Output: [1,3,12,0,0]
    - 思路：cursor，用一个k游标去保存非零元素的个数，swap零和非零元素，把非零元素移到前面
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public void moveZeroes(int[] nums) {
        // 游标k记录非零元素个数
        int k = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, k, i);
                k++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    ```

### 27题解
- 27题解
    - 27 Remove Element：https://leetcode.com/problems/remove-element/
        - 给定nums，删除指定的值val
        - Input: nums = [3,2,2,3], val = 3,
        - Output: Your function should return length = 2, with the first two elements of nums being 2.
    - 思路：cursor
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```java
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                swap(nums, i, k);
                k++;
            }
        }
        return k;
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    ```
 
### 122题解
- 122 Best Time to Buy and Sell Stock II：https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    - 求买卖股票最多可获得的收益
    - Input: [7,1,5,3,6,4]
    - Output: 7
    - Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4. Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
- 思路：cursor
- 复杂度：O(n)、O(1)
```java
    public int maxProfit(int[] prices) {
        int k = 0;
        int res = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i]>prices[k]) {
                res += prices[i]-prices[k];
                k = i;
            }
            else {
                k++;
            }
        }
        return res;
    }
```

## Partition
### 75题解
- 75题解
    - 75 Sort Color：https://leetcode.com/problems/sort-colors/
        - 对三种颜色进行排序，用0,1,2表示颜色
        - Input: [2,0,2,1,1,0]
        - Output: [0,0,1,1,2,2]
    - 思路：使用三路快排：只需一次for循环
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for(int i=0; i<two; ){
            // 1
            if(nums[i]==1)
                i++;
            // 2
            else if(nums[i]==2){
                two--;
                swap(nums, i, two);
            }
            // 0
            else{
                assert(nums[i]==0);
                zero++;
                swap(nums, i, zero);
                i++;
            }
        }
    }
   
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    ```

### 215题解
- 215题解
    - 215 Kth Largest Element in an Array：https://leetcode.com/problems/kth-largest-element-in-an-array/
        - 返回第K大的数
        - Input: [3,2,1,5,6,4] and k = 2
        - Output: 5
    - 思路：快排Partition思路
    - 时间复杂度：O(n)
    -  空间复杂度：O(logn)
    ```
        public int findKthLargest(int[] nums, int k) {
            return findKthLargest(nums, 0, nums.length-1, k-1);
        }

        private int findKthLargest(int[] nums, int l, int r, int k){
            if(l==r)
                return nums[l];
            int p = partition(nums, l, r);

            if( p == k )
                return nums[p];
            else if( k < p )
                return findKthLargest(nums, l, p-1, k);
            else // k > p
                return findKthLargest(nums, p+1 , r, k);
        }

        private int partition(int[] nums, int l , int r){
            int p = (int) (Math.random()%(r-l+1) + l);
            swap(nums, l, p);
            int lt = l + 1;
            for( int i = l + 1 ; i <= r ; i ++ )
                if( nums[i] > nums[l] )
                    swap(nums, i, lt++);
            swap(nums, l, lt-1);
            return lt-1;
        }

        private void swap(int[] nums, int i, int j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    ```
### 88题解
- 88题解
`remain`

## 双指针
### 167题解
- 167题解
    - 167 Two Sum II：https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
        - 给定排序好的数组，找出两数和等于target的下标，index1<index2
        - Input: numbers = [2,7,11,15], target = 9
        - Output: [1,2]
    - 思路：使用双指针，一个在前，一个在后，指针随sum与target的差距而变化
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public int[] twoSum(int[] numbers, int target) {
        int index1;
        int index2 = numbers.length-1;
        int[] result = {0, 0};
        for(index1=0; index1<numbers.length; ){
            if(numbers[index1]+numbers[index2]==target){
                result[0] = index1+1;
                result[1] = index2+1;
                break;
            }
            else if(numbers[index1]+numbers[index2]<target)
                index1++;
            else
                index2--;
        }
        return result;
    }
    ```
### 11题解
- 11题解
    - 11 Container With Most Water：https://leetcode.com/problems/container-with-most-water/
        - 求Container的最大面积
        - Input: [1,8,6,2,5,4,8,3,7]
        - Output: 49
    - 思路：双指针
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int t = (j-i)*Math.min(height[i], height[j]);
            if(t>area)
                area = t;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return area;
    }
    ```
### 125题解
- 125题解
    - 125 Valid Palindrome：https://leetcode.com/problems/valid-palindrome/
        - 判断字符串是否为回文串，可跳过符号（空字符串是回文串）
        - Input: "A man, a plan, a canal: Panama"
        - Output: true
    - 思路：双指针
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public boolean isPalindrome(String s) {
        if(s==null)
            return true;
        String reg = "[^0-9a-zA-Z]";
        s = s.replaceAll(reg, "");
        int i=0, j=s.length()-1;
        boolean flag = true;
        while(i<j){
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(j));
            if(c1 == c2){
                i++;
                j--;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
    ```
 
### 345题解
- 345题解
    - 345 Reverse Vowels of a String：https://leetcode.com/problems/reverse-vowels-of-a-string/
        - swap字符串中的元音字母
        - Input: "hello"
        - Output: "holle"
    - 思路：双指针
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(i<j){
            if(!vowels.contains(arr[i]+"")){
                i++;
            }
            if(!vowels.contains(arr[j]+"")){
                j--;
            }
            if(vowels.contains(arr[i]+"")&&vowels.contains(arr[j]+"")){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    ```

## 滑动窗口
### 209题解
- 209题解
    - 209 Minimum Size Subarray Sum：https://leetcode.com/problems/minimum-size-subarray-sum/
        - 求最短子序和sum<=s
        - Input: s = 7, nums = [2,3,1,2,4,3]
        - Output: 2
        - 注意：子数组是否连续？没有解怎么办？
    - 思路1：两次遍历：求往后的和值达到要求的长度最小能为多少（包含了大量的重复计算）
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(1)
    ```
    public int minSubArrayLen(int s, int[] nums) {
        // 非空判断
        if(nums==null || nums.length==0) {
            return 0;
        }
        // 两次遍历：求往后的和值达到要求的长度最小能为多少
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            int sum = 0;
            for(int j=i; j<nums.length; j++) {
                sum += nums[j];
                if(sum >= s) {
                    min = Math.min(min, j-i+1);
                    break;
                }
            }
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        return min;
    }
    ```
    - 思路2：滑动窗口（维护nums[i...j]，如果sum比s小 sum += nums[++j]，否则sum -= nums[i++]）
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public int minSubArrayLen(int s, int[] nums) {
        // 非空判断
        if(nums==null || nums.length==0) {
            return 0;
        }
        // 右边界不包含任何元素
        int l=0, r=-1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(l < nums.length) {
            if(r+1<nums.length && sum < s) {
                // 需判断是否越界
                sum += nums[++r];
            }
            else {
                sum -= nums[l++];
            }
            
            if(sum >= s) {
                min = Math.min(min, r-l+1);
            }
        }
        // 返回结果判断，如果没找到为0
        if(min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
    ```
### 3题解
- 3题解
    - 3 Longest Substring Without Repeating Characters：https://leetcode.com/problems/longest-substring-without-repeating-characters/
        - 求字符串不重复子串的最长值
        - Input: "abcabcbb"
        - Output: 3
        - Explanation: The answer is "abc", with the length of 3.
    - 思路：滑动窗口，使用freq[256]记录重复字符
    - 时间复杂度：O(n)
    - 空间复杂度：O(len(charset))
    ```
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
    ```

### 438题解
- 438题解
    - 438 Find All Anagrams in a String：https://leetcode.com/problems/find-all-anagrams-in-a-string/
        - 找字符串的Anagram的开始下标
        - Input: s: "cbaebabacd" p: "abc"
        - Output: [0, 6]
        - Explanation:
            - The substring with start index = 0 is "cba", which is an anagram of "abc".
            - The substring with start index = 6 is "bac", which is an anagram of "abc".
    - 思路：滑动窗口
    - 时间复杂度：O(m+n)
    - 空间复杂度：O(1)
    ```
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexList = new ArrayList<Integer>();
        int i=0, j=0;
        int count = p.length();
        int[] freq = new int[256];
        for (char c : p.toCharArray()){
            freq[c]++;
        }
        while (j < s.length()){
            if (freq[s.charAt(j++)]-- > 0){
                count--;
            }
            if (count == 0){
                indexList.add(i);
            }
            if (j-i==p.length() && freq[s.charAt(i++)]++ >= 0){
                count++;
            }
        }
        return indexList;
    }
    ```

### 76题解
- 76题解
    - 76 Minimum Window Substring：https://leetcode.com/problems/minimum-window-substring/
        - 求字符串s中包含字符串t的最小窗口
        - Input: S = "ADOBECODEBANC", T = "ABC"
        - Output: "BANC"
    - 思路：滑动窗口
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public String minWindow(String s, String t) {
        int[] sFreq = new int[256];
        int count = 0;
        int[] tFreq = new int[256];
        for (int i=0; i<t.length(); i++){
            tFreq[t.charAt(i)]++;
        }
        int minLen = s.length()+1;
        int startIndex = -1;
        int i=0, j=-1;
        while (i<s.length()){
            if (j+1<s.length() && count<t.length()){
                sFreq[s.charAt(j+1)]++;
                if (sFreq[s.charAt(j+1)] <= tFreq[s.charAt(j+1)]){
                    count++;
                }
                j++;
            } else {
                assert count<=t.length();
                if(count==t.length() && j-i+1<minLen){
                    minLen = j-i+1;
                    startIndex = i;
                }
                sFreq[s.charAt(i)]--;
                if (sFreq[s.charAt(i)] < tFreq[s.charAt(i)]){
                    count--;
                }
                i++;
            }
        }

        if (startIndex != -1){
            return s.substring(startIndex, startIndex+minLen);
        }
        return "";
    }
    ```

### 567题解
- 567题解
    - 567 Permutation in String：https://leetcode.com/problems/permutation-in-string/
        - 在字符串s2里找是否有字符串s1的全排列
        - Input: s1 = "ab" s2 = "eidbaooo"
        - Output: True
        - Explanation: s2 contains one permutation of s1 ("ba")
    - 思路：滑动窗口
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[256];
        for (char c : s1.toCharArray()) {
            freq[c]++;
        }
        int i=0, count=0;
        for (int j=0; j<s2.length(); j++) {
            freq[s2.charAt(j)]--;
            if (freq[s2.charAt(j)] >= 0) {
                count++;
            }
            if (j >= s1.length()) {
                freq[s2.charAt(i)]++;
                if (freq[s2.charAt(i)] >= 1) {
                    count--;
                }
                i++;
            }
            if (count==s1.length()) {
                return true;
            }
        }
        return false;
    }
    ```

### 424题解
- 424题解
    - 424 Longest Repeating Character Replacement：https://leetcode.com/problems/longest-repeating-character-replacement/
        - 如字符串s可以替换k次，求最长的连续重复字符的个数
        - Input: s = "ABAB", k = 2   
        - Output: 4
        - Explanation: Replace the two 'A's with two 'B's or vice versa.
    - 思路：滑动窗口
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    ```
    public int characterReplacement(String s, int k) {
        int i=0, j=0;
        int max = 0;
        int maxCount = 0;
        int[] freq = new int[256];
        while (j<s.length()) {
            freq[s.charAt(j)]++;
            maxCount = Math.max(maxCount, freq[s.charAt(j)]);
            j++;
            while(j-i-maxCount > k) {
                freq[s.charAt(i++)]--;
            }
            max = Math.max(max, j-i);
        }
        return max;
    }
    ```


## 动态规划
### 70题解
- dp
    - 70 Climbing Stairs：https://leetcode.com/problems/climbing-stairs/
        - 给定n，求step的组合，step仅为1和2
        - Input: 2
        - Output: 2
        - Explanation: There are two ways to climb to the top.
            - 1 step + 1 step
            - 2 steps
    - 递归解法：StackOverflowError栈溢出（原因没有指定n=1的情况）
        - 过不了：Time Limit Exceeded
    - Key：爬上n-1阶台阶再爬1阶，或者爬上n-2阶台阶再爬2阶
    - 记忆化搜索memo：自顶向下的解决问题
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+2];
        Arrays.fill(memo, -1);
        return climbing(n);
    }
   
    public int climbing(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(memo[n]==-1)
            memo[n] = climbing(n-1) + climbing(n-2);
        return memo[n];
    }
    ```
    - 思路2：动态规划：自底向上的解决问题
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    public int climbStairs(int n) {
        int[] memo = new int[n+2];
        Arrays.fill(memo, -1);
        memo[1] = 1;
        memo[2] = 2;
        for(int i=3; i<=n; i++)
           memo[i] = memo[i-1]+memo[i-2];
        return memo[n];
    }
    ```

### 343题解
- dp
    - 343 Integer Break：https://leetcode.com/problems/integer-break/
        - 给定正整数n，分割n为至少两个数之和，返回分割后的数字相乘的最大值
        - Input: 10
        - Output: 36
        - Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
    - Key：f(n) = max(i*f(n-i))
   
   
    - 递归：Time Limit Exceeded（暴力解法：回溯遍历这个数分割的所有可能性 O(2^n)）
    - 思路1：记忆化搜索
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n)
    ```
    int[] memo;
    public int integerBreak(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return breakInteger(n);
    }

    // break
    private int breakInteger(int n){
        if(n==1)
            return 1;
        if(memo[n] != -1)
            return memo[n];
        int max = -1;
        for(int i=1; i<=n-1; i++)
            max = max3(max, i*(n-i), i*breakInteger(n-i));
        memo[n] = max;
        return max;
    }

    // max3
    private int max3(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
    ```
    - 思路2：动态规划
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n)
    ```
    public int integerBreak(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
       
        memo[1] = 1;
        for(int i=2; i<=n; i++)
            // 求解memo[i]
            for(int j=1; j<=i-1; j++)
                memo[i] = max3(memo[i], j*(i-j), j*memo[i-j]);
        return memo[n];
    }

    // max3
    private int max3(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
    ```

### 198题解
- dp
    - 198 House Robber：https://leetcode.com/problems/house-robber/
        - 给定nums数组代表连续相邻的家庭所有的money，若抢相邻的两家会触发报警，求所能抢的money的最大值
        - Input: [1,2,3,1]
        - Output: 4
        - Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
            - Total amount you can rob = 1 + 3 = 4.
    - Key
        - 状态（函数的定义）：考虑偷取[x...n-1]范围里的房子
        - 状态转移方程：f(0)=max{v(0)+f(2), v(1)+f(3), v(2)+f(4), ..., v(n-3)+f(n-1), v(n-2), v(n-1)}
   
   
    - 思路1：记忆化搜索
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n)
    ```
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return tryRobber(nums, 0);
    }
    // 考虑抢劫[x...n-1]
    private int tryRobber(int[] nums, int index){
        if(index >= nums.length)
            return 0;
        if(memo[index] != -1)
            return memo[index];
        int max = 0;
        for(int i=index; i<nums.length; i++)
            max = Math.max(max, nums[i] + tryRobber(nums, i+2));
        memo[index] = max;
        return max;
    }
    ```
    - 思路2：动态规划
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n)
    ```
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        memo[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            // memo[i]
            for(int j=i; j<n; j++)
// memo[i] = Math.max(memo[i], nums[j] + memo[j+2]);
                memo[i] = Math.max(memo[i], nums[j] + (j+2<n ? memo[j+2] : 0));
        }
        return memo[0];
    }
    ```

### 279题解
- dp
    - 279 Perfect Squares：https://leetcode.com/problems/perfect-squares/
        - 给定一个正整数n，求其由最少个完全平方数组成的和等于n的个数
        - Input: n = 13
        - Output: 2
        - Explanation: 13 = 4 + 9.
    - Key：f(n) = min(1+f(n-i^2))
    - 思路1：记忆化搜索
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    int[] memo;
    public int numSquares(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return squares(n);
    }
   
    private int squares(int n){
        if(n==0)
            return 0;
        if(memo[n] != -1)
            return memo[n];
        int min = Integer.MAX_VALUE;
        for(int i=1; n-i*i>=0; i++)
            min = Math.min(min, 1+squares(n-i*i));
        memo[n] = min;
        return min;
    }
    ```
    - 思路2：动态规划
    ```
    public int numSquares(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for(int i=1; i<=n; i++)
            for(int j=1; i-j*j>=0; j++)
            memo[i] = Math.min(memo[i], 1+memo[i-j*j]);
        return memo[n];
    }
    ```
### 91题解
- dp
    - 91 Decode Ways：https://leetcode.com/problems/decode-ways/
        - 求数字解码对应的字母含义的组合个数
        - Input: "12"
        - Output: 2
        - Explanation: It could be decoded as "AB" (1 2) or "L" (12)
    - 思路1：记忆化搜索
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    int[] memo;
    public int numDecodings(String s) {
        memo = new int[s.length()+1];
        Arrays.fill(memo, -1);
        memo[s.length()] = 1;
        return getNum(s, 0);
    }
    private int getNum(String s, int i) {
        int n = s.length();
        if(n == 0) {
            return 0;
        }
        if(memo[i] > -1) {
            return memo[i];
        }
        if(s.charAt(i) == '0') {
            return memo[i] = 0;
        }
        int res = getNum(s, i+1);
        if(i<s.length()-1 && Integer.parseInt(s.substring(i, i+2)) <= 26) {
            res += getNum(s, i+2);
        }
        return memo[i] = res;
    }
    ```
    - 思路2：动态规划
    ```
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0) {
            return 0;
        }
        int[] memo = new int[n+1];
        memo[n] = 1;
        memo[n-1] = s.charAt(n-1)=='0' ? 0 : 1;
        for(int i=n-2; i>=0; i--) {
            if(s.charAt(i) == '0') {
                continue;
            }
            else {
                memo[i] = Integer.parseInt(s.substring(i, i+2)) <= 26 ? memo[i+1] + memo[i+2] : memo[i+1];
            }
        }
        return memo[0];
    }
    ```

### 416题解
- dp
    - 416 Partition Equal Subset Sum：https://leetcode.com/problems/partition-equal-subset-sum/
        - 给定数组nums，求其是否可以被分成两个子数组，其和相等（注意：最多有200个数字，每个数字最大为100）
        - Input: [1, 5, 11, 5]
        - Output: true
        - Explanation: The array can be partitioned as [1, 5, 5] and [11].
    - 是背包问题：在n个物品中选一定物品，是否可以完全填满sum/2的背包
    - Key：状态：F(i,c) = F(i-1,c) || F(i-1, c-w(i))
    - 数据规模 $n*sum/2=100*100*200/2$：最多有200个数字，每个数字最大为100
    - 思路1：记忆化搜索
    - 时间复杂度：O(n*sum)
    - 空间复杂度：O(n*sum)
    ```
    int[][] memo; // memo[i][c]: -1是未计算，0是不可填充，1是可以填充
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            assert nums[i]>0;
            sum += nums[i];
        }
        if(sum%2 != 0)
            return false;
        memo = new int[nums.length][sum/2+1]; // 表示0...sum/2，故+1
        for(int i=0; i<nums.length; i++)
            Arrays.fill(memo[i], -1);
        return tryPartition(nums, nums.length-1, sum/2);
    }
    // 使用nums[0...index]是否可以完全填满sum的背包
    private boolean tryPartition(int[] nums, int index, int sum){
        if(sum==0) // 背包没有空间，即填满了
            return true;
        if(sum<0 || index<0)
            return false;
        if(memo[index][sum] != -1)
            return memo[index][sum] == 1;
        memo[index][sum] = tryPartition(nums, index-1, sum) || tryPartition(nums, index-1, sum-nums[index]) ? 1: 0;
        return memo[index][sum] == 1;
    }
    ```
    - 思路2：动态规划
    - 时间复杂度：O(n*sum)
    - 空间复杂度：O(sum)
    ```
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            assert nums[i]>0;
            sum += nums[i];
        }
        int C = sum/2;
        if(sum%2 != 0)
            return false;
        boolean[] memo = new boolean[C+1]; // 表示0...sum/2
        for(int j=0; j<=C; j++)
            memo[j] = (nums[0] == j); // j -> c
        for(int i=1; i<n; i++)
            for(int j=C; j>=nums[i]; j--)
                memo[j] = memo[j] || memo[j-nums[i]];
           
        return memo[C];
    }
    ```

### 300题解
- dp
    - 300 Longest Increasing Subsequence：https://leetcode.com/problems/longest-increasing-subsequence/
        - 求最长上升子序列的length
        - Input: [10,9,2,5,3,7,101,18]
        - Output: 4
        - Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
    - Key
        - 状态：f(i)表示以第i个数字为结尾的最长上升子序列的长度（即[0...i]里选择nums[i]可以获得的最长上升子序列）
        - 转移方程：f(i) = max(1+f(j) if nums[j]<nums[i])
    - 思路1：记忆化搜索
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n)
    ```
    int[] memo;
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int max = 0;
        for(int i=0; i<nums.length; i++)
            max = Math.max(max, getMaxLen(nums, i));
        return max;
    }
    private int getMaxLen(int[] nums, int index){
        if(memo[index] != -1)
            return memo[index];
        int max = 1;
        for(int i=0; i<index; i++)
            if(nums[i] < nums[index])
                max = Math.max(max, 1+getMaxLen(nums, i));
        memo[index] = max;
        return memo[index];
    }
    ```
    - 思路2：动态规划
    - 时间复杂度：O(n^2)
    - 空间复杂度：O(n)
    ```
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int[] memo = new int[nums.length];
        Arrays.fill(memo, 1);
        for(int i=1; i<nums.length; i++)
            for(int j=0; j<i; j++)
                if(nums[j]<nums[i])
                    memo[i] = Math.max(memo[i], 1+memo[j]);
        int max = 0;
        for(int i=0; i<nums.length; i++)
            max = Math.max(max, memo[i]);
        return max;
    }
    ```

### 1143题解
- dp
    - 1143 Longest Common Subsequence：https://leetcode.com/problems/longest-common-subsequence/
        - LCS：找两个字符串的最长公共子序列的长度
        - Input: text1 = "abcde", text2 = "ace"
        - Output: 3 
        - Explanation: The longest common subsequence is "ace" and its length is 3.
    - Key
        - 状态：f(m,n)表示两个字符串s1[0...m]，s2[0...n]的LCS长度
        - 状态转移方程：若s1[m]==s2[n] 则f(m,n)=1+f(m-1,n-1)，若s1[m]!=s2[n] 则f(m,n)=max( f(m-1,n), f(m,n-1) )
    - 思路1：记忆化搜索
    - 时间复杂度：O(m*n)
    - 空间复杂度：O(m*n)
    ```
    private int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        assert text1!=null && text2!=null;
        if(text1.length()==0 || text2.length()==0)
            return 0;
        memo = new int[text1.length()][text2.length()];
        for(int i=0; i<text1.length(); i++)
            Arrays.fill(memo[i], -1);
        return lcs(text1, text2, text1.length()-1, text2.length()-1);
    }
    // 求s1[0...m]和s2[0...n]的最长公共子序列的长度
    private int lcs(String s1, String s2, int m, int n){
        if(m<0 || n<0)
            return 0;
        if(memo[m][n] != -1)
            return memo[m][n];
        int max = 0;
        if(s1.charAt(m)==s2.charAt(n))
            max = 1 + lcs(s1, s2, m-1, n-1);
        else
            max = Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
        memo[m][n] =max;
        return max;
    }
    ```
    - 思路2：动态规划
    - 时间复杂度：O(m*n)
    - 空间复杂度：O(m*n)
    ```
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int memo[][] = new int[m][n];
        // init
        for(int i=0; i<m; i++)
            if(text1.charAt(i)==text2.charAt(0)){
                for(int j=i; j<m; j++)
                    memo[j][0] = 1;
                break;
            }
        for(int i=0; i<n; i++)
            if(text1.charAt(0)==text2.charAt(i)){
                for(int j=i; j<n; j++)
                    memo[0][j] = 1;
                break;
            }
        // dp
        for(int i=1; i<m; i++)
            for(int j=1; j<n; j++)
                if(text1.charAt(i) == text2.charAt(j))
                    memo[i][j] = 1 + memo[i-1][j-1];
                else
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
        return memo[m-1][n-1];
    }
    ```

## 贪心
### 455题解
- greedy
    - 455 Assign Cookies：https://leetcode.com/problems/assign-cookies/
        - 分饼干，s为饼干大小，g为满意的最小值，返回最多可以让几个小朋友开心
        - Input: g=[1,2,3], s=[1,1]
        - Output: 1
    - 思路：贪心，最大的饼干满足最贪的小朋友
    - 时间复杂度：O(nlogn)
    - 空间复杂度：O(1)
    ```
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gi = g.length-1, si = s.length-1;
        int res = 0;
        while(gi>=0 && si>=0) {
            if(s[si] >= g[gi]) {
                res++;
                si--;
                gi--;
            }
            else {
                gi--;
            }
        }
        return res;
    }
    ```

### 435题解
- greedy
    - 435 Non-overlapping Intervals：https://leetcode.com/problems/non-overlapping-intervals/
        - 给定一个区间，问最少删除多少个区间，可以让这些区间之间不重叠
        - Input: [[1,2],[2,3],[3,4],[1,3]]
        - Output: 1
    - 思路：贪心，选择区间结尾最早的且和前面不重叠
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) {
            return 0;
        }
        // 结尾早的靠前
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        int count = 1;
        int pre = 0;
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] >= intervals[pre][1]) {
                count++;
                pre = i;
            }
        }
        return intervals.length - count;
    }
    ```
    - 思路2：动态规划
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    ```
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        // memo[i] 表示使用 intervals[0...i] 的区间能构成的最长不重叠区间序列的长度；
        int[] memo = new int[intervals.length];
        Arrays.fill(memo, 1);

        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[i][0] >= intervals[j][1]) {
                    memo[i] = Math.max(memo[i], 1 + memo[j]);
                }
            }
        }

        int count = 0;
        for(int i = 0; i < memo.length; i++) {
            count = Math.max(count, memo[i]);
        }

        return intervals.length - count;
    }
    ```


## 回溯
### 17题解
- 17题解
    - 17 Letter Combinations of a Phone Number：https://leetcode.com/problems/letter-combinations-of-a-phone-number/
        - 返回数字字符串的所有字母组合
        - Input: "23"
        - Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    - 思路：递归
    - 时间复杂度：O(2^n)
    - 空间复杂度：O(n)
    ```
    private String[] letterMap = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    private ArrayList<String> resultList;
    public List<String> letterCombinations(String digits) {
        resultList = new ArrayList<String>();
        if (digits.equals("")) {
            return resultList;
        }
        findCombination(digits, 0, "");
        return resultList;
    }
    // s保存从digits[0...index-1]的字符串
    private void findCombination(String digits, int index, String s) {
        if (index==digits.length()) {
            resultList.add(s);
            return;
        }
        Character c = digits.charAt(index);
        String letters = letterMap[c-'0'];
        for (int i=0; i<letters.length(); i++) {
            findCombination(digits, index+1, s+letters.charAt(i));
        }
        return;
    }
    ```

### 46题解
- backtracking
    - 46 Permutations：https://leetcode.com/problems/permutations/
        - 求数组的全排列
        - Input: [1,2,3]
        - Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    - 思路：回溯法，Perms(nums)={取出一个数字}+Perms(nums-这个数字)
    - 时间复杂度：O(n^n)
    - 空间复杂度：O(n)
    ```
    private List<List<Integer>> res;
    private boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<List<Integer>>();
        if(nums.length == 0) {
            return res;
        }
        used = new boolean[nums.length];
        generatePerm(nums, 0, new LinkedList<Integer>());
        return res;
    }
    private void generatePerm(int[] nums, int index, LinkedList<Integer> p) {
        if(index == nums.length) {
            res.add((List<Integer>) p.clone());
            return;
        }
        for(int i=0; i<nums.length; i++) {
            // used[i]没有被使用
            if(!used[i]) {
                p.addLast(nums[i]);
                used[i] = true;
                generatePerm(nums, index+1, p);
                p.removeLast();
                used[i] = false;
            }
        }
        return;
    }
    ```

### 77题解
- backtracking
    - 77 Combinations：https://leetcode.com/problems/combinations/
        - 在n个数字中选出k个数字的所有组合
        - Input: n = 4, k = 2
        - Output: [[2,4], [3,4], [2,3], [1,2], [1,3], [1,4]]
    - 思路：回溯法
    - 时间复杂度：O(n^k)
    - 空间复杂度：O(k)
    ```
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<List<Integer>>();
        if(n<=0 || k<=0 || k>n) {
            return res;
        }
        generateCombinations(n, k, 1, new LinkedList<Integer>());
        return res;
    }
    private void generateCombinations(int n, int k, int start, LinkedList<Integer> c) {
        if(c.size() == k) {
            res.add((List<Integer>)c.clone());
            return;
        }
        for(int i=start; i<=n; i++) {
            c.addLast(i);
            generateCombinations(n, k, i+1, c);
            c.removeLast();
        }
        return;
    }
    ```
    - 优化：剪枝
    ```java
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<List<Integer>>();
        if(n<=0 || k<=0 || k>n) {
            return res;
        }
        generateCombinations(n, k, 1, new LinkedList<Integer>());
        return res;
    }
    private void generateCombinations(int n, int k, int start, LinkedList<Integer> c) {
        if(c.size() == k) {
            res.add((List<Integer>)c.clone());
            return;
        }
        // 还有k-c.size()个空位，所以，[i...n]中至少有k-c.size()个元素
        // i最多为n-(k-c.size())+1
        for(int i=start; i<=n-(k-c.size())+1; i++) {
            c.addLast(i);
            generateCombinations(n, k, i+1, c);
            c.removeLast();
        }
        return;
    }
    ```

### 79题解
- backtracking
    - 79 Word Search：https://leetcode.com/problems/word-search/
        - 查询二维字符数组中，连起来是否有word
        - Input: board=[['A','B','C','E'],['S','F','C','S'],['A','D','E','E']]，word="ABCCED"
        - Output: true
    - 思路：回溯法，递归树中搜索左上右下四个方向
    - 时间复杂度：`O(m*n*m*n)`
    - 空间复杂度：`O(m*n)`
    ```
    private boolean[][] visited;
    // 左上右下
    private int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
    int m, n;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(searchWord(board, word, 0, i, j) == true) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean searchWord(char[][] board, String word, int index, int startx, int starty) {
        if(index == word.length()-1) {
            return board[startx][starty] == word.charAt(index);
        }
        if(board[startx][starty] == word.charAt(index)) {
            visited[startx][starty] = true;
            // 向四个方向寻找
            for(int i=0; i<4; i++) {
                int newx = startx + d[i][0];
                int newy = starty + d[i][1];
                if(inArea(newx, newy) && !visited[newx][newy]) {
                    if(searchWord(board, word, index+1, newx, newy) == true) {
                        return true;
                    }
                }
            }
            visited[startx][starty] = false;
        }
        return false;
    }
    private boolean inArea(int x, int y) {
        return x>=0 && x<m && y>=0 && y<n;
    }
    ```
### 200题解
- backtracking
    - 200 Number of Islands：https://leetcode.com/problems/number-of-islands/
        - 二维数组中查找岛屿的个数，值为1
        - Input: [[11110][11010][11000][00000]]
        - Output: 1
    - 思路：回溯法，递归树中搜索上下左右四个方向
    - 时间复杂度：O(n*m)
    - 空间复杂度：O(n*m)
    ```
    private boolean[][] visited;
    private int[][] d = {{0,1},{1,0},{0,-1},{-1,0}};
    private int m, n;
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid[0].length==0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        int res = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j]=='1' && !visited[i][j]) {
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    private void dfs(char[][] grid, int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int newx = x + d[i][0];
            int newy = y + d[i][1];
            if(inArea(newx, newy) && grid[newx][newy]=='1' &&!visited[newx][newy]) {
                dfs(grid, newx, newy);
            }
        }
    }
    private boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    ```
### 51题解
- backtracking
    - 51 N Queens：https://leetcode.com/problems/n-queens/
        - n皇后问题的所有解，在横竖斜方向都不会有两个皇后
        - Input: 4
        - Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
    - 思路：回溯法
    - 时间复杂度：O(n^n)
    - 空间复杂度：O(n)
    ```
    private boolean[] col;
    private boolean[] dia1;
    private boolean[] dia2;
    private ArrayList<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<List<String>>();
        col = new boolean[n];
        dia1 = new boolean[2*n-1];
        dia2 = new boolean[2*n-1];

        putQueen(n, 0, new LinkedList<Integer>());
        return res;
    }
    private void putQueen(int n, int index, LinkedList<Integer> row){
        if(index == n) {
            res.add(generateBoard(n, row));
            return;
        }

        for(int i=0; i<n; i++) {
            if(!col[i] && !dia1[index+i] && !dia2[index-i+n-1]) {
                row.addLast(i);
                col[i] = true;
                dia1[index+i] = true;
                dia2[index-i+n-1] = true;
                putQueen(n, index+1, row);
                col[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n - 1] = false;
                row.removeLast();
            }
        }
        return;
    }
    private List<String> generateBoard(int n, LinkedList<Integer> row) {
        ArrayList<String> board = new ArrayList<String>();
        for(int i=0; i<n; i++) {
            char[] chars = new char[n];
            Arrays.fill(chars, '.');
            chars[row.get(i)] = 'Q';
            board.add(new String(chars));
        }
        return board;
    }
    ```

## 数学
### 136题解-异或
- 136 Single Number：https://leetcode.com/problems/single-number/
    - 找出数组中只出现过一次的元素，其他元素出现两次
    - Input: [2,2,1]
    - Output: 1
- 思路2：异或，两个相同的数异或为0，与0异或为本身
> 假设 数组为 2,3,2,3,4,1,4 那么结果应该为1，过程如下：
2^3=0000 0010 ^ 0000 0011 = 0000 0001 1
1^2=0000 0001 ^ 0000 0010 = 0000 0011 3
3^3=0000 0011 ^ 0000 0011 = 0000 0000 0
0^4=0000 0000 ^ 0000 0100 = 0000 0100 4
4 ^ 1 =0000 0100 ^ 0000 0001 = 0000 0101 5
5 ^ 4= 0000 0101 ^ 0000 0100 =0000 0001 1

- 复杂度：O(n)、O(1)
```java
    public int singleNumber(int[] A) {
        int res= 0;
        for(int i=0; i<A.length; i++) {
            res ^= A[i];
        }
        return res;
    }
```

### 9题解
- 9 Palindrome Number：https://leetcode.com/problems/palindrome-number/
    - 判断整数是否为回文的，要求使用原地算法
    - Input: 121
    - Output: true
- 思路：通过取整和取余操作获取整数中对应的数字进行比较
> 如1221：
通过计算 1221 / 1000， 得首位1
通过计算 1221 % 10， 可得末位 1
进行比较
再将 22 取出来继续比较

- 复杂度：O(logn)、O(1)
```java
    public boolean isPalindrome(int x) {
        // 边界
        if(x < 0) {
            return false;
        }
        int div = 1;
        // 直到div跟x同位
        while(x/div >= 10) {
            div *= 10;
        }
        while(x > 0) {
            int left = x / div;
            int right = x % 10;
            if(left != right) {
                return false;
            }
            // 去掉第一位和最后一位
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
```
