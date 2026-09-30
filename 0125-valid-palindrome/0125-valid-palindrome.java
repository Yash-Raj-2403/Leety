class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                str.append(ch);
            }
        }
        String ans = str.toString();
        int l = 0,r = ans.length()-1;
        while(l<=r)
        {
            if(ans.charAt(l) != ans.charAt(r))
            {
                return false;
            }
            l++;r--;
        }
        return true;
    }
}