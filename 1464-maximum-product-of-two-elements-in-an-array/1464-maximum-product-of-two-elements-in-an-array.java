class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums)
        {
            pq.add(x);
        }
        int m1 = pq.poll()-1;
        int m2 =pq.poll()-1;
        return m1*m2;
    }
}