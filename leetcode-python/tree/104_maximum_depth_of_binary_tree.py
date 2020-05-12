"""
104-二叉树的最大深度
- https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
- 给定一个二叉树，找出其最大深度
- 思路：递归
    - 终止条件：如为空，则深度为0
    - 递归过程：返回左右子树中的最大深度+1
- 复杂度：O(n)、O(h)
"""


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        # condition：如为空，则深度为0
        if root is None:
            return 0
        # recursion：返回左右子树中的最大深度+1
        return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1
