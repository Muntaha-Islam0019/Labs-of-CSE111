import java.util.*;

public class Task04 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        ArrayList <Integer> arr = new ArrayList <Integer> () ;
        
        System.out.println ( "Enter 5 unique numbers. Or the loop won't stop." );
        
        for ( int count = 1 ; count <= 5 ; count++ ) {
            
            int a = sc.nextInt() ;
            
            if ( arr.contains(a) ) { // Checking
                System.out.println ( "It's duplicate. Please enter another number." ) ;
                count-- ; // Or the loop will run only 5 times
                
                /* it could be also done by tweaking the condition */
            }
            else {
                arr.add(a) ;
            }
        }
        
        System.out.println ( "The numbers are : " + arr ) ;
    }
}
