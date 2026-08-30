class Solution {
    int ans(int[] nums,int goal)
    {
        if(goal<0) return 0;
        int left =0,right=0,sum=0,ans=0;
        int n = nums.length;
        while(right<n)
        {
            sum += nums[right];
            while(sum>goal)
            {
                sum -= nums[left];
                left++;
            }
            ans +=(right-left+1);
            right++;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return ans(nums,goal)-ans(nums,goal-1);
}
}