from typing import List


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        def helper(node):
            # condition：如果为空，返回[]
            if node is None:
                return []
            # recursion：先遍历左，再添加根节点值，再遍历右
            return helper(node.left)+[node.val]+helper(node.right)
        return helper(root)


if __name__ == '__main__':
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    res = Solution().inorderTraversal(root)
    print(res)

