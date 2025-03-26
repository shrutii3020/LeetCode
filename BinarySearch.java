import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right)/ 2;

            if (nums[mid] == target) {
                return mid; 
            }
            if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int target = 40;

        Arrays.sort(nums); 
        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Index: " + result);
        } 
        else {
            System.out.println("Not found.");
        }
    }
}
