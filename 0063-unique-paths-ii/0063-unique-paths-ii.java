class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int m = o.length;
        int n = o[0].length;
        int[][] mat = new int[m][n];
        boolean fou = false;
        for(int i=0;i<m;i++)
        {
            if((o[i][0] == 0) && (fou == false))
            {
                mat[i][0] =1;
            }
            else
            {
                fou = true;
                mat[i][0] =0;
            }
        }
        fou = false;
        for(int i=0;i<n;i++)
        {
            if((o[0][i] == 0) && (fou == false))
            {
                mat[0][i] =1;
            }
            else
            {
                fou = true;
                mat[0][i] =0;
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(o[i][j] !=1)
                {
                    mat[i][j] = mat[i-1][j] + mat[i][j-1];
                }
                else
                {
                    mat[i][j] =0;
                }
            }
        }
        return mat[m-1][n-1];
    }
}