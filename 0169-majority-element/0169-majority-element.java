class Solution {
    public int majorityElement(int[] nums) {
        // // for(int i=0;i<nums.length;i++)
        // // {
        // //     int count=0;
        // //     for(int j=0;j<nums.length;j++)
        // //     {
        // //         if(nums[i]==nums[j])
        // //         {
        // //             count++;
        // //         }
        // //     }
        // //     if(count>nums.length/2)
        // //     {
        // //         return nums[i];
        // //     }
        // // }
        // // return -1;

        // Arrays.sort(nums);
        // return nums[nums.length/2];

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int ch=nums[i];
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            int ch=nums[i];
            if(map.get(ch)>nums.length/2)
            {
                return ch;
            }
        }
        return -1;
    }
}