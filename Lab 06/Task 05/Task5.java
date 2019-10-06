import java.util.* ;

public class Task5 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.println ( "Please enter a word in uppercase letters." ) ;
        String str = sc.next() ;
        
        int [] counterArray = new int [91] ;
        
        for ( int index = 65 ; index < counterArray.length ; index++ ) {
            for ( int index2 = 0 ; index2 < str.length() ; index2++ ) {
                
                if ( (char)index == str.charAt(index2) ) {
                    counterArray[index]++ ;
                }
                
            }
        }
        
        int max = 65 ;
        for (int index = 66 ; index < counterArray.length ; index++) {
            if ( counterArray[index] > counterArray[max] ) {
                max = index ;
            }
        }
        
        counterArray[max] = 0 ;
        max = 0 ;
        
        for (int index = 65 ; index < counterArray.length ; index++) {
            if ( counterArray[index] > counterArray[max] ) {
                max = index ;
            }
        }
        
        System.out.println ( "The char what occured the second most times is : " + (char)max ) ;
    }
}