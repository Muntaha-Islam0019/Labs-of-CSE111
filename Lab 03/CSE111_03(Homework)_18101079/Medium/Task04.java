import java.util.* ;
public class Task04 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s = sc.next() ;
        sc.close() ;
        
        StringBuilder sb = new StringBuilder ("") ; // to store valid inputs
        
        for (int count = 0 ; count < s.length()-1 ; count++) { 
            
            /* s.length()-1 because we are using s.charAt(count+1)
             * if we use s.length() then it will throw IndexOutOfBounds exception
             */
            
            if ( (s.charAt(count) != s.charAt(count+1)) ) {
                sb.append(s.charAt(count)) ;
                
                /* If a char and the char next to it is not equal
                 * the char will get in sb
                 * for instance, if BBBB, then B of index 0 won't input
                 * then B of index 1 won't input
                 * then B of index 2 won't input */
                 
            }
            
            if ( count == s.length()-2 ) { 
                
                /* If we don't use this then for the BBBB case last B won't get input
                 * As for the condition we will skip it
                 * so this conditional statement inputs the last char without checking it's next
                 * even there is no next */
                
                sb.append(s.charAt(s.length()-1)) ;
            }
        }
        
        System.out.println (sb) ;
    }
}