import java.util.* ;
public class Task04 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in) ; 
        
        int [] statistics = new int [100] ; // counter array
        
        String str ;
        
        System.out.println("Enter a word.");
        str = sc.nextLine();
        sc.close() ;
        
        for( int intCount = 65 ; intCount <= 90 ; intCount++ ) { // as we just need that array positons as a counter
            
            // We can do it in an arraylist too. that'll save a lot memory. but now let's forget about memory.
            for ( int charCount = 0 ; charCount < str.length() ; charCount++ ) {
                
                if ( (int) str.charAt(charCount) == intCount ) {
                    statistics[intCount] = statistics[intCount] + 1 ; // counting
                }
            }
        }
        
        for(int intCount = 65 ; intCount <= 90 ; intCount++) {
            System.out.println(  (char) intCount + " which is " + intCount + " was found " + statistics[intCount] + " times"); 
            /* casting to char from in
             * casting to string will throw StringOutOfBoundException */
        }
    }
}
