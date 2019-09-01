import java.util.*;

public class Task05 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        ArrayList <Integer> arr = new ArrayList <Integer> (10) ;
        
        // Grabbing
        for ( int count = 1 ; count <= 10 ; count ++ ) {
            arr.add( sc.nextInt() ) ;
        }
        
        int check = sc.nextInt() ;
        
        // Checking & Confirming
        if ( arr.contains(check) ) {
            System.out.println ("yes") ;
        }
        else {
            System.out.println ("no") ;
        }
        
    }
}