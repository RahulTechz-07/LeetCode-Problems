# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def countNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        c=[]
        def pre(root):
            if root is None :
                return
            c.append(1)
            pre(root.left)
            pre(root.right)
        pre(root)
        return sum(c)

        