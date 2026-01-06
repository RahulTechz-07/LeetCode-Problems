class Solution {
    public int maxFreqSum(String c1) 
    {
        int a=0,e=0,j=0,o=0,u=0;
        int m=0,c=0;
        char s[] = c1.toCharArray();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='a')
            {
                a++;
                if(a>c)
                c=a;
            }
            else if(s[i]=='e')
            {
                e++;
                if(e>c)
                c=e;
            }
            else if(s[i]=='i')
            {
                j++;
                if(j>c)
                c=j;
            }
            else if(s[i]=='o')
            {
                o++;
                if(o>c)
                c=o;
            }
            else if(s[i]=='u')
            {
                u++;
                if(u>c)
                c=u;
            }
         
    else
    {
            int n=1;
            for(int k=i+1;k<s.length;k++)
            {
                if(s[i]==s[k])
                {
                    n++;
                }
                
            }
            if(n>m)
                {
                    m=n;
                }
    }
    }
    return m+c;
    }
}