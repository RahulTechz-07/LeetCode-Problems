class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        
        for i in range(0,k):
            sm = min(nums)
            l = nums.index(sm)
            nums[l]*=multiplier
        return nums