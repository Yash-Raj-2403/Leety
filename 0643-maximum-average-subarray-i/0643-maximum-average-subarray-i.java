class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum =0;
        for(int i=0;i<k;i++)
        {
            sum += nums[i];
        }
        double avg = sum/k;
        double mx = avg;
        for(int i=1;i<n-k+1;i++)
        {
            sum += nums[i+k-1] -nums[i-1];
            avg = sum/k;
            mx = Math.max(mx,avg);
        }
        return mx;
    }
}