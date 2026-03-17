class Solution {
public:
    int firstUniqueEven(vector<int>& nums) {
        vector<int> fre(101,0);
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            fre[nums[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0 && fre[nums[i]] == 1)
            {
                return nums[i];
            }
        }
        return -1;
    }
};