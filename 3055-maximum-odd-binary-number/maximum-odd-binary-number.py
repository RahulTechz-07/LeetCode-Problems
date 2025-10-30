class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        l=list(s)
        l.sort()
        c=[]
        res=[]
        c.append(l.count('0'))
        c.append(l.count('1'))
        print(l,"ff",c)
        a=int(c[1])
        b=int(c[0])
        while a!=1:
            res.append(1)
            a-=1
        while b!=0:
            res.append(0)
            b-=1
        res.append(1)
        s=""
        for i in res:
            s+=str(i)
        return s