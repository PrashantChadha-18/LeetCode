class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='#')
            {
                stk.push(ch);
            }
            else
            {
                if(!stk.isEmpty())
                {
                    stk.pop();
                }
            }
        }
        Stack<Character> stk2=new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(ch!='#')
            {
                stk2.push(ch);
            }
            else
            {
                if(!stk2.isEmpty())
                {
                    stk2.pop();
                }
            }
        }
        if(stk.equals(stk2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}