import java.util.* ; 
import static java.lang.System.* ; 

public class Task13 { 
    
    public static void main ( String [] args ) { 
        
        Scanner input = new Scanner ( in ) ; 
        
        out.print ( " Please enter a number : " ) ; 
        int n = input.nextInt() ;
        
        for ( int i = 1 ; i <= n ; i ++ ) {
            out.print ( i ) ;
        }
        for ( int i = n - 1 ; i >= 1 ; i -- ) {
            out.print ( i ) ;
        }
    }
}
        
