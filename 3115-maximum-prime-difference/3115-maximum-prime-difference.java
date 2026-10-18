class Solution {
    public int maximumPrimeDifference(int[] nums) {
        boolean[] p = new boolean[101];
        Arrays.fill(p,true);
        p[0]=p[1] = false;
        for(int i=2;i<101;i++)
        {
            if(p[i]== true)
            {
                for(int j=i*i;j<101;j=j+i)
                {
                    p[j] = false;
                }
            }
        }
        boolean[] fin = new boolean[101];
        for(int x:nums){
                fin[x] = true;
        }
        int last =-1,first =-1;
        for(int i=nums.length-1;i>=0;i--){
            if(p[nums[i]] == true){
                last = i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(p[nums[i]] == true){
                first = i;
                break;
            }
        }
        return last-first;
    }
}