import java.util.*;
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> l1 = new ArrayList<>();
      
        for(int i=0;i<l.length;i++)
        {
             List<Integer> m=new ArrayList<>();
            for(int j=l[i];j<r[i]+1;j++)
            {
                m.add(nums[j]);
            }
        if(m.size()<2)
        l1.add(false);
        else
        {
        Collections.sort(m);
        int s=m.get(1)-m.get(0);
        int f=1;
        for(int k=0;k<m.size()-1;k++)
        if(m.get(k+1)-m.get(k)!=s)
        {
            l1.add(false);
            f=0;
            break;
        }
        if(f==1)
            l1.add(true);
        }  
        }
         return l1;
    }
}