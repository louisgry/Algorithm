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
