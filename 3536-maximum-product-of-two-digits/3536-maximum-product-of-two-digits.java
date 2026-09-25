class Solution {
    public int maxProduct(int n) {
        List<Integer> lst = new ArrayList<>();
        while(n>0)
        {
            lst.add(n%10);
            n/=10;
        }
        int na = lst.size();
        Collections.sort(lst);
        return lst.get(na-1)*lst.get(na-2);
    }
}