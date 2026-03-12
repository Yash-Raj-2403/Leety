class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans;
        vector<int> a;
        for(int i=0;i<n;i++)
        {
            while(nums[i]!=0)
            {
                int rev = nums[i]%10;
                a.push_back(rev);
                nums[i]/=10;
            }
            reverse(a.begin(),a.end());
            for(int i=0;i<a.size();i++)
            {
                ans.push_back(a[i]);
            }
            a.clear();
        }
        return ans;
    }
};