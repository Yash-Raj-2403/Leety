class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left =0,right =0,ans = Integer.MAX_VALUE,sum=0;
        while(right<n)
        {
            sum += nums[right];
            while(sum>=target)
            {
                ans = Math.min(ans,right-left+1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}