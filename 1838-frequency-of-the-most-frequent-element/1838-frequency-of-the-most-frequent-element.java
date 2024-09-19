class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0, right = 0, ans = 0;
        Arrays.sort(nums);
        long sum = 0;

        while (right < nums.length) {
            sum += nums[right];
            while ((right - left + 1) * (long)nums[right] > sum + k) {
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
    }
}