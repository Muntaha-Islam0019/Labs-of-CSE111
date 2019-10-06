import java.util.* ;
class Task20 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str1 = sc.nextLine() ;
        
        System.out.print ( "Enter another string : " ) ;
        String str2 = sc.nextLine() ;
        
        MyString ms1 = new MyString(str1) ;
        MyString tempObj = ms1.concat(str2) ;
        
        String s = "" ;
        for ( int index = 0 ; index < tempObj.arr.length ; index++ ) {
            s += tempObj.arr[index] ;
        }
        
        System.out.println ( "After concatenation : " + s ) ;
        
        sc.close() ;
    }
}