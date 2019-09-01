import java.util.* ;
public class Task06 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in) ; 
        
        System.out.println ( "Please enter a word." ) ;
        String str = sc.nextLine() ;
        sc.close() ;
        
        System.out.println ( str ) ;
        System.out.println ( str.concat( "==THE END==" ) ) ; // concat just do the part of + . though it's easier to concat using concat :3.
        System.out.println ( str ) ;
    }
}