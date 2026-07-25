class Solution {
public:
    vector<int> concatWithReverse(vector<int>& nums) {
        int m = nums.size()*2;
        vector<int> a(m,0);   
        int k=0;
        for(int i=0;i<nums.size();i++)
        {
            a[k++]=nums[i];
        }
        for(int i=nums.size()-1;i>=0;i--)
        {
            a[k++] = nums[i];
        }
        return a;
    }
};