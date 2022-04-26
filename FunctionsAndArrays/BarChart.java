
import java.io.*;
import java.util.*;

public class BarChart{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];

    for ( int i = 0 ; i < n ; i++){
       arr[i] = sc.nextInt();
    }
    int max = arr[0];
    for ( int i = 0 ; i< arr.length ; i++){
        if ( arr[i] > max){
            max = arr[i];
        }
    }

    for ( int ht = max ; ht >= 1 ; ht--){
        for ( int i = 0 ; i< arr.length ; i++){
            if ( arr[i] >= ht){
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}
