class Solution {
public:
    int dsum(int n)
    {
        int sum=1;
        while(n!=0)
        {
            sum *= n%10;
            n/=10;
        }
        return sum;
    }
    int smallestNumber(int n, int t) {
        while(dsum(n)%t!=0) 
        {
            n++;
        }
        return n;
    }
};