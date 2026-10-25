class Solution {
    public int triangleNumber(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int c=0;
        for(int i=n-1;i>=2;i--){
            int j = i-1;
            int k = 0;
            while(k<j){
                if(A[j]+A[k]>A[i]){
                    c +=j-k;
                    j--;
                }else{
                    k++;
                }
            }
        }
        return c;
    }
}