class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
        int c[]=new int[2];
        int l=nums.length;
        int m=0;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(nums[i]==nums[j])
                {
                    c[m]=nums[i];
                    m++;
                }
            }
        }
        return c;
    }
}