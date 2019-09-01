import java.util.* ; 
import static java.lang.System.* ; 

public class Task15 { 
    
    public static void main ( String [] args ) { 
        
        Scanner input = new Scanner ( in ) ; 
        
        out.print ( " Please enter a number : " ) ; 
        int n = input.nextInt() ;
        
        for ( int i = 1 ; i <= n ; i ++ ) {
            out.print ( '*' ) ;
        }
    }
}