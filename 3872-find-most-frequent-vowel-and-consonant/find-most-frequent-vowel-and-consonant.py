class Solution:
    def maxFreqSum(self, s: str) -> int:
        
        big1 = 0
        big2 = 0
        l=list(s)
        print(l)
        for i in l:
            if (i=='a' or i=='o' or i=='e' or i=='i' or i=='u') :
                if big1<l.count(i):
                    big1=l.count(i)
            else:
                if(big2<l.count(i)):
                    big2=l.count(i)
        return big1+big2 