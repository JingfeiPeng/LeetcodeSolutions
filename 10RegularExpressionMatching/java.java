class Solution {
    // a , a*a
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        // check first match
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) ||
                                                  pattern.charAt(0) == '.'));
        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            // can just throw out the 2 pattern char since * can have 0 occurance
            return isMatch(text, pattern.substring(2)) || 
                (first_match && isMatch(text.substring(1), pattern));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}