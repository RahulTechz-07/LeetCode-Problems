class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        num=format(n,'b')
        for i in range(len(num)-1):
            if(int(num[i])==int(num[i+1])):
                return False
        return True
        