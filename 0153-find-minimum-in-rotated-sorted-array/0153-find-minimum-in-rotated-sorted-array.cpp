class Solution {
public:
    int findMin(vector<int>& nums) {
        int mina = nums[0];
        int left = 0;
        int right = nums.size()-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(nums[left] <= nums[mid])
            {
                mina = min(mina,nums[left]);
                left = mid+1;
            }
            else
            {
                mina = min(mina,nums[mid]);
                right = mid-1;
            }
        }
        return mina;
    }
};