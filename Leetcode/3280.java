class Solution {
    public String convertDateToBinary(String date) {
        String[] ymd = date.split("-");
        ymd[0] = Integer.toBinaryString(Integer.parseInt(ymd[0]));
        ymd[1] = Integer.toBinaryString(Integer.parseInt(ymd[1]));
        ymd[2] = Integer.toBinaryString(Integer.parseInt(ymd[2]));
        return String.join("-", ymd);
    }
}