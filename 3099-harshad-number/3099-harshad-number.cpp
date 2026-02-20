class Solution {
public:
    int sumOfTheDigitsOfHarshadNumber(int x) {
        int c =x;
        int sum=0;
        while(c!=0)
        {
            int re = c%10;
            sum = sum+re;
            c/=10;
        }
        if(x%sum ==0)
        {
            return sum;
        }
        return -1;
    }
};