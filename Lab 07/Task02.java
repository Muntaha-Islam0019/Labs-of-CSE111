import java.util.* ;
class Task02 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        MyString ms = new MyString(str) ;
        
        System.out.print ( "Enter an index : " ) ;
        int index = sc.nextInt() ;
        
        if ( (index-1 >= ms.length()) || (index-1 <= 0) ) {
            System.out.println ( "Invalid index." ) ;
        } else {
            System.out.println ( "Value at that position is : " + ms.charAt(index-1) + "." ) ;
        }
        sc.close() ;
    }
    
}
            