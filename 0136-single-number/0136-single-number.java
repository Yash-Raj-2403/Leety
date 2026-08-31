class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int x:nums)
        {
            if(s.contains(x))
            {
                s.remove(x);
                continue;
            }
            s.add(x);
        }
        int ans =0;
        for(int x:s)
        {
            ans = x;
        }
        return ans;
    }
}