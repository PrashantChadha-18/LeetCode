class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int max=Integer.MIN_VALUE;
        while(left<=right)
        {
            int width=right-left;
            int height=Math.min(h[left],h[right]);
            int area=height*width;
            max=Math.max(max,area);
            if(h[left]<h[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
}