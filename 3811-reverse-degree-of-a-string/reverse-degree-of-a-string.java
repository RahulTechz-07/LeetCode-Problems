class Solution {
    public int reverseDegree(String s) {
        int s1=0;
        for(int i=0;i<s.length();i++)
        {
            int v = s.charAt(i) - 97;
            int v2 = 26-v;
            s1+=(i+1)*v2;
        }
        return s1;
    }
}