class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int c=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum += arr[i];
        }
        int avg = sum/k;
        if(avg>=threshold)
        {
            c++;
        }
        for(int i=1;i<=n-k;i++)
        {
            sum += arr[i+k-1]-arr[i-1];
            avg = sum/k;
            if(avg>=threshold)
            {
                c++;
            }
        }
        return c;
    }
}