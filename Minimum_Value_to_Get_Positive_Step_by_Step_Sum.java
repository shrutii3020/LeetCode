import java.util.HashMap;

class Minimum_Value_to_Get_Positive_Step_by_Step_Sum {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int presum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        
        for (int i = 0; i < n; i++) {
            presum += nums[i];
            int mod = ((presum % k) + k) % k;
            cnt += mpp.getOrDefault(mod, 0);
            mpp.put(mod, mpp.getOrDefault(mod, 0) + 1);
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        Minimum_Value_to_Get_Positive_Step_by_Step_Sum sol = new Minimum_Value_to_Get_Positive_Step_by_Step_Sum();
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(sol.subarraysDivByK(nums, k)); // Output: 7
    }
}
