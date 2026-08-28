class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        int c=0;
        for(int x:nums1)
        {
            s.add(x);
        }
        for(int x:nums2)
        {
            if(s.contains(x))
            {
                return x;
            }
        }
        return -1;
    }
}