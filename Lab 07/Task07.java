import java.util.* ;
class Task07 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        
        System.out.print ( "Enter a character : " ) ;
        char c1 = sc.next().charAt(0) ;
        
        System.out.print ( "Enter another character : " ) ;
        char c2 = sc.next().charAt(0) ;
        
        MyString ms = new MyString(str) ;
        MyString tempObj = ms.replaceLast(c1 , c2) ;
        
        System.out.println ( "After replacing last " + c1 + " with " + c2 + " : " + Arrays.toString(tempObj.arr) ) ;
        sc.close() ;
    }
    
}