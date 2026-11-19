class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        solve(nums,used,temp,ans);
        return ans; 
    }
    public void solve(int[] nums,boolean[] used,List<Integer> temp,List<List<Integer>> ans)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!used[i])
            {
                temp.add(nums[i]);
                used[i]=true;
                solve(nums,used,temp,ans);
                temp.remove(temp.size()-1);
                used[i]=false;
            }
        }
    }
}