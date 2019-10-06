import java.util.* ;
class Task18 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        MyString ms = new MyString(str) ;
        
        System.out.print ( "Enter a character : " ) ; 
        char ch = sc.nextLine().charAt(0) ;
        
        System.out.print ( "Enter the starting index : " ) ;
        int index = sc.nextInt() ;
        
         System.out.println ( "The first index of this particular char starting with this particular index is : " + ms.indexOf(ch,index) ) ;
        
        sc.close() ;
    }
}