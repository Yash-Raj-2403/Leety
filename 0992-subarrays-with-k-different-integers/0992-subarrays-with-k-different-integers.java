class Solution {
    int ans(int[] nums,int k)
    {
        int left =0,right=0,ans=0,n=nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        while(right<n)
        {
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.size()>k)
            {
                mp.put(nums[left],mp.getOrDefault(nums[left],0)-1);
                if(mp.get(nums[left]) == 0) mp.remove(nums[left]);
                left++;
            }
            ans +=(right-left+1); 
            right++;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return ans(nums,k)-ans(nums,k-1);
    }
}