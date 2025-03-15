import java.util.*;

class solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            Hashtable<Character, Boolean> hm = new Hashtable<>();
            for (int j = i; j < s.length(); j++) {
                char curr = s.charAt(j);
                if (hm.containsKey(curr)) {
                    break;
                }
                hm.put(curr, true);
                int length = j - i + 1;
                maxlen = Math.max(maxlen, length);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        solution sol = new solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Length of longest substring without repeating characters: " + sol.lengthOfLongestSubstring(s));
        sc.close();
    }
}
