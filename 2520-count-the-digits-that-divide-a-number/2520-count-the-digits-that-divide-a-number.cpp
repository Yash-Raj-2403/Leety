class Solution {
public:
    int countDigits(int num) {
        int a =num;
        int c=0;
        while(a!=0)
        {
            int re = a%10;
            if(num % re ==0)
            {
                c++;
            }
            a=a/10;
        }
        return c;
    }
};