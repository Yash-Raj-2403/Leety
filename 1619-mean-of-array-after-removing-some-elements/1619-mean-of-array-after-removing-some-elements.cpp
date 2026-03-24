class Solution {
public:
    double trimMean(vector<int>& arr) {
        int n = arr.size();
        sort(arr.begin(),arr.end());
        int rem = n*.05;
        double sum=0;
        for(int i=rem;i<n-rem;i++)
        {
            sum = sum+arr[i];
        }
        return sum/(n-2*rem);
    }
};