class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n = ranges.length;
        int m = ranges[0].length;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=ranges[i][0]; j<=ranges[i][1]; j++)
            {
                s.add(j);
            }
        }
        for(int i=left;i<=right;i++)
        {
            if(!s.contains(i)){
                return false;
            }
        }
        return true;
    }
}