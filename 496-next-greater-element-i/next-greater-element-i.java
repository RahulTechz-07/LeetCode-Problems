class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[] = new int[nums1.length];
        int k=0;
       
        for(int i=0;i<nums1.length;i++)
        for(int j=0;j<nums2.length;j++)
        if(nums1[i]==nums2[j])
        {
             int f=1;
            for(int l=j+1;l<nums2.length;l++)
            if(nums2[l]>nums1[i])
            {
            a[k++]=nums2[l];
            f=0;
            break;
            }
            if(f==1)
            a[k++]=-1;
        }
        return a;
    }
}