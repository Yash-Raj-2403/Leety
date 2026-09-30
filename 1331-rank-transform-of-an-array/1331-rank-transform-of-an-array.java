class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] cpy = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            cpy[i] = arr[i];
        }
        Arrays.sort(cpy);
        Map<Integer,Integer> mp = new HashMap<>();
        int prev=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!mp.containsKey(cpy[i])){
                mp.put(cpy[i],mp.getOrDefault(cpy[i],0)+prev);
                prev++;
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ans[i] = mp.get(arr[i]);
        }
        return ans;
    }
}