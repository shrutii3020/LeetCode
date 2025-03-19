import java.util.*;

public class Array{
    public static void main(String[] args) {
        int[][] arr = {{342},{212},{213}};
        
        System.out.println("Print 2d array:");
        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }

        }
    }
}