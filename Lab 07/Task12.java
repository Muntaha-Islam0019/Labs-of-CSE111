import java.util.* ;
class Task12 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str1 = sc.nextLine() ;
        
        System.out.print ( "Enter another string : " ) ;
        String str2 = sc.nextLine() ;
        
        MyString ms1 = new MyString(str1) ;
        MyString ms2 = new MyString(str2) ;
        
        System.out.println ( "Compare value : " + ms1.compareTo(ms2) ) ;
        sc.close() ;
    }
}