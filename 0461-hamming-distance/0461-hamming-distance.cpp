class Solution {
public:
    int hammingDistance(int x, int y) {
        string sx = bitset<32>(x).to_string();
        string sy = bitset<32>(y).to_string();
        int c=0;
        for(int i=0;i<32;i++)
        {
            if(sx[i] != sy[i])
            {
                c++;
            }
        }
        return c;
    }
};