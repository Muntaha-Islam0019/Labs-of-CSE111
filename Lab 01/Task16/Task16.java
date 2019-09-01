import java.util.* ; 
import static java.lang.System.* ; 

public class Task16 { 
    
    public static void main ( String [] args ) { 
        
        Scanner input = new Scanner ( in ) ; 
        
        out.print ( " Please enter the row number : " ) ; 
        int m = input.nextInt() ;
        
        out.print ( " Please enter the column number : " ) ; 
        int n = input.nextInt() ;
        
        
        for ( int i = 1 ; i <= m ; i ++ ) {
            
            for ( int j = 1 ; j <= n ; j ++ ) {
                out.print ( '*' ) ;
            }
            
            out.println() ;
        }
    }
}