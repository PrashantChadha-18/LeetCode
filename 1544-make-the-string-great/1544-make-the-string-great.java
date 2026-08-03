class Solution {
    public String makeGood(String s) {
        // Stack<Character> stk=new Stack<>();
        // char[] ch=s.toCharArray();
        // for(int i=0;i<ch.length;i++)
        // {
        //     if(!stk.isEmpty() && Math.abs(stk.peek()-ch[i])==32)
        //     {
        //         stk.pop();
        //     }
        //     else
        //     {
        //         stk.push(ch[i]);
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
            if(n>0 && Math.abs(sb.charAt(n-1)-ch)==32)
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