class Solution {
    public String maximumOddBinaryNumber(String s) {
       char a[] = s.toCharArray();
       int c1=0;
       int c2=0;
       for(char i : a)
       if(i=='1')
       c1++;
       else
       c2++;
       String res="";
       while(c1!=1)
       {
       res+=1;
       c1--;
       }
       while(c2!=0)
       {
       res+=0;
       c2--;}
       return res+1;
    }
}