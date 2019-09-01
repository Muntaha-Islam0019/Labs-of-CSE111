import java.util.*;

public class Task07 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        ArrayList <Integer> arr = new ArrayList <Integer> () ;
        
        for ( int count = 1 ; count <= 10 ; count ++ ) {
            arr.add( sc.nextInt() ) ;
            System.out.println ( "You've entered " + arr ) ;
        }
    }
}
