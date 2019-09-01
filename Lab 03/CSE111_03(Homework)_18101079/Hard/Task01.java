import java.util.* ;
public class Task01 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s = sc.next() ;
        sc.close() ;
        
        int sum = 0 ; // As we know a number is divisible by 3 if it's sum of digits is divisible by 3
        
        for (int count = 0 ; count < s.length() ; count++) {
            
            char ch = s.charAt(count) ; // Taking each char
            String str = String.valueOf(ch); 
            
            /* Taking the char to String
             * or parseInt won't work */
            
            Integer i = Integer.parseInt(str) ;
            
            sum += i ;
        }
        
        if ( sum % 3 == 0 ) {
            System.out.printf ( "%s is divisible by 3\n" , s ) ;
        } else { 
            System.out.printf ( "%s is not divisible by 3\n" , s ) ;
        }
        
    }
}
        
         