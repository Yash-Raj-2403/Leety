class Solution {
public:
    vector<int> findDegrees(vector<vector<int>>& matrix) {
        int m = matrix.size();
        vector<int> ans;
        for(int i=0;i<m;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j] == 1)
                {
                    c++;
                }
            }
            ans.push_back(c);
        }
        return ans;
    }
};