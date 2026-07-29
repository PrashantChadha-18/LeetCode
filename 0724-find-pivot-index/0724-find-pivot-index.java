class Solution {
    public int pivotIndex(int[] nums) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     int left=0;
        //     for(int j=0;j<i;j++)
        //     {
        //         left+=nums[j];
        //     }
        //     int right=0;
        //     for(int k=i+1;k<nums.length;k++)
        //     {
        //         right+=nums[k];
        //     }
        //     if(left==right)
        //     {
        //         return i;
        //     }
        // }
        // return -1;
        int totalsum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalsum+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++)
        {
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum)
            {
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}