import java.util.*;
public class Test{
    public static int [] removeOdd (int [] input){
        
        int evenCount = 0 ;
        for ( int count = 0 ; count < input.length ; count++ ) {
            if ( input[count] % 2 == 0 ) {
                evenCount++ ;
            }
        }
        
        int [] arr = new int [evenCount] ;
        
        for ( int count = 0 , count2 = 0 ; count < input.length ; count++ , count2++ ) {
            if ( input[count] % 2 == 0 ) {
                arr[count2] = input[count] ;
            } else {
                count2-- ;
            }
        }
        
        return arr ;
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
}
