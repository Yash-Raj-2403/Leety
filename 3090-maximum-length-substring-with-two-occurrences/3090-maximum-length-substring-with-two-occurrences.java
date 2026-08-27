class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left =0,right =0;
        int ans =0;
        Map<Character,Integer> mp = new HashMap<>();
        while(right<n)
        {
            char ch = s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>2)
            {
                char cha = s.charAt(left);
                mp.put(cha,mp.getOrDefault(cha,0)-1);
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}