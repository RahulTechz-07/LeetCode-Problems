class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        freq = {}

        for word in strs:

            newWord = ''.join(sorted(word))

            if newWord not in freq:
                freq[newWord] = []
            
            freq[newWord].append(word)

        return freq.values()
        