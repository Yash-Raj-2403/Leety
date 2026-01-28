class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        int n = nums.size();
        bool isasc = false;
        bool isdec = false;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] < nums[i+1])
            {
                isasc = true;
            }
            if(nums[i]>nums[i+1])
            {
                isdec = true;
            }
        }
        if(isasc && isdec)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
};