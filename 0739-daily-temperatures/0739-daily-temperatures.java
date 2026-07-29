class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length];
        for(int i=0;i<temp.length;i++)
        {
            ans[i]=0;
        }
        Stack<Integer> stk=new Stack<>();
        for(int i=temp.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && temp[stk.peek()]<=temp[i])
            {
                stk.pop();
            }
            if(!stk.isEmpty())
            {
                ans[i]=stk.peek()-i;
            }
            stk.push(i);
        }
        return ans;
    }
}