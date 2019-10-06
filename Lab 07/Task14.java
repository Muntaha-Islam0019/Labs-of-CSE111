import java.util.* ;
class Task14 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        MyString ms = new MyString(str) ;
        
        System.out.print ( "Enter an integer : " ) ;
        int index = sc.nextInt() ;
        
        if ( index <= ms.length() && !(index < 0 ) ) {
            
            MyString tempObj = ms.substring(index) ;
            
            System.out.println ( "The desired substring is : " + Arrays.toString(tempObj.arr) ) ;
        } else {
            System.out.println ( "Invalid input." ) ;
        }
        sc.close() ;
    }
}
