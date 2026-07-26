class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        vector<int> freq(2001,0);
        for(int i=0;i<arr.size();i++)
        {
            freq[arr[i]]++;
        }
        int n=0,store,st;
        for(int i=1;i<2001;i++)
        {
            if(freq[i] == 0)
            {
                n++;
                st =i;
            }
            if(n == k)
            {
                store = st;
                break;
            }
        }
        return store;
    } 
};