class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    List<Integer> lst = new ArrayList<>();
                    long isum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(isum == target){
                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[k]);
                        lst.add(nums[l]);
                        Collections.sort(lst);
                        ans.add(lst);
                        k++;
                        l--;
                    }
                    else if(isum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        Set<List<Integer>> s = new HashSet<>(ans);
        return new ArrayList<List<Integer>>(s);
    }
}