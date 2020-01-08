class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        // [1,2,4,8,16,32,64,128] , 2,64,16
        for (int i = 0; i < nums.length; i++){
            int lo = i+1, hi = nums.length-1;
            while (lo < hi){
                int check = nums[lo]+nums[hi]+nums[i] - target;
                if (Math.abs(check) < smallest){
                    smallest = Math.abs(check);
                    sum = nums[lo]+nums[hi]+nums[i];
                } else if (check > 0){
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        return sum;
    }
}