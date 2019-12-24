class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =  s.length();
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, ans = 0;
        while (left < n && right < n){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                ++right;
                ans = Math.max(ans, right - left);
            } else {
                // remove the left top character
                set.remove(s.charAt(left));
                ++left;
            }
        }
        
        return ans;
    }
}


// O(n)
class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int n =  s.length();
        int left = 0, right = 0, ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (left < n && right < n){
            if (map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)), left);
            }
            ans = Math.max(ans, right - left+1);
            // if repeat, left can go to the next character.
            map.put(s.charAt(right),right+1);
            ++right;
            
        }
        return ans;
    }
}
