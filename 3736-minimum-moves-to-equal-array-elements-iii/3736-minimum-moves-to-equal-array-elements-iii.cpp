class Solution {
public:
    int minMoves(vector<int>& nums) {
        int n = nums.size();
        int maxa = *(max_element(nums.begin(),nums.end()));
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum = sum + (maxa-nums[i]);
        }
        return sum;
    }
};