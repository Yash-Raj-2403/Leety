class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums)
        {
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int nn = n/3;
        List<Integer> lst = new ArrayList<>();
        for(int x:mp.keySet())
        {
            if(mp.get(x)>nn)
            {
                lst.add(x);
            }
        }
        return lst;
    }
}