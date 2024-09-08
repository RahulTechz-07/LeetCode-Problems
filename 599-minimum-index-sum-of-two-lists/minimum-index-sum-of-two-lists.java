class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        int c;
        for(int i=0;i<list1.length;i++)
        for(int j=0;j<list2.length;j++)
        if(list1[i].equals(list2[j]))
        {
            c=i+j;
            l1.add(list1[i]);
            l2.add(c);
        }
        int m = Collections.min(l2);
        for(int i=0;i<l2.size();i++)
        if(m==l2.get(i))
        l3.add(l1.get(i));
        String s[] = new String[l3.size()];
        int k=0;
        for(String i:l3)
        s[k++]=i;
        return s;
    }
}