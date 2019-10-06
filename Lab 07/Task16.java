import java.util.* ;
class Task16 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        MyString ms = new MyString(str) ;
        
        System.out.print ( "Enter a character : " ) ; 
        char ch = sc.nextLine().charAt(0) ;
        
        System.out.println ( "The index of this particular char : " + ms.indexOf(ch) ) ;
        
        sc.close() ;
    }
}