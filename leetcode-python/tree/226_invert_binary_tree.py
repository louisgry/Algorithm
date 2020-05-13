class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        # condition：如为空，返回空
        if root is None:
            return None
        # recursion：先swap，再递归
        root.left, root.right = root.right, root.left
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root


if __name__ == '__main__':
    # tree
    t = TreeNode(1)
    t.left = TreeNode(2)
    t.right = TreeNode(3)
    # invert
    res = Solution().invertTree(t)
    print(res.val, res.left.val, res.right.val)
