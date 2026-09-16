class Solution {
    public int uniquePaths(int ma, int n) {
        int[][] m = new int[ma][n];
        for(int i=0;i<ma;i++)
        {
            m[i][0] = 1;
        }
        for(int i=0;i<n;i++)
        {
            m[0][i] =1;
        }
        for(int i=1;i<ma;i++)
        {
            for(int j=1;j<n;j++)
            {
                m[i][j] = m[i-1][j] + m[i][j-1];
            }
        }
        return m[ma-1][n-1];
    }
}