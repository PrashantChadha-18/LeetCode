class Solution {
    public int[] twoSum(int[] num, int t) {
        int[] arr=new int[2];
        int left=0;
        int right=num.length-1;
        while(left<right)
        {
            int sum=num[left]+num[right];
            if(sum==t)
            {
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            if(sum<t)
            {
                left++;
            }
            else if(sum>t)
            {
                right--;
            }
        }
        return arr;
    }
}