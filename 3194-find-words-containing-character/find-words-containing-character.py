class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        l=[]
        for i in range(len(words)):
            if words[i].count(x)>0:
                l.append(i)
        return l
        