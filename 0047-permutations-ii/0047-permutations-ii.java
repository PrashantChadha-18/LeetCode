class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] flag=new boolean[nums.length];
        solve(nums,flag,temp,ans);
        return ans;
    }
    public void solve(int[] nums,boolean[] flag,List<Integer> temp,List<List<Integer>> ans)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1] && !flag[i-1])
            {
                continue;
            }
            if(!flag[i])
            {
                temp.add(nums[i]);
                flag[i]=true;
                solve(nums,flag,temp,ans);
                temp.remove(temp.size()-1);
                flag[i]=false;
            }
        }
    }
}