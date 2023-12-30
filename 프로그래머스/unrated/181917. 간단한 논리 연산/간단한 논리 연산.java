class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean rs1 = x1 == true || x2  == true ? true : false;
        boolean rs2 = x3 == true || x4  == true ? true : false;
        return rs1 == false || rs2  == false ? false : true;
    }
}