class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int n = nums.size();
        int maxa = *(max_element(nums.begin(),nums.end()));
        vector<int> freq(n+1,0);
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=0;i<n+1;i++)
        {
            if(freq[i] >= 2)
            {
                return i;
            }
        }
        return -1;
    }
};