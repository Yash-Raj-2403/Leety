class Solution {
    public int earliestTime(int[][] tasks) {
        int n = tasks.length;
        //int m = tasks[0].length;
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum =0;
            sum += tasks[i][0]+tasks[i][1];
            ans = Math.min(ans,sum);
        }   
        return ans;
    }
}