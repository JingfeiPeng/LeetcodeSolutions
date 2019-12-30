class Solution {
    // O(n^2)
    public int maxAreaSlow(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length;i++){
            for (int j = i + 1; j < height.length; j++){
                int h = Math.min(height[i], height[j]);
                max = Math.max(h*(j - i), max);
            }
        }
        return max;
    }

    // O(n)
    public int maxAreaFast(int[] height){
        int maxArea = 0, l = 0, r = height.length -1;
        while (l < r){
            maxArea = Math.max(maxArea, Math.min(height[l], height[r])*(r-l) );
            if (height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}