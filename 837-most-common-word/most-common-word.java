class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
      String [] arr=paragraph.split("[ .,!?;']+");
        HashMap<String,Integer> myMap=new HashMap<>();
        for(String v:arr){
            myMap.put(v.toLowerCase(),myMap.getOrDefault(v.toLowerCase(),0)+1);
        }
        for(String v:banned){
            myMap.put(v.toLowerCase(),0);
        }
        int max=-1;
        String ans="";
        for(String v:myMap.keySet()){
            int n=myMap.get(v);
            if(max<n){
                max=n;
                ans=v;
            }
        }
        return ans;  
    }
}