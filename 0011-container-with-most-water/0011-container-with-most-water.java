class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0,j=n-1,ans=0;
        while(i<j){
            int he = Math.min(height[i],height[j]);
            int wi = j-i;
            int area = he*wi;
            ans = Math.max(area,ans);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}