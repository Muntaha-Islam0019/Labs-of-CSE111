import java.util.* ;
class Task15 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter a string : " ) ;
        String str = sc.nextLine() ;
        MyString ms = new MyString(str) ;
        
        System.out.print ( "Enter an integer : " ) ;
        int index1 = sc.nextInt() ;
        
        System.out.print ( "Enter another integer : " ) ;
        int index2 = sc.nextInt() ;
        
        if ( (index1 <= ms.length()) && !(index1 < 0 ) && (index2 <= ms.length()) && !(index2 < 0 ) && (index1 < index2) ) {
            
            MyString tempObj = ms.substring(index1,index2) ;
            
            System.out.println ( "The desired substring is : " + Arrays.toString(tempObj.arr) ) ;
        } else {
            System.out.println ( "Invalid input." ) ;
        }
        sc.close() ;
    }
}
