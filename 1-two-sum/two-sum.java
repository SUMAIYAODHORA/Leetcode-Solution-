class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If the two numbers add up to the target, return their indices
                if (nums[i] + nums[j] == target) {
                     int[] ans = { i, j };
                    return ans;
                }
            }
    }
        return null;
    }
}
