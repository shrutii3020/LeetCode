import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int num1, num2, i, j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values:");
        
        num1 = sc.nextInt(); 
        num2 = sc.nextInt();
        
        System.out.println("Prime no:" + num1 + " and " + num2 + "is:");

        for (i = num1; i <= num2; i++) {
            if (i < 2) continue; 
            
            boolean isPrime = true;

            for (j = 2; j * j <= i; j++) { 
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}