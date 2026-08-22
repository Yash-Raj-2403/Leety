class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans = strs[0];
        for(int i=1;i<strs.size();i++)
        {
            string nans ="";
            for(int j=0;j<strs[i].size();j++)
            {
                if(ans[j] == strs[i][j])
                {
                    nans += ans[j];
                }
                else
                {
                    break;
                }
            }
            ans = nans;
        }
        return ans;
    }
};