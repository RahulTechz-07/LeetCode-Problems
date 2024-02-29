bool isPalindrome(int x) {
     long n,s;
    n=x;
    s=0;
    if(x>=0)
    {
        while(x!=0)
        {
            s=s*10+(x%10);
            x=x/10;
        }
        if(n==s)
            return true;
        else
            return false;
    }
    else
        return false;

}