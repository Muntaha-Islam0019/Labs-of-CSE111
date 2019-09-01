import java.util.*;

public class Task04 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int [] arr = new int [20];
        
        // Grabbing
        for ( int count = 0 ; count < arr.length ; count++ ) {
            arr [count] = sc.nextInt() ;
        }
        
        // Printing
        for ( int count = arr.length - 1 ; count >= 0 ; count-- ) {
            
            // Checking
            if (arr [count] % 2 == 0) {
                System.out.print( arr [count] + " " ) ;
            }
            
        }
        
    }
}