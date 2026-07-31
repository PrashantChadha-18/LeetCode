class Solution {
    public void rotate(int[] nums, int k) {
        int left=0;
        int right=nums.length-1;
        k=k%nums.length;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        int l=0;
        int r=k-1;
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        int g=k;
        int f=nums.length-1;
        while(g<f)
        {
            int temp=nums[g];
            nums[g]=nums[f];
            nums[f]=temp;
            g++;
            f--;
        }
    }
}