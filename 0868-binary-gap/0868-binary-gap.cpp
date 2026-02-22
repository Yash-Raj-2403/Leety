class Solution {
public:
    int binaryGap(int n) {
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
                s = s+'1';
            }
            n=n/2;
        }
        int na = s.size();
        int maxa=0,prev=-1;
        for(int i=0;i<na;i++)
        {
            if(s[i] == '1')
            {
                if(prev != -1)
                {
                    maxa = max(maxa,abs(prev -i));
                }
                prev = i;
            }
        }
        return maxa;
    }
};