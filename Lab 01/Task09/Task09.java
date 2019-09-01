import java.util.* ; 
import static java.lang.System.* ; 

public class Task09 { 
    
    public static void main ( String [] args ) { 
        
        Scanner input = new Scanner ( in ) ; 
        
        out.print ( " Please enter a number : " ) ; 
        int n = input.nextInt() ;
        
        for ( int i = 1 ; i <= n ; i ++ ) {
            
            for ( int j = 1 ; j <= i ; j++ ) {
                
                if ( i == n || j == 1 || j == i ) {
                    
                    out.print ( j ) ;
                    
                }
                else {
                    
                    out.print ( " " ) ;
                        
                }
                
            }
            out.println() ; 
        } 
    } 
}


