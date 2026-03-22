class Solution {
public:
    int findComplement(int num) {
        string s = "";
        while(num!=0)
        {
            int re = num%2;
            if(re == 0)
            {
                s = "0"+s;
            }
            else
            {
                s = "1"+s;
            }
            num=num/2;
        }
        string compli = "";
        int n = s.size();
        for(int i=0;i<n;i++)
        {
            if(s[i] == '0')
            {
                compli+='1';
            }
            else
            {
                compli+= '0';
            }
        }
        int fin = stoll(compli,nullptr,2);
        return fin;
    }
};