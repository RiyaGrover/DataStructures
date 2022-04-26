import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for ( int i = 0 ; i< n ; i++){
        arr[i]=sc.nextInt();
    }
    int data = sc.nextInt();
    int left = 0;
    int right = arr.length -1;
    int fi = -1;
    while ( left <= right ){
        int mid = (left + right)/2;
        if(data > arr[mid]){
            left = mid + 1;
        } else if ( data < arr[mid]){
            right = mid - 1;
        } else {
            fi = mid;
            right = mid-1;
        }
    }
    System.out.println(fi);

    left = 0;
    right = arr.length-1;
    int li = -1;

    while ( left <= right ){
    int mid = (left + right)/2;
    if ( data > arr[mid]){
        left = mid + 1;

    }else if ( data < arr[mid]){
        right = mid - 1;
    } else {
        li = mid;
        left = mid + 1;
    }
 } 

 System.out.println(li);
  

}
}
