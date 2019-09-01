import java.util.*;

public class Task07 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int [] arr = new int [11] ; // declaring main array
        
        System.out.println ( "Enter 11 numbers. One number can be inserted for maximum 4 times. Or the loop won't stop." ) ;
        
        for ( int count = 0 ; count < arr.length ; count++ ) {
            
            int a = sc.nextInt() ; // taking input
            int counter = 0 ;
            
            for ( int count2 = 0 ; count2 < arr.length ; count2++ ) { // checking occurrance
                if ( a == arr[count2] ) {
                    counter++ ;
                }
            }
            
            if ( counter < 4 ) { // Conveying condition
                
                /* It's less than 4 as when checking, if compiler find it 4 times so it will enter this if statement and enter
                 * another value which is already entered 4 times. Cause i have taken the input in an int variable. */
                
                arr[count] = a ;
            } else {
                count-- ;
                System.out.println ( "It's not valid. Enter another number." ) ; // asking for another one
            }
            
        }
        
        sc.close() ;
    }
}