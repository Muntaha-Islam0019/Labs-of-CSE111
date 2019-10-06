import java.util.* ;
class Task09 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        
        MyString ms = new MyString(str) ;
        ms.toUpperCase() ;
        
        System.out.println ( "After converting all chars to uppercase : " + Arrays.toString(ms.arr) ) ;
        sc.close() ;
    }
    
}