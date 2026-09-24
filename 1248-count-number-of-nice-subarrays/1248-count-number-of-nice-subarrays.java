class Solution {
    int cout(int[]nums,int k)
    {
        int od=0,ans=0;
        int n = nums.length;
        int left =0,right=0;
        while(right<n)
        {
            if(nums[right]%2!=0)
            {
                od++;
            }
            while(od>k)
            {
                if(nums[left]%2!=0) od--;
                left++;
            }
            ans += right-left+1;
            right++;

        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return cout(nums,k)-cout(nums,k-1);
    }
}