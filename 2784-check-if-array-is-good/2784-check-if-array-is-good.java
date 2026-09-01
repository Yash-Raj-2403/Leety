class Solution {
    public boolean isGood(int[] nums) {
        int maxa = -1,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(maxa<nums[i])
            {
                maxa = nums[i];
            }
        }
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums)
        {
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        return ((mp.get(maxa) == 2) && (mp.size() == maxa) && (n == maxa+1)) ;
    }
}