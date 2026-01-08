class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low = 0;
        int right = nums.size()-1;
        while(low <=right)
        {
            int mid = low + (right-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                low = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return low;
    }
};