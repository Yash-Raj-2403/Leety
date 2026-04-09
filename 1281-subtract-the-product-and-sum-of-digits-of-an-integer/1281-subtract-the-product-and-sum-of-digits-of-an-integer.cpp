class Solution {
public:
    int subtractProductAndSum(int n) {
        int pr=1,sum=0;
        while(n!=0)
        {
            int re = n%10;
            sum +=re;
            pr *=re;
            n/=10;
        }
        return pr-sum;
    }
};