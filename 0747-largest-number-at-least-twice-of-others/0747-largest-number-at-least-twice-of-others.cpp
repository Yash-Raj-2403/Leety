class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        vector<int> a(nums.begin(),nums.end());
        sort(a.begin(),a.end());
        int maxa = a[a.size()-1];
        for(int i=0;i<a.size()-1;i++)
        {
            if(a[i] > maxa/2)
            {
                return -1;
            }
        }
        int st=0;
        for(int i=0;i<nums.size();i++)
        {
            if(maxa == nums[i])
            {
                st =i;
            }
        }
        return st;
    }
};