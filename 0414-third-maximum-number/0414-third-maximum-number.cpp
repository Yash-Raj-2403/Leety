class Solution {
public:
    int thirdMax(vector<int>& nums) {
        set<int> ul(nums.begin(),nums.end());
        vector<int> a(ul.begin(),ul.end());
        int n = a.size();
        sort(a.begin(),a.end());
        if(n<3)
        {
            return a[n-1];
        }
        else
        {
            return a[n-3];
        }
    }
};