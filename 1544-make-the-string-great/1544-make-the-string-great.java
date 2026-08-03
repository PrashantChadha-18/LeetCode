class Solution {
    public String makeGood(String s) {
        Stack<Character> stk=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(!stk.isEmpty() && Math.abs(stk.peek()-ch[i])==32)
            {
                stk.pop();
            }
            else
            {
                stk.push(ch[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty())
        {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}