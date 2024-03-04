class Solution(object):
    def differenceOfSums(self, n, m):
        """
        :type n: int
        :type m: int
        :rtype: int
        """
        s=0
        for i in range(1,n+1):
            if i%m==0:
                s+=i
        s1=0
        for i in range(1,n+1):
            if i%m!=0:
                s1+=i
        return s1-s


        