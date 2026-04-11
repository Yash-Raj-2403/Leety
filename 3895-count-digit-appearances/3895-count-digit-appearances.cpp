class Solution {
public:
    int countDigitOccurrences(vector<int>& nums, int digit) {
        int n = nums.size();
        int c=0;
        for(int i=0;i<n;i++)
        {
            while(nums[i]!=0)
            {
                int re = nums[i]%10;
                if(digit == re)
                {
                    c++;
                }
                nums[i]/=10;
            }
        }
        return c;
    }
};