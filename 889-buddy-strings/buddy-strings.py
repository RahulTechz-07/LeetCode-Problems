class Solution:
    def buddyStrings(self, s: str, goal: str) -> bool:
        cnt=0
        if (len(goal)!=len(s)) or len(s)==1:
            return False
        a,b=list(s),list(goal)
        a.sort()
        b.sort()
        if a!=b:
            return False
        if s==s[::-1]:
            return True
        dic=dict()
        for i in s:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
    
        for i in range(len(s)):
            if s[i]!=goal[i]:
                cnt+=1
        if cnt==0:
            for i in dic:
                if dic[i]>=2:
                    return True
        if cnt==2:
            return True
        return False