import java.util.* ;
public class Task02 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s = sc.nextLine() ;
        sc.close() ;
        
        char [] arr = s.toCharArray() ; // turning the string into a array of char
        
        for (int count = 0 ; count < arr.length ; count++) {
            
            char c = arr[count] ;
            if ( c != ' ' ) { // Checking if it's a space or not
                
                // changing the ASCII value to the next one
                int i = ((int)arr[count]) + 1 ; 
                arr[count] = (char) i ;
            }
        }
        
        for (int count = 0 ; count < arr.length ; count++) {
            System.out.print(arr[count]) ;
        }
        
        System.out.println() ;
    }
}