class Solution {
    public boolean detectCapitalUse(String w) {
        int c = 0;
        for (char x : w.toCharArray()) 
        {
            if (Character.isUpperCase(x)) 
                c++;
        }
        return c == 0 || c == w.length() || (c == 1 && Character.isUpperCase(w.charAt(0)));
    }
}