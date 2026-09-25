class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int i=0;i<k;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        ans[0] = mp.lastKey();
        for(int i=1;i<nums.length-k+1;i++)
        {
            int add = nums[i+k-1];
            mp.put(add,mp.getOrDefault(add,0)+1);
            int rem = nums[i-1];
            mp.put(rem,mp.getOrDefault(rem,0)-1);
            if(mp.get(rem) == 0) mp.remove(rem);
            ans[i] = mp.lastKey();
        }
        return ans;
    }
}