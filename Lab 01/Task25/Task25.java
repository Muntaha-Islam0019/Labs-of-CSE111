import java.util.* ; 
import static java.lang.System.* ; 

public class Task25 { 
    
    public static void main ( String [] args ) { 
        
        Scanner input = new Scanner ( in ) ; 
        
        out.print ( " Please enter a number : " ) ; 
        int n = input.nextInt() ;
        
        
        for ( int i = 1 , l = 1 ; i <= (2*n) - 1 ; i ++ ) {
            
            if ( i > n ) { 
                
                l = ( 2*n ) - i ;
                
            }
            
            else { 
                
                l = i ;
                
            }
            
            for ( int k = 1 ; k <= n - l ; k ++ ) {
                
                out.print ( " " ) ;
                
            }
            
            for ( int j = 1 ; j <= ( l*2 ) - 1 ; j++ ) {
                
                if (i==1 || j == 1 || j == ((l*2) - 1) ) {
                    out.print ( '*' ) ;
                }
                else {
                    out.print ( " " ) ;
                }
            }
            out.println() ; 
        } 
    } 
}


