class Solution {
    public int minOperations(int[] nums, int x) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int target = total - x;

        // Need to remove all elements
        if (target == 0) {
            return nums.length;
        }

        // Impossible
        if (target < 0) {
            return -1;
        }

        int left = 0;
        int sum1 = 0;
        int maxLen = -1;

        for (int right = 0; right < nums.length; right++) {

            sum1 += nums[right];

            while (sum1 > target) {
                sum1 -= nums[left];
                left++;
            }

            if (sum1 == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        if (maxLen == -1) {
            return -1;
        }

        return nums.length - maxLen;
    }
}