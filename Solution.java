import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i = 0;
        int j = n - 1;
        int idx = n - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                arr[idx] = nums[i] * nums[i];
                i++;
            } else {
                arr[idx] = nums[j] * nums[j];
                j--;
            }
            idx--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}