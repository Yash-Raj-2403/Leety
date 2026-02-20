class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int n = heights.size();
        vector<int> h2 = heights;
        sort(h2.begin(),h2.end());
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(heights[i] != h2[i])
            {
                c++;
            }
        }
        return c;
    }
};