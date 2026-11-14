class Solution {

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min = Integer.MAX_VALUE;
        int n = nums.size();

        for (int k = l; k <= r; k++) {

            int sum = 0;

            // First window
            for (int i = 0; i < k; i++) {
                sum += nums.get(i);
            }

            if (sum > 0) {
                min = Math.min(min, sum);
            }

            // Sliding window
            for (int i = k; i < n; i++) {

                sum += nums.get(i);
                sum -= nums.get(i - k);

                if (sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}