class Solution {
public:
    int minimumIndex(vector<int>& capacity, int itemSize) {
        int n = capacity.size();          vector<int> a(capacity.begin(),capacity.end());
        sort(a.begin(),a.end());
        int pos=-1;
        for(int i=0;i<n;i++)
        {
            if(itemSize<=a[i])
            {
                pos = a[i];
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(pos == capacity[i])
            {
                return i;
            }
        }
        return -1;
    }
};