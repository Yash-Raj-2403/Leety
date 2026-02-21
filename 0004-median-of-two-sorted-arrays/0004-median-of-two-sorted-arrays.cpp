class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        vector<int> fin(n+m);
        for(int i=0;i<n;i++)
        {
            fin[i] = nums1[i];
        }
        int k=n;
        for(int i=0;i<m;i++)
        {
            fin[k] = nums2[i];
            k++;
        }
        sort(fin.begin(),fin.end());
        int f = fin.size();
        double store =0;
        if(f%2==1)
        {
            store = fin[f/2];
        }
        else
        {
            store = (fin[(f/2)-1] + fin[(f/2)])/2.0;
        }
        return store;
    }
};