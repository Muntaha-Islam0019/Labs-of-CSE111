import java.util.* ;
public class Task03 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s = sc.next() ;
        sc.close() ;
        
        StringBuilder sb = new StringBuilder ("") ;
        
        for (int count = 0 ; count < s.length() ; count++) {
            
            char ch = s.charAt(count) ;
            if ( !(Character.isUpperCase(ch)) ) { // Checking if char is uppercase or not
                sb.append(ch) ; // Adding to stringbuilder
            } else {
                sb.append(ch) ;
                sb = sb.reverse() ; // reversing the stringbuilder as the word ends
                System.out.print(sb) ;
                sb.delete(0,sb.length()) ; 
                // deleting all the values or everytime full sb will be reversed
            }
                
        }
        
        System.out.println() ;
    }
}