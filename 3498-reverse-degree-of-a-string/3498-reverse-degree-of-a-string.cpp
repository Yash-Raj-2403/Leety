class Solution {
public:
    int reverseDegree(string s) {
        int sum =0;
        for(int i=0;i<s.size();i++)
        {
            int reva = 'z' - s[i] +1;
            int prod = (i+1)*reva;
            sum = sum + prod;
        }
        return sum;
    }
};