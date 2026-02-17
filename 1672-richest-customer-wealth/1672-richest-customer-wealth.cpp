class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int m = accounts.size();
        int prevsum=0;
        int ans=0;
        for(int i=0;i<m;i++)
        {
            int n = accounts[i].size();
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum = sum + accounts[i][j];
            }
            ans = max(sum ,prevsum);
            prevsum = ans;
        }
        return ans;
    }
};