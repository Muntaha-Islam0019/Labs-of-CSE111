import java.util.* ; 
import static java.lang.System.* ; 

public class Task06 { 
    
    public static void main ( String [] args ) { 
        
        Scanner input = new Scanner ( in ) ; 
        
        out.print ( " Please enter a number : " ) ; 
        int n = input.nextInt() ;
        
        for ( int i = 1 ; i <= n ; i ++ ) {
            
            for ( int k = 1 ; k <= n - i ; k ++ ) {
            
            out.print ( " " ) ;
            
            }
            
            for ( int j = 1 ; j <= ( i*2 ) - 1 ; j++ ) {
                
                out.print ( j ) ;
                
            }
            out.println() ; 
        } 
    } 
}


