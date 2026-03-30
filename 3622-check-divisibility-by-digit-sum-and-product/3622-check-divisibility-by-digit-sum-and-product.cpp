class Solution {
public:
    bool checkDivisibility(int n) {
        if(n==0) return false;
        int f =n;
        int sum=0,prod=1;
        while(n!=0)
        {
            int re = n%10;
            sum = sum+re;
            prod = prod*re;
            n=n/10;
        }
        int fin = sum + prod;
        return f%fin==0;
    }
};