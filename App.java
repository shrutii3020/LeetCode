import java.util.*;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            arr[count + 1] = nums[i + n];
            count += 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[2 * n];
        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        int[] result = solution.shuffle(nums, n);
        
        System.out.println("Shuffled array: " + Arrays.toString(result));
        
        scanner.close();
    }
}
