class Solution {
    public int maximumGap(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int x:nums)
        {
            pq.add(x);
        }
        int ans = Integer.MIN_VALUE;
        if(n<2) return 0;
        while(pq.size()>1)
        {
            int x = pq.poll();
            int y = pq.peek();
            ans = Math.max(ans,y-x);
        }
        return ans;
    }
}