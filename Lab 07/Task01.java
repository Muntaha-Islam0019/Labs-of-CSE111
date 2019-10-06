import java.util.* ;
class Task01 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        MyString ms = new MyString(str) ;
        
        System.out.println ( "The length of the string is : " + ms.length() ) ;
        
        sc.close() ;
    }
}