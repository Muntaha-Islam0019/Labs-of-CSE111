import java.util.* ;
public class Task02 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s1 = sc.next() ;
        String s2 = sc.next() ;
        
        sc.close() ;
        
        int product1 = 1 ;
        int product2 = 1 ;
        
        for (int count = 0 ; count < s1.length() ; count++) {
            
            char ch = s1.charAt(count) ; // Taking each char
            int diff = (int)ch - 64 ; 
            
            /* We could do it by switch
             * but it wastes a lot memory
             * as well as a lot time
             * So using 65 to 90 
             * The ASCII value of uppercase chars 
             * so we can figure out the position of the particular char
             * like E is in 5th position
             * 69-65 = 5 */
            
            product1 *= diff ;
        }
        
        for (int count = 0 ; count < s2.length() ; count++) {
            
            char ch = s2.charAt(count) ;
            int diff = (int)ch - 64 ;
            
            product2 *= diff ;
        }
        
        int mod1 = product1 % 14 ;
        int mod2 = product2 % 14 ;
        
        if (mod1 < mod2) {
            System.out.println ( "I Am Happy With My Coach" ) ;
        } else {
            System.out.println ( "I Am Sad With My Coach" ) ;
        }
    }
}