class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String intStr = new Integer(x).toString();
        int length = intStr.length();
        for (int i = 0; i < length/2; i++){
            if (intStr.charAt(i) != intStr.charAt(length - i -1)){
                return false;
            }
        }
        return true;
    }
}