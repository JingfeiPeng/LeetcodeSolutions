class Solution {
    private int getVal(char c){
        switch (c){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X' :
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        throw new IllegalArgumentException("unsupported character");
    }

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++){
            int val1 = getVal(s.charAt(i));
            if (i+1 == s.length()){
                res += val1;
            } else {
                int val2 = getVal(s.charAt(i+1));
                if (val2 > val1){
                    res+= val2-val1;
                    ++i;
                } else {
                    res += val1;
                }
            }
        }
        return res;
        
    }
}