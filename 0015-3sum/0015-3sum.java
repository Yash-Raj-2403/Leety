class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++)
        {
            int j = i+1;
            int k = n-1;
            while(j<k){
            List<Integer> l = new ArrayList<>();
            int isum = nums[i]+nums[j]+nums[k];
                if(isum == 0){
                    l.add(nums[i]);l.add(nums[j]);l.add(nums[k]);
                    Collections.sort(l);
                    ans.add(l);
                    j++;k--;
                }else if(isum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        Set<List<Integer>> s = new HashSet<>(ans);
        return new ArrayList<>(s);
    }
}