class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> lst = new ArrayList<>();
        for(int[] x:intervals){
            if(lst.isEmpty() || lst.get(lst.size()-1)[1]<x[0]){
                lst.add(x);
            }else{
                lst.get(lst.size()-1)[1] = Math.max(lst.get(lst.size()-1)[1],x[1]);
            }
        }
        return lst.toArray(new int[lst.size()][]);
    }
}