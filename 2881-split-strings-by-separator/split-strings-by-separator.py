class Solution(object):
    def splitWordsBySeparator(self, words, separator):
        """
        :type words: List[str]
        :type separator: str
        :rtype: List[str]
        """
        s=[]
        for i in words:
            k=i.split(separator)
            for j in k:
                s.append(j)
        d=[]
        for i in s:
            if i !="":
                d.append(i)
        return d
        