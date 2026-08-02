class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
            {
                st.push(ch[i]);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                int top=st.pop();
                if((ch[i]==')' && top!='(') || (ch[i]=='}' && top!='{') || (ch[i]==']' && top!='['))
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }
}