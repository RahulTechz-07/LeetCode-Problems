class Solution(object):
    def vowelStrings(self, words, left, right):
        """
        :type words: List[str]
        :type left: int
        :type right: int
        :rtype: int
        """
        c=0
        l='aeiou'
        for i in range(left,right+1):
            if words[i][0] in l and words[i][len(words[i])-1] in l:
                c+=1
        return c
        