class Solution {
    public int reverseDegree(String s) {
      char a[] = new char[26];
      char c='a';
    for(int i=25;i>=0;i--)
    a[i]=c++;
    int s1=0,c1=1;
    for(char k : s.toCharArray())
    for(int i=25;i>=0;i--)
    {
        if(k==a[i])
        {
        System.out.println((i+1));
        s1+=(i+1)*c1;
        c1++;
        break;
        }
    }
    return s1;
    }
}