import java.util.*;

public class Task02 { 
    
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        ArrayList <Integer> arr = new ArrayList <Integer> () ; // Declaring an arraylist
        
        for ( int count = 1 ; count <= 10 ; count ++ ) {
            System.out.println ( "Enter a number." ) ;
            arr.add( sc.nextInt() ) ; // Taking inputs
            System.out.println ( "You have entered " + arr ) ; // Printing the arraylist after every input
        }
        
        sc.close();
    }
}
