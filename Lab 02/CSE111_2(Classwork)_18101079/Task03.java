import java.util.*;
public class Task03 {
    public static void main ( String[] args ) {
        
        Scanner sc = new Scanner (System.in) ;
        
        // Taking the numbers
        Integer [] arr = new Integer [10] ;
        System.out.println ( "Enter the numbers. " ) ;
        for (int count = 0 ; count < arr.length ; count++ ) {
            arr[count] = sc.nextInt() ;
        }
        
        sc.close();
        
        // Sorting in reverse order
        Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.printf( "Modified arr[] : %s", Arrays.toString(arr) );
    }
}