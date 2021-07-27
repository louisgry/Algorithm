# LeetCode Top 100（Golang）

## Easy

### [461. 汉明距离](https://leetcode-cn.com/problems/hamming-distance/)

- 题目： 汉明距离指的是这两个数字对应二进制位不同的位置的数目，给你两个整数 `x` 和 `y`，计算并返回它们之间的汉明距离。
- 通过率：81.0%
- 题解：异或

```go
func hammingDistance(x int, y int) int {
    xor := x ^ y
    s := fmt.Sprintf("%b", xor)

    res := 0
    for _, v := range s {
        if string(v) == "1" {
            res++
        }
    }
    return res
}
```

### [617. 合并二叉树](https://leetcode-cn.com/problems/merge-two-binary-trees/)

- 题目：给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
- 通过率：78.9%
- 题解：递归

```go
func mergeTrees(root1 *TreeNode, root2 *TreeNode) *TreeNode {
    if root1 == nil {
        return root2
    }
    if root2 == nil {
        return root1
    }
    mergeNode := &TreeNode{root1.Val+root2.Val, nil, nil}
    mergeNode.Left = mergeTrees(root1.Left, root2.Left)
    mergeNode.Right = mergeTrees(root1.Right, root2.Right)
    return mergeNode
}
```

### [338. 比特位计数](https://leetcode-cn.com/problems/counting-bits/)

- 题目：给定一个非负整数 **num**。对于 **0 ≤ i ≤ num** 范围中的每个数字 **i** ，计算其二进制数中的 1 的数目并将它们作为数组返回。
- 通过率：78.7%
- 题解：`fmt.Sprintf("%b", i)`

```go
func countBits(n int) []int {
    res := []int{}
    for i:=0; i<=n; i++ {
        bitStr := fmt.Sprintf("%b", i)
        count := 0
        for _, c := range bitStr {
            if string(c) == "1" {
                count ++
            }
        }
        res = append(res, count)
    }
    return res
}
```

### [226. 翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/)

- 题目：翻转一棵二叉树。
- 通过率：78.6%
- 题解：递归

```go
func invertTree(root *TreeNode) *TreeNode {
    if root == nil {
        return nil
    }
    // 递归反转左右子树
    invertTree(root.Left)
    invertTree(root.Right)
    // 左右对换
    root.Left, root.Right = root.Right, root.Left
    return root
}
```

### [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)

- 题目：给定一个二叉树，找出其最大深度。
- 通过率：76.4%
- 题解：递归

```go
func maxDepth(root *TreeNode) int {
    if root == nil {
        return 0
    }
    return max(maxDepth(root.Left), maxDepth(root.Right))+1
}

func max(x, y int) int {
    if x > y {
        return x
    } else {
        return y
    }
}
```

### [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)

- 题目：给定一个二叉树的根节点 `root` ，返回它的 **中序** 遍历。

- 通过率：75.5%
- 题解：递归

```go
var res []int
func inorderTraversal(root *TreeNode) []int {
    res = []int{}
    helper(root)
    return res
}

func helper(root *TreeNode) {
    if root == nil {
        return 
    }
    helper(root.Left)
    res = append(res, root.Val)
    helper(root.Right)
}
```

### [206. 反转链表](https://leetcode-cn.com/problems/reverse-linked-list/)

- 题目：给你单链表的头节点 `head` ，请你反转链表，并返回反转后的链表。
- 通过率： 72.0%
- 题解：递归

```go
func reverseList(head *ListNode) *ListNode {
    if head == nil || head.Next == nil {
        return head
    }
    newNode := reverseList(head.Next)
    head.Next.Next = head
    head.Next = nil
    return newNode
}
```





## Medium

### [78. 子集](https://leetcode-cn.com/problems/subsets/)

- 题目：给你一个整数数组 `nums` ，数组中的元素 **互不相同** 。返回该数组所有可能的子集（幂集）。
- 通过率：80.0%
- 题解：

```go
func subsets(nums []int) [][]int {
    res := [][]int{{}}
    for i:=0; i<len(nums); i++ {
        // 必须用range遍历
        for _, arr := range res {
            tmp := append([]int{}, arr...)
            tmp = append(tmp, nums[i])
            res = append(res, tmp)
        }
    }
    return res
}
```





## Hard

