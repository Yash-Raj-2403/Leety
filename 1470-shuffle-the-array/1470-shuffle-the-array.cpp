class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        int n1 = 2*n;
        vector<int> ans(n1);
        int k=0;
        for(int i=0;i<n;i++)
        {
            ans[k++] = nums[i];
            ans[k++] = nums[i+n];
        }
        return ans;
    }
};