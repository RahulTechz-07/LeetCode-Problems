class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        return map(int,list(str(int("".join(map(str, num))) + k)))
        