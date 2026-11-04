class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> mp = new HashMap<>();
        while(n>0){
            int last = n%10;
            mp.put(last,mp.getOrDefault(last,0)+1);
            n/=10;
        }
        List<Integer> list = new ArrayList<>(mp.keySet());
        Collections.sort(list,(a, b)->{
            if(mp.get(a).equals(mp.get(b))) {
                return Integer.compare(a, b);
            }
            return Integer.compare(mp.get(a), mp.get(b));
        });
        return list.get(0);
    }
}