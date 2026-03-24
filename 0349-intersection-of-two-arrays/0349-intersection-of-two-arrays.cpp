class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> freq1(1001,0);
        vector<int> freq2(1001,0);
        vector<int> ans;
        for(int i=0;i<nums1.size();i++)
        {
            freq1[nums1[i]]++;
        }
        for(int i=0;i<nums2.size();i++)
        {
            freq2[nums2[i]]++;
        }
        for(int i=0;i<1001;i++)
        {
            if(freq1[i]>0 && freq2[i]>0)
            {
                ans.push_back(i);
            }
        }
        return ans;
    }
};