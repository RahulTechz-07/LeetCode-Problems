class Solution:
    def stableMountains(self, nums: List[int], threshold: int) -> List[int]:
        l=[]
        for i in range(1,len(nums)):
            if nums[i-1]>threshold:
                l.append(i)
        return l