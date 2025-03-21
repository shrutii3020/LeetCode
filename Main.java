class Reverse {
    public int reverse(int x) {
        long reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0; 
        }
        
        return (int) reversed;
    }
}

public class Main {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(123));  // Output: 321
        System.out.println(reverse.reverse(-123)); // Output: -321
        System.out.println(reverse.reverse(120));  // Output: 21
        System.out.println(reverse.reverse(0));    // Output: 0
    }
}
