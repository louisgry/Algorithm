import collections
from typing import List


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def findMode(self, root: TreeNode) -> List[int]:
        if root is None:
            return []
        # 先bfs
        res = []
        nodes = []
        queue = collections.deque()
        # root入队
        queue.append(root)
        while queue:
            for _ in range(len(queue)):
                node = queue.popleft()
                nodes.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
        # 再统计众数
        counter = collections.Counter(nodes).most_common()
        for k, v in counter:
            if v == counter[0][1]:
                res.append(k)
        return res

if __name__ == '__main__':
    root = TreeNode(1)
    root.left = TreeNode(1)
    root.right = TreeNode(1)
    print(Solution().findMode(root))
