class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            while(!stk.isEmpty() && stk.peek()>0 && a[i]<0 && stk.peek()<-a[i])
            {
                stk.pop();
            }
            if(!stk.isEmpty() && stk.peek()>0 && a[i]<0)
            {
                if(stk.peek()==-a[i])
                {
                    stk.pop();
                }
            }
            else
            {
                stk.push(a[i]);
            }
        }
        int[] ans=new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--)
        {
            ans[i]=stk.pop();
        }
        return ans;
    }
}