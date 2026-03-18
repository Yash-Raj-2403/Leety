class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> ans;
        for(int i=left;i<=right;i++)
        {
            int an = i;
            int k=i;
            bool found = true;
            while(an!=0)
            {
                int re = an%10;
                if(re==0 || k%re!=0)
                {
                    found = false;
                }
                an/=10;
            }
            if(found)
            ans.push_back(i);
        }
        return ans;
    }
};