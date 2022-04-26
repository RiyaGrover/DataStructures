import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for ( int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int foundAt = -1;
        while( left <= right){
            int  mid = (left + right)/2;
            if ( data > arr[mid]){
                left = mid + 1;
            } else if (data < arr[mid]){
                right = mid-1;
            }else{
                foundAt = mid;
                break;
            }
        }
        System.out.println(foundAt);
    }
    
}
