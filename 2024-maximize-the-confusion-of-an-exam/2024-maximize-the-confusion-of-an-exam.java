class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int left =0,right =0,maf=0,ans=0;
        Map<Character,Integer> mp = new HashMap<>();
        while(right<n)
        {
            char ch = answerKey.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maf = Math.max(maf,mp.get(ch));
            while((right-left+1)-maf>k)
            {
                char cha = answerKey.charAt(left);
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