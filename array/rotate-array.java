class Solution {

    public void reverse(int[] nums, int st, int end) {

        while (st < end) {

            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;

            st++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        // Step 1: Reverse whole array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }
}