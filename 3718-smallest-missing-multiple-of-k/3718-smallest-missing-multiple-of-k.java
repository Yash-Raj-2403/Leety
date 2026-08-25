class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int x:nums)
        {
            s.add(x);
        }
        for(int i=1;i<=k*100;i++)
        {
            if(!s.contains(k*i))
            {
                return k*i;
            }
        }
        return k*101;
    }
}