class Solution {
public:
    int calPoints(vector<string>& operations) {
        int n = operations.size();
        int p=0;
        vector<int> ans(n);
        for(int i=0;i<n;i++)
        {
            if(operations[i] == "+")
            {
                ans[p] = ans[p-1]+ans[p-2];
                p++;
            }
            else if(operations[i] == "C")
            {
                p--;
            }
            else if(operations[i] == "D")
            {
                ans[p] = 2*ans[p-1];
                p++;
            }
            else
            {
                ans[p] = stoi(operations[i]);
                p++;
            }
        }
        int sum=0;
        for(int i=0;i<p;i++)
        {
            sum += ans[i];
        }
        return sum;
    }
};