class Solution {
    public int findMiddleIndex(int[] nums) {
        // int totalsum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     totalsum+=nums[i];
        // }
        // int leftsum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int rightsum=totalsum-leftsum-nums[i];
        //     if(leftsum==rightsum)
        //     {
        //         return i;
        //     }
        //     leftsum+=nums[i];
        // }
        // return -1;
        for(int i=0;i<nums.length;i++)
        {
            int left=0;
            int right=0;
            for(int j=0;j<i;j++)
            {
                left+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++)
            {
                right+=nums[j];
            }
            if(left==right)
            {
                return i;
            }
        }
        return -1;
    }
}