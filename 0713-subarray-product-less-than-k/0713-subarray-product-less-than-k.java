class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left =0,right =0;
        int prod =1;
        int c=0;
        while(right<n)
        {
            prod *= nums[right];
            while(prod>=k && left<=right)
            {
                prod = prod/nums[left];
                left++;
            }
            c +=(right-left+1);
            right++;
        }
        return c;
    }
}