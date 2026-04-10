class Solution {
public:
    vector<int> twoOutOfThree(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3) {
        set<int> s1(nums1.begin(),nums1.end());
        set<int> s2(nums2.begin(),nums2.end());
        set<int> s3(nums3.begin(),nums3.end());
        set<int> ans;
        for(int x:s1)
        {
            if(s2.count(x) || s3.count(x))
            {
                ans.insert(x);
            }
        }
        for(int x:s2)
        {
            if(s1.count(x) || s3.count(x))
            {
                ans.insert(x);
            }
        }
        for(int x:s3)
        {
            if(s1.count(x) || s2.count(x))
            {
                ans.insert(x);
            }
        }
        vector<int> fin(ans.begin(),ans.end());
        return fin;
    }
};