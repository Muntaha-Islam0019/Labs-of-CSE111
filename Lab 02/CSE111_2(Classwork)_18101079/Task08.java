import java.util.*;

public class Task08 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        int [] arr = new int [10] ; // declaring main array
        
        System.out.println ( "Enter 10 numbers. One number can be inserted for maximum 4 times. Or the loop won't stop." ) ;
        
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
        
        System.out.println ( "Printing only those numbers which are entered at least twice and less than 5 times." ) ;
                                
        for ( int count = 0 ; count < arr.length ; count++ ) {
            
            int x = arr[count] ;
            int counter = 0 ;
            
            for ( int count2 = 0 ; count2 < arr.length ; count2++ ) { // checking occurrance
                if ( x == arr[count2] ) {
                    arr[count2] = 0 ;
                    counter++ ;
                }
            }
            
            if ( counter >= 2 && counter < 5 && x != 0 ) {
                
                System.out.print ( x + " " ) ;
            }
        }
        
        System.out.println () ;
            
        sc.close() ;
    }
}