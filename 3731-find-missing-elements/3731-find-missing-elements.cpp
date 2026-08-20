class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        vector<int> v1;
        int mi = *min_element(nums.begin(),nums.end());
        int ma = *max_element(nums.begin(),nums.end());
        sort(nums.begin(),nums.end());
        for(int i=mi;i<=ma;i++)
        {
            if(!binary_search(nums.begin(),nums.end(),i))
            {
                v1.push_back(i);
            }
        }
        return v1;
    }
};