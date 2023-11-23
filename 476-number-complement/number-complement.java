class Solution {
    public int findComplement(int num) {
       String k = Integer.toBinaryString(num);
       String s="";
       for(char c : k.toCharArray())
       {
           if(c=='0')
           s+='1';
           else
           s+='0';
       } 
       return Integer.parseInt(s,2);
    }
}