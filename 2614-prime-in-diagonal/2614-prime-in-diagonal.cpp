class Solution {
public:
    int diagonalPrime(vector<vector<int>>& nums) {
        int m = nums.size();
        int n = nums[0].size();
        vector<int> a;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                {
                    a.push_back(nums[i][j]);
                }
            }
        }
        int st=0;
        sort(a.begin(),a.end(),greater<int>());
        int f = a.size();
        for(int i=0;i<f;i++)
        {
            int key = a[i];
            if(key <= 1)
            {
                continue;
            }
            bool prime = true;
            for(int i=2;i*i<=key;i++)
            {
                if(key%i==0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
                st=key;
                break;
            }
        }
        return st;
    }
};