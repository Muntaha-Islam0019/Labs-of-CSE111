import java.util.* ;
public class Task03 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s1 = sc.next() ;
        String s2 = sc.next() ;
        sc.close() ;
        
        String str = s1.concat(" ") ; // concatenation with space
        str = str.concat(s2) ; // concatenation with s2
        
        int sum = 0 ;
        
        for (int count = 0 ; count < str.length() ; count++) {
            if (str.charAt(count) != ' ') {
                sum += (int) str.charAt(count) ; // turning to ASCII value to sum
            }
        }
        
        System.out.println ( str ) ;
        System.out.println ( sum ) ;
    }
}