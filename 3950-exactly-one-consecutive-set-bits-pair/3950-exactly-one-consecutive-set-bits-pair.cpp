class Solution {
public:
    bool consecutiveSetBits(int n) {
         string str = bitset<32>(n).to_string();
        int f = str.size();
        int c=0;
        for(int i=1;i<f;i++)
        {
            if(str[i-1]=='1' && str[i] == '1')
            {
                c++;
            }
        }
        return c==1;
    }
};