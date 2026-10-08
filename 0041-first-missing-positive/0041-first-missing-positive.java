class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] fr = new int[nums.length+1];
        for(int x:nums)
        {
            if(x>0 && x<=nums.length){
                fr[x]=1;
            }
        }
        for(int i=1;i<nums.length+1;i++)
        {
            if(fr[i]==0){
                return i;
            }
        }
        return nums.length+1;
    }
}