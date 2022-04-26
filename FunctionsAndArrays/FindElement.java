
import java.io.*;
import java.util.*;

public class FindElement{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];
    for ( int i = 0 ; i< arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    int data = sc.nextInt();
    int foundAt = -1;

    for ( int i = 0 ; i< arr.length ; i++){
        if ( arr[i] == data){
            foundAt = i;
            break;
        }
    }
    System.out.println(foundAt);
 }

}