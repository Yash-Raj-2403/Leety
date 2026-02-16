class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> b=nums;
        nums.insert(nums.end(),b.begin(),b.end());
        return nums;
    }
};