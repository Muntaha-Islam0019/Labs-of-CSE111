import java.util.* ;
class Task08 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        
        MyString ms = new MyString(str) ;
        ms.toLowerCase() ;
        
        System.out.println ( "After converting all chars to lowercase : " + Arrays.toString(ms.arr) ) ;
        sc.close() ;
    }
    
}