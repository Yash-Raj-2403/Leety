class Solution {
    public int countGoodSubstrings(String sa) {
        int n = sa.length();
        int c=0;
        for(int i=2;i<n;i++)
        {
            char ch = sa.charAt(i-2);
            char cha = sa.charAt(i-1);
            char chaa = sa.charAt(i);
            if(ch != cha && cha != chaa && chaa != ch)
            {
                c++;
            }
        }
        return c;
    }
}