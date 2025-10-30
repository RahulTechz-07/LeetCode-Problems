class Solution {
    public String generateTheString(int n) {
        String ans="a";
        if(n%2!=0)
        {
            ans= ans.repeat(n);
            return ans;
        }
        else
        {
            ans= ans.repeat(n-1);
            return ans+"b";

        }
        
    }
}