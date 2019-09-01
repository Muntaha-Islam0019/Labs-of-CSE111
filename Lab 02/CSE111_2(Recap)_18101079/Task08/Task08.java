import java.util.*;

public class Task08 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        ArrayList <Integer> arr = new ArrayList <Integer> () ;
        
        for ( int count = 1 ; count <= 10 ; count++ ) {
            
            int a = sc.nextInt() ;
            
            if ( arr.contains(a) ) { // Checking
                System.out.println ( "It's duplicate. Please enter another number." ) ;
                count-- ; // Or the loop will run only 10 times
            }
            else {
                arr.add(a) ;
            }
        }
    }
}
