class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=-1;
        }
        Stack<Integer> stk=new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--)
        {
            int num=nums[i%nums.length];
            while(!stk.isEmpty() && stk.peek()<=num)
            {
                stk.pop();
            }
            if(!stk.isEmpty() && i<nums.length)
            {
                arr[i]=stk.peek();
            }
            stk.push(num);
        }
        return arr;
    }
}