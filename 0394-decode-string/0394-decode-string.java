class Solution {
    public String decodeString(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=']')
            {
                stk.push(ch);
            }
            else
            {
                StringBuilder sb=new StringBuilder();
                while(!stk.isEmpty() && stk.peek()!='[')
                {
                    sb.insert(0,stk.pop());
                }
                stk.pop();
                StringBuilder num=new StringBuilder();
                while(!stk.isEmpty() && Character.isDigit(stk.peek()))
                {
                    num.insert(0,stk.pop());
                }
                int n=Integer.parseInt(num.toString());
                StringBuilder sb2=new StringBuilder();
                for(int j=0;j<n;j++)
                {
                    sb2.append(sb);
                }
                for(int k=0;k<sb2.length();k++)
                {
                    stk.push(sb2.charAt(k));
                }
            }
        }
        StringBuilder finl=new StringBuilder();
        while(!stk.isEmpty())
        {
            finl.append(stk.pop());
        }
        return finl.reverse().toString();
    }
}