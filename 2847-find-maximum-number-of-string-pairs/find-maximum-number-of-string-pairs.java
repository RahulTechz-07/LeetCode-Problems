class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length-1;i++)
        for(int j=i+1;j<words.length;j++)
        if(words[i].equals(new StringBuffer(words[j]).reverse().toString()))
        c++;
        return c;
    }
}