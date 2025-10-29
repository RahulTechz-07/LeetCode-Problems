class Solution:
    def isBalanced(self, nums: str) -> bool:
        s1,s2=0,0
        for i in range(len(nums)):
            if i%2 == 0:
                s1+=int(nums[i])
            else:
                s2+=int(nums[i])
        return s1==s2
            