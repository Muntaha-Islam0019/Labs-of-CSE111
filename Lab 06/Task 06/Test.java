import java.util.Arrays ;

public class Test {
    public static void main (String [] args) {
        
        Task06 t1 = new Task06() ;
        
        int arr [] = new int [10] ;
        
        for ( int count = 0 ; count < arr.length ; count++ ) {
            if ( count % 2 == 0 ) {
                arr[count] = count ;
            } else {
                arr[count] = count*(-1) ;
            }
        }
        
        String s ;
        s = Arrays.toString(arr) ;
        
        System.out.println ( "Array before modifing : " + s ) ;
        
        int [] arrNew = t1.arrayModifier (arr , arr.length) ;
        
        String str ;
        str = Arrays.toString(arrNew) ;
        
        System.out.println ( "Array after modifing : " + str ) ;
    }
}