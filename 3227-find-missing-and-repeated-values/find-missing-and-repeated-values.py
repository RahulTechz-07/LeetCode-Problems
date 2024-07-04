class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        l=[]
        for i in grid:
            l+=i
        r=[]
        for i in l:
            if(l.count(i)==2):
                r.append(i)
                break
        l.sort()
        l=list(set(l))
        print(l)
        for i in range(0,len(l)-1):
            if(l[i]+1!=l[i+1]):
                r.append(l[i]+1)
                break
        else:
            if(l[0]-1>0):
                r.append(l[0]-1)
            else:
                r.append(l[len(l)-1]+1)
        return r