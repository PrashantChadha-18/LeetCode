class Solution {
    public int reverse(int x) {
        int reverse=0;
        while(x!=0)
        {
            int digit=x%10;
            if(reverse>214748364 || (reverse==214748364 && digit>7))
            {
                return 0;
            }
            if(reverse<-214748364 || (reverse==-214748364 && digit<-8))
            {
                return 0;
            }
            reverse=reverse*10+digit;
            x=x/10;
        }
        return reverse;
    }
}