class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int mina = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            while(nums[i]>0)
            {
                sum += nums[i]%10;
                nums[i]/=10;
            }
            mina = Math.min(mina,sum);
        }
        return mina;
    }
}