class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minp = prices[0];
        int mx=0;
        int n = prices.size();
        for(int i=1;i<n;i++)
        {
            if(minp>prices[i])
            {
                minp = prices[i];
            }
            mx = max(mx,prices[i]-minp);
        }
        return mx;
    }
};