// Using temp variables//
// import java.util.*;
// public class SwapNumbers {

//     public static void main(String[] args) {

//         int a = 5;
//         int b = 4;

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }



// //Without using temp variables
// import java.util.*;
// public class SwapNumber {

//     public static void main(String[] args) {

//         int a = 5;
//         int b = 4;

//         a =a + b;
//         b = a - b;
//         a = a - b;
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
//}


//using divide 
import java.util.*;
public class SwapNumber {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
      
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
//using XOR
