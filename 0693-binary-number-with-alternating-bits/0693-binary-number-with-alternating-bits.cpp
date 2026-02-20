class Solution {
public:
    bool hasAlternatingBits(int n) {
        string s = "";
        while(n!=0)
        {
            int re = n%2;
            if(re == 0)
            {
                s = s + "0";
            }
            else
            {
                s = s+"1";
            }
            n/=2;
        }
        int f = s.size();
        for(int i=0;i<f-1;i++)
        {
            if(s[i]==s[i+1])
            {
                return false;
            }
        }
        return true;
    }
};