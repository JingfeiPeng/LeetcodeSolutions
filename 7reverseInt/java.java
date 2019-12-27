class Solution {
    public int reverse(int x) {
        int ans  = 0;
        while (x != 0){
            int pop = x % 10;
            x /= 10;
            // check if bigger than IntMax
            if ((ans > Integer.MAX_VALUE / 10) || (ans == Integer.MAX_VALUE / 10 && pop > 7) ){ 
                return 0;
            }
            // check if smaller than int min
            if ((ans < Integer.MIN_VALUE / 10) || (ans == Integer.MIN_VALUE / 10 && pop < - 8)){
                return 0;
            }
            ans = ans* 10 + pop;
        }
        return ans;
    }
}