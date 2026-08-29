class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left =0,right =0;
        int ans=0;
        Map<Integer,Integer> mp = new HashMap<>();
        while(right<n)
        {
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            if(mp.containsKey(0))
            {
                while(mp.get(0)>k)
                {
                    mp.put(nums[left],mp.getOrDefault(nums[left],0)-1);
                    left++;
                }
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}