import java.util.* ;
public class Task02 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in) ; 
        
        System.out.println ( "Please enter a word." ) ;
        String str = sc.next() ;
        sc.close() ;
        
        for (int count = 0 ; count < str.length() ; count++) {
            System.out.println (str.charAt(count)) ; // chars one by one
        }
    }
}