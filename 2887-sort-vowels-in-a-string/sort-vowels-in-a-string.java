class Solution {
    public String sortVowels(String s) {
        char a[] = new char[s.length()];
        int j=0;
        for(char i : s.toCharArray())
        {
        if(i!='a' && i!='e' && i!='i' && i!='o' && i!='u' && i!='A' && i!='E' && i!='O' && i!='U'&& i!='I')
        a[j]=i;
        j++;
        }
        List<Character> set = new ArrayList<>();
        for (char i : s.toCharArray())
         if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u' || i=='A' || i=='E' || i=='O' || i=='U'|| i=='I')
            set.add(i);
        List s1 = set.stream().sorted().toList();
        int k=0;
        for(int i=0;i<s.length();i++)
        if(a[i]=='\0')
        a[i]=(char)s1.get(k++);

        return String.valueOf(a);

     }
}