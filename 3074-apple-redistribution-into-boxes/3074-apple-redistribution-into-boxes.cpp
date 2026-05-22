class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        sort(capacity.begin(),capacity.end(),greater<int>());
        int n = apple.size();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += apple[i];
        }
        int tsum=0;
        int k=0;
        while(sum>tsum)
        {
            tsum += capacity[k++];
        }
        return k;
    }
};