class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> pos;
        vector<int> neg;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                neg.push_back(nums[i]);
            }
            else
            {
                pos.push_back(nums[i]);
            }
        }
        vector<int> ans(n);
        int k=0;
        int j=0;
        for(int i=0;i<n;i=i+2)
        {
            ans[i] = pos[k++];
            ans[i+1] = neg[j++];
        }
        return ans;
    }
};