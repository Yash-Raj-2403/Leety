class Solution {
public:
    int hammingWeight(int n) {
        string s ="";
        while(n!=0)
        {
            int re = n%2;
            if(re == 0)
            {
                s = s + '0';
            }
            else
            {
                s = s+ '1';
            }
            n/=2;
        }
        int c=0;
        for(int i=0;i<s.size();i++)
        {
            if(s[i] == '1')
            {
                c++;
            }
        }
        return c;
    }
};