class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int n = nums.size();
        int st=-1,mx=-1;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j])
                {
                    st = nums[j]-nums[i];
                }
                mx = max(mx,st);
            }
        }
        return mx;
    }
};