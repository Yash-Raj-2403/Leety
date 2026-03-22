class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        int n1 = arr1.size();
        int n2 = arr2.size();
        vector<int> freq(1001,0);
        for(int i=0;i<n1;i++)
        {
            freq[arr1[i]]++;
        }
        vector<int> ans(n1);
        int k=0;
        for(int i=0;i<n2;i++)
        {
            int key = arr2[i];
            while(freq[key]>0)
            {
                ans[k++] = arr2[i];
                freq[key]--;
            }
        }
        for(int i=0;i<1001;i++)
        {
            while(freq[i]>0)
            {
                ans[k++]=i;
                freq[i]--;
            }
        }
        return ans;
    }
};