class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int n = nums.size();
        set<int> as;
        vector<int> ans;
        for(int i=0;i<n;i++)
        {
            if(as.contains(nums[i]))
            {
                ans.push_back(nums[i]);
            }
            else
            {
                as.insert(nums[i]);
            }
        }
        return ans;
    }
};