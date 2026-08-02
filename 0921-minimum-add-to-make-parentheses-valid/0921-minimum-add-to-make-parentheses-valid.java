class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character> stk=new Stack<>();
        // int closing=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(ch=='(')
        //     {
        //         stk.push(ch);
        //     }
        //     else{
        //         if(!stk.isEmpty())
        //         {
        //             stk.pop();
        //         }
        //         else
        //         {
        //             closing++;
        //         }
        //     }
        // }
        // return stk.size()+closing;
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open++;
            }
            else
            {
                if(open>0)
                {
                    open--;
                }
                else
                {
                    close++;
                }
            }
        }
        return open+close;
    }
}