class Solution {
    // aba, abba
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length() - 1; i++){
            int len1 = lengthOfPalidorme(s, i, i);
            int len2 = lengthOfPalidorme(s, i, i+1);
            int len = Math.max(len1, len2);
            // larger than the historical largest
            if (len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }        
        return s.substring(start, end +1);
    }
    
    int lengthOfPalidorme(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) ==  s.charAt(right)){
            --left;
            ++right;
        }
        return right - left -1;
    }
}