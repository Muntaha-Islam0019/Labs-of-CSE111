import java.util.* ;
public class Task03 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in) ; 
        
        System.out.println ( "Please enter a word." ) ;
        String s = sc.next() ;
        sc.close() ;
        
        for (int count = 0 ; count < s.length() ; count++) {
            System.out.println ( s.charAt(count) + " : " + (int) s.charAt(count) ) ; // casting as an integer
        }
    }
}