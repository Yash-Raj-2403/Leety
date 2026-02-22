class Solution {
public:
    int mirrorDistance(int n) {
        int a =n;
        int rev =0;
        while(a!=0)
        {
            int re = a%10;
            rev = rev*10 + re;
            a/=10;
        }
        return abs(n-rev);
    }
};