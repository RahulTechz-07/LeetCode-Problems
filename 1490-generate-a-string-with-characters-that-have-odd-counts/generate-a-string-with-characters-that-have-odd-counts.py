class Solution:
    def generateTheString(self, n: int) -> str:
        s=""
        f=1
        if n%2==0:
            c=n-1
            s+="a"*c
            f=0
        else:
            s+="a"*n
        if f==0:
            s+="b"
        return s
        