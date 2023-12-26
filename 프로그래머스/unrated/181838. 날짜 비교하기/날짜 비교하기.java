class Solution {
    public int solution(int[] date1, int[] date2) {
        String dt1 = ""+date1[0]+date1[1]+date1[2];
        String dt2 = ""+date2[0]+date2[1]+date2[2]; 
        return Integer.parseInt(dt2)>Integer.parseInt(dt1) ? 1: 0;
    }
}