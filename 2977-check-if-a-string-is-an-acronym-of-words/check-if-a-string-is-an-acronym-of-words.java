class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String s1="";
        for(String i : words)
        s1+=i.toCharArray()[0];
        return s1.equals(s);

    }
}