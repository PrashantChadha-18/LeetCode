class Solution {
    // static int[] compute(String patt)
    // {
    //     int m=patt.length();
    //     int[] lps=new int[m];
    //     int len=0;
    //     int i=1;
    //     while(i<m)
    //     {
    //         if(patt.charAt(i)==patt.charAt(len))
    //         {
    //             len++;
    //             lps[i]=len;
    //             i++;
    //         }
    //         else
    //         {
    //             if(len!=0)
    //             {
    //                 len=lps[len-1];
    //             }
    //             else{
    //                 lps[i]=0;
    //                 i++;
    //             }
    //         }
    //     }
    //     return lps;
    // }
    public int strStr(String text, String pat) {
        int n=text.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++)
        {
            int j=0;
            while(j<m && text.charAt(i+j)==pat.charAt(j))
            {
                j++;
            }
            if(j==m)
            {
                return i;
            }
        }
        return -1;
        // return haystack.indexOf(needle);

        // int n=text.length();
        // int m=pat.length();
        // int[] lps=compute(pat);
        // int i=0;
        // int j=0;
        // while(i<n)
        // {
        //     if(text.charAt(i)==pat.charAt(j))
        //     {
        //         i++;
        //         j++;
        //     }
        //     if(j==m)
        //     {
        //         return i-j;
        //     }
        //     else if(i<n && text.charAt(i)!=pat.charAt(j)){
        //         if(j!=0)
        //         {
        //             j=lps[j-1];
        //         }
        //         else
        //         {
        //             i++;
        //         }
        //     }
        // }
        // return -1;
    }
}