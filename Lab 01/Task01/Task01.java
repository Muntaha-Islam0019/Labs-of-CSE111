import java.util.* ; 
import static java.lang.System.* ; 
 
public class Task01 { 
     
    public static void main ( String [] args ) { 
         
        Scanner input = new Scanner ( in ) ; 
         
        out.print ( " Please enter a number : " ) ; 
        int quanLine = input.nextInt() ; 
       
        for ( int lineCount = 1 ; lineCount <= quanLine ; lineCount ++ ) {
            
            out.print ( lineCount ) ;
            
        }
        out.println() ; 
    } 
} 
         
         
        