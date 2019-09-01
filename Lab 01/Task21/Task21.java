import java.util.* ; 
import static java.lang.System.* ; 

public class Task21 { 
    
    public static void main ( String [] args ) { 
        
        Scanner input = new Scanner ( in ) ; 
        
        out.print ( " Please enter a number : " ) ; 
        int n = input.nextInt() ; 
        
        out.print ( " Please enter another number : " ) ; 
        int m = input.nextInt() ; 
        
        for ( int i = 1 ; i <= n ; i ++ ) {
            
            for ( int j = 1 ; j <= m ; j++ ) {
                
                if ( i == 1 || i == n || j == 1 || j == m ) {
                    
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


