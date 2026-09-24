class Solution {
    int cont(int[] nums,int k)
    {
        int n= nums.length;
        int left =0,right =0,ans=0;
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
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int x:nums){
            st.add(x);
        }
        int k = st.size();
        return cont(nums,k)-cont(nums,k-1);
    }
}