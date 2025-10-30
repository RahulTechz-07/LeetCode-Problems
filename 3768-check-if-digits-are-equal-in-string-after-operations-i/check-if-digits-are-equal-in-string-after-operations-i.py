class Solution:
    def hasSameDigits(self, s: str) -> bool:
        while(len(s)!=2):
            k=""
            for i in range(len(s)-1):
                k+=str((int(s[i])+int(s[i+1]))%10)
            s=k
            print(s)
        return list(s).count(s[0]) == 2

        
