class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int[] ans = new int[n];
        int k =0;
        for(int i = (n-1);i>=n/2;i--){
            ans[k] = nums[i];
            k=k+2;
        }
        k=1;
        for(int i=0;i<n/2;i++)
        {
            ans[k] = nums[i];
            k=k+2;
        }
        long sum =0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                sum += (ans[i]*ans[i]); 
            }
            else{
                sum -= (ans[i]*ans[i]);
            }
        }
        return sum;
    }
}