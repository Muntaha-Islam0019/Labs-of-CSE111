import java.util.* ;
import static java.lang.System.* ;

public class Task10 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( in ) ;
        
        out.print ( " Please enter a number : " ) ;
        int n = input.nextInt() ;
        
        for ( int i = n ; i >= 1 ; i -- ) {
            
            for ( int j = 1 ; j < i ; j ++ ) {
                
                out.print ( " " ) ;
                
            }
            
            for  ( int k = i ; k <= n ; k ++ ) { 
                
                if ( k == i || k == n || i == 1 || i == n ) { 
                    
                    out.print ( k ) ;
                    
                }
                
                else { 
                    
                    out.print ( " " ) ;
                    
                }
                
            }
            
            out.println() ;
            
        }
        
    }
    
}
        
        