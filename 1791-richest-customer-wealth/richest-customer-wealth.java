class Solution {
    public int maximumWealth(int[][] a) 
    {
        int n=0;
        for(int i=0;i<a.length;i++)
        {
        int m=0;
            for(int j=0;j<a[i].length;j++)
            {
                m+=a[i][j];
            }
            if(m>n)
            {
                n=m;
            }
        }
        return n;
    }
}