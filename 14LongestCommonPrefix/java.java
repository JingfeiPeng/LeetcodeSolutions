class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length == 0) return res.toString();
        for (int i = 0; i < strs[0].length(); i++){   
            if (strs[0].length() == 0) return res.toString();
            char prev = strs[0].charAt(i);
            for (int strsLoop = 0; strsLoop < strs.length; strsLoop++){
                if (i >= strs[strsLoop].length()) return res.toString();
                if (prev != strs[strsLoop].charAt(i)){
                    return res.toString();
                } 
            }
            res.append(prev);
        }
        return res.toString();
    }
}