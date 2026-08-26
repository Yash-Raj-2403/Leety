class MedianFinder {

    PriorityQueue<Integer> minpq;
    PriorityQueue<Integer> maxpq;

    public MedianFinder() {
        minpq = new PriorityQueue<>();
        maxpq = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int nums) {
            if(maxpq.isEmpty() || nums <= maxpq.peek())
            {
                maxpq.add(nums);
            }
            else
            {
                minpq.add(nums);
            }
            if(Math.abs(maxpq.size()-minpq.size())>1)
            {
                if(maxpq.size()>minpq.size())
                {
                    minpq.add(maxpq.poll());
                }
                else
                {
                    maxpq.add(minpq.poll());
                }
            }
    }
    
    public double findMedian() {
        double ans=0;
        if(maxpq.size() == minpq.size())
            {
                ans = (maxpq.peek()+minpq.peek())/2.0;
            }
            else if(maxpq.size()>minpq.size())
            {
                ans = maxpq.peek();
            }
            else
            {
                ans= minpq.peek();
            }
            return ans;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */