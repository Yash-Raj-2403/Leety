class Solution {
public:
    vector<int> recoverOrder(vector<int>& order, vector<int>& friends) {
        set<int> f1(friends.begin(),friends.end());
        vector<int> ans;
        for(int x:order)
        {
            if(f1.count(x))
            {
                ans.push_back(x);
            }
        }
        return ans;
    }
};