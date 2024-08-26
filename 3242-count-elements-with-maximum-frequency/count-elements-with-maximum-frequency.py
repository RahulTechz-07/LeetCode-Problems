class Solution(object):
    def maxFrequencyElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=set(nums)
        l1=[]
        for i in l:
            l1.append(nums.count(i))
        print(l1)
        c=max(l1)
        s=0
        for i in l1:
            if i==c:
                s+=i
        return s
