class Solution(object):
    def removeTrailingZeros(self, num):
        """
        :type num: str
        :rtype: str
        """
        num=num[::-1]
        s=int(num)
        k=str(s)
        k=k[::-1]
        return k