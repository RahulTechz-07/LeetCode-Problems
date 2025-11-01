class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        l1=s1.split()
        l2=s2.split()
        l3=[]
        for i in l1:
            if i not in l2:
                l3.append(i)
        for i in l2:
            if i not in l1:
                l3.append(i)
        l4=[]
        for i  in l3:
            if(l3.count(i))==1:
                l4.append(i)
        return l4
        