class Solution {
    int cont(String s,int k)
    {
        int n = s.length();
        Map<Character,Integer> mp = new HashMap<>();
        int left=0,right =0,ans=0;
        while(right<n)
        {
            char ch = s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.size()>k)
            {
                char ch1 = s.charAt(left);
                mp.put(ch1,mp.getOrDefault(ch1,0)-1);
                if(mp.get(ch1) == 0) mp.remove(ch1);
                left++;
            }
            ans +=(right-left+1); 
            right++;
        }
        return ans;
    }
    public int numberOfSubstrings(String s) {
        return cont(s,3)-cont(s,2);
    }
}