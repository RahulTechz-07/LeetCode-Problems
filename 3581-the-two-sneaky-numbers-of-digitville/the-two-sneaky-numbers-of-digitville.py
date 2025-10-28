class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        c=0
        l=set()
        for i in nums:
            if(nums.count(i)==2):
                l.add(i)

        return list(l)