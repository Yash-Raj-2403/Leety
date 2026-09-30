class Solution {
    public int beautySum(String s) {
        int n = s.length();
        // int[] freq = new int[26];
        // for(int i=0;i<n;i++)
        // {
        //     char ch = s.charAt(i);
        //     freq[ch-'a']++;
        // }
        // for(int i)
        // for(int i=0;i<n;i++)
        // {
        //     char ch = s.charAt(i);
        //     mp.put(ch,mp.getOrDefault(ch,0)+1);
        // }
        // int maxa = Collections.max(mp.values());
        // int mina = Collections.min(mp.values());
        // return maxa-mina;
        //int left =0,right=0;
        int ans =0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> mp = new HashMap<>();
            int maxa=0;
            //mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
            for(int j=i;j<n;j++)
            {
                char ch = s.charAt(j);
                int fre = mp.getOrDefault(ch,0)+1;
                mp.put(ch,fre);
                maxa = Math.max(fre,maxa);
                int mina = Integer.MAX_VALUE;
                for(int x:mp.values())
                {
                    mina = Math.min(mina,x);
                }
                if(maxa -mina !=0)ans+=maxa-mina;
                //left++;
            }
            //right++;
        }
        return ans;
    }
}