class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        StringBuilder ret =  new StringBuilder();
        int n =  s.length();
        int cycleLen = numRows*2-2;
        
        for (int i = 0; i < numRows;i++){
            for (int j = 0; i+j < n; j += cycleLen){
                ret.append(s.charAt(i+j));
                if (i>0 && i<numRows-1 && j + cycleLen - i < n ){
                    ret.append(s.charAt(j+cycleLen-i));
                }
            }
        }
        return ret.toString();
    }
}