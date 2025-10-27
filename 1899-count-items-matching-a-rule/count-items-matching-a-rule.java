class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

      int c=0,p=0;
      if(ruleKey.equals("type"))
      p=0;
      else if(ruleKey.equals("color"))
      p=1;
      else
      p=2;
      for(List<String> s : items)
      {
      
      if(s.get(p).equals(ruleValue))
      c++;
      }
    return c;
    }
}