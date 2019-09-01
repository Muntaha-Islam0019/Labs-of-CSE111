import java.util.*;

public class Task06 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int [] a = new int [15] ;
        
        // Grabbing
        for ( int count = 0 ; count < a.length ; count++ ) {
            a [count] = sc.nextInt () ;
        }
        
        for ( int count = 0 ; count < 10 ; count ++ ) { // Loop for 0-9
            
            int time = 0 ; // counter
            
            for ( int count00 = 0 ; count00 < a.length ; count00++ ) { // Loop for matching with array
                if ( a [count00] == count ) {
                    time ++ ;
                }
            }
            
            // Printing
            System.out.println ( count + " has been pressed " + time + " times." ) ;
            
        }
    }
}