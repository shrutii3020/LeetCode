class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }
        
        int maxSubArraySum = maxSubArraySum(arr);
        int minSubArraySum = minSubArraySum(arr);
        int circularMaxSum = totalSum - minSubArraySum;
        
       
        if (totalSum == minSubArraySum) return maxSubArraySum;
        
        return Math.max(maxSubArraySum, circularMaxSum);
    }

    private int maxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    
    private int minSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int minSum = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.min(currentSum + arr[i], arr[i]);
            minSum = Math.min(currentSum, minSum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5, -3, 5};
        System.out.println("Maximum Circular Subarray Sum: " + solution.maxSubarraySumCircular(arr));
    }
}
