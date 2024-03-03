class Solution(object):
    def countKeyChanges(self, s):
        """
        :type s: str
        :rtype: int
        """
        s=s.lower()
        c=0
        for i in range(0,len(s)-1):
            if(s[i] != s[i+1]):
                c+=1
        return c;        