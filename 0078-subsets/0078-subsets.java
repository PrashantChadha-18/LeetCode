class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(0,nums,temp,ans);
        return ans;
    }
    public void solve(int index,int[] nums,List<Integer> temp,List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        solve(index+1,nums,temp,ans);
        temp.add(nums[index]);
        solve(index+1,nums,temp,ans);
        temp.remove(temp.size()-1);
    }
}