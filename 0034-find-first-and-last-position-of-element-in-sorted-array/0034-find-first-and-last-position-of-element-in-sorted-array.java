class Solution {
    public int[] searchRange(int[] a, int target) {
        int n = a.length;
        int l =0,r = n-1;
        int pos =-1,posa=-1;
        int[] ans = new int[2];
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(a[mid] == target){
                pos = mid;
                r = mid-1;
            }
            else if(a[mid]>target)
            {
                r = mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        ans[0] = pos;
        l =0;r = n-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(a[mid] == target){
                posa = mid;
                l= mid+1;
            }
            else if(a[mid]<target)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        ans[1] = posa;
        return ans;
    }
}