import java.util.* ;
public class Task06 {
    public static void main ( String[]args ) {
        
        Scanner sc = new Scanner ( System.in) ;
        
        System.out.println ( "Please enter the value of n." ) ;
        int n = sc.nextInt() ;
        int num , sum = 0 ;
        sc.close() ;
        
        for ( int count = 1 ; count <= n ; count ++ ) {
            if ( count % 2 != 0 ) {
                num = count * count ;
            }
            else { 
                num = (-1) * count * count ;
            }
            
            sum += num ;
        }
        
        System.out.println ( "The summation is : " + sum ) ;
        
    }
}