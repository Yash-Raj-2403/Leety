class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        k++;
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<Math.min(k,n);i++)
        {
            if(st.contains(nums[i]))
            {
                return true;
            }
            st.add(nums[i]);
        }
        for(int i=1;i<n-k+1;i++)
        {
            st.remove(nums[i-1]);
            if(st.contains(nums[i+k-1]))
            {
                return true;
            }
            st.add(nums[i+k-1]);
        }
        return false;
    }
}