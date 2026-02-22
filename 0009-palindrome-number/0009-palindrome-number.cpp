class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        else
        {
            int n =x;
            long long rev=0;
            while(n!=0)
            {
                int re = n%10;
                rev = rev*10 + re;
                n/=10;
            }
            return rev == x;
        }
    }
};