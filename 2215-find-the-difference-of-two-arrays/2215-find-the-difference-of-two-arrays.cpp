class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        vector<vector<int>> ans(2);
        set<int> s1(nums1.begin(),nums1.end());
        set<int> s2(nums2.begin(),nums2.end());
        int n1 = s1.size();
        int n2 = s2.size();
        for(int x:s1)
        {
            if(!s2.count(x))
            {
                ans[0].push_back(x);
            }
        }
        for(int x:s2)
        {
            if(!s1.count(x))
            {
                ans[1].push_back(x);
            }
        }
        return ans;
    }
};