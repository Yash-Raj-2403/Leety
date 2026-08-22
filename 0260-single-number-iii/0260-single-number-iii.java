class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int x:mp.keySet())
        {
            if(mp.get(x) == 1)
            {
                lst.add(x);
            }
        }
        int[] arr = new int[lst.size()];
        for(int i =0;i<lst.size();i++)
        {
            arr[i] = lst.get(i);
        }

        return arr;
    }
}