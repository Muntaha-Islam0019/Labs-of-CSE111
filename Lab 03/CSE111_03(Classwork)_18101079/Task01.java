import java.util.* ;
public class Task01 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in) ; 
        
        System.out.println ( "Please enter a word." ) ;
        String str = sc.next() ;
        sc.close() ;
        
        System.out.println ( "The length is : " + str.length() ) ; // default method
    }
}