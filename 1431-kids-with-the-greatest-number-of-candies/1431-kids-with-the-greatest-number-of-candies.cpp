class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> ans(candies.size());
        int n = candies.size();
        int maxa = *max_element(candies.begin(),candies.end());
        for(int i=0;i<n;i++)
        {
            candies[i] += extraCandies;
        }
        for(int i=0;i<n;i++)
        {
            if(candies[i] >= maxa)
            {
                ans[i] = true;
            }
            else
            {
                ans[i] = false;
            }
        }
        return ans;
    }
};