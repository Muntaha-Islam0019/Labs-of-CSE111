import java.util.* ;
public class Task02 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        Outer :
        while (sc.hasNext()) {
            
            String s = sc.next() ;
            
            int [] arr = new int [123] ;
            
            for( int intCount = 65 ; intCount < arr.length ; intCount++ ) { // as we just need that array positons as a counter
                for ( int charCount = 0 ; charCount < s.length() ; charCount++ ) {
                    if ( (int) s.charAt(charCount) == intCount ) {
                        arr[intCount] = arr[intCount] + 1 ; // counting
                    }
                }
            }
            
            for( int count = 65 ; count <= 122 ; count++ ) {
                if ( arr[count] > 1 ) {
                    System.out.printf( "\'%s\' has been counted %d times in the word \"%s\"..\n" , (char)count , arr[count] , s ) ;
                    System.out.println ( "Please enter another word." ) ;
                    continue Outer ; // It will continue the outer loop as I need to take another input
                }
            }
            
            System.out.printf ( "You entered %s.\n" , s ) ;
            sc.close() ;
            break ;
        }
    }
}