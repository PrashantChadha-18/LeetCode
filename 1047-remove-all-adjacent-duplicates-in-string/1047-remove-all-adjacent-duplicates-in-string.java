class Solution {
    public String removeDuplicates(String s) {
        // Stack<Character> stk=new Stack<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(stk.isEmpty() || ch!=stk.peek())
        //     {
        //         stk.push(ch);
        //     }
        //     else
        //     {
        //         if(!stk.isEmpty())
        //         {
        //             stk.pop();
        //         }
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // while(!stk.isEmpty())
        // {
        //     sb.append(stk.pop());
        // }
        // return sb.reverse().toString();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int n=sb.length();
            if(n>0 && sb.charAt(n-1)==ch)
            {
                sb.deleteCharAt(n-1);
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}