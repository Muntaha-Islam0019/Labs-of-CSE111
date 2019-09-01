import java.util.*;

public class Task09 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int [] arr = new int [10];
        
        // Grabbing
        for ( int count = 0 ; count < arr.length ; count++ ) {
            arr [count] = sc.nextInt() ;
        }
        
        // Printing even indexes
        for ( int count = 0 ; count < arr.length ; count++ ) {
            if (count % 2 == 0) {
            System.out.print( arr [count] + " " ) ;
            }
        }
        
        // Printing odd indexes
        for ( int count = 0 ; count < arr.length ; count++ ) {
            if (count % 2 != 0) {
            System.out.print( arr [count] + " " ) ;
            }
        }
    }
}