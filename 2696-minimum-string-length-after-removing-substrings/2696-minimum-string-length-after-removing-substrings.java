class Solution {
    public int minLength(String s) {
        Stack<Character> stk=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(!stk.isEmpty() && ((stk.peek()=='A' && ch[i]=='B') || (stk.peek()=='C' && ch[i]=='D')))
            {
                stk.pop();
            }
            else
            {
                stk.push(ch[i]);
            }
        }
        return stk.size();
    }
}