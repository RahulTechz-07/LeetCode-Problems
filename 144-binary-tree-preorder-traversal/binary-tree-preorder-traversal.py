# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        l=[]
        def pre(root):
            if root is None:
                return 
            l.append(root.val)
            pre(root.left)
            pre(root.right)
        pre(root)
        return l

        
        