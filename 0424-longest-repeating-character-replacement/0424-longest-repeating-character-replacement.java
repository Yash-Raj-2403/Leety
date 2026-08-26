class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left =0,right =0;
        int ans=0,maxf=0;
        Map<Character,Integer> mp = new HashMap<>();
        while(right<n)
        {
            char ch = s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            //ans = Math.max(ans,right-left+1);
            maxf = Math.max(maxf,mp.get(ch));
            while((right-left+1)-maxf>k)
            {
                char cha = s.charAt(left);
                mp.put(cha,mp.getOrDefault(cha,0)-1);
                if(mp.get(cha) == 0)
                {
                    mp.remove(cha);
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}