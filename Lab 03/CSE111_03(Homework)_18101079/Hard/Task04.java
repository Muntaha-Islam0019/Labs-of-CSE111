import java.util.* ;
public class Task04 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int i = sc.nextInt() ;
        String s = sc.next() ;
        sc.close() ;
        
        for (int count = 0 ; count < s.length() ; count++) {
            
            int asciiNo = (int) s.charAt(count) ; // Figuring the ASCII value
            
            for (int count2 = 1 ; count2 <= i ; count2++ , asciiNo++) {
                
                if ( asciiNo == 91 ) { 
                    /* if it's gonna cross the uppercase ASCII value limit
                     * we'll turn it back */
                    asciiNo = 65 ;
                }
            }
            
            char newChar = (char) asciiNo ;
            System.out.print ( newChar ) ;
        }
        
        System.out.println() ;
    }
}