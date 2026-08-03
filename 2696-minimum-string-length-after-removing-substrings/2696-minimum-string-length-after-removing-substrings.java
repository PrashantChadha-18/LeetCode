class Solution {
    public int minLength(String s) {
        // Stack<Character> stk=new Stack<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(!stk.isEmpty() && (stk.peek()=='A' && ch=='B' || stk.peek()=='C' && ch=='D') )
        //     {
        //         stk.pop();
        //     }
        //     else
        //     {
        //         stk.push(ch);
        //     }
        // }
        // return stk.size();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int n=sb.length();
            if(n>0 && (sb.charAt(n-1)=='A' && ch=='B' || sb.charAt(n-1)=='C' && ch=='D')){
                sb.deleteCharAt(n-1);
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.length();
    }
}