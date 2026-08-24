class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0,right=0,ans=0;
        int n = s.length();
        Set<Character> s1 = new HashSet<>();
        while(right<n)
        {
            if(!s1.contains(s.charAt(right)))
            {
                s1.add(s.charAt(right));
                ans = Math.max(ans,s1.size());
                right++;
            }
            else
            {
                s1.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}