class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int n = nums.size();
        int sum=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=9)
            {
                sum = sum + nums[i];
            }
            else
            {
                sum2 += nums[i];
            }
        }
        if(sum == sum2)
        {
            return false;
        }
        return true;
    }
};