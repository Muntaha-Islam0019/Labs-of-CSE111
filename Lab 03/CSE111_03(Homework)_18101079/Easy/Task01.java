import java.util.* ;
public class Task01 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s = sc.next() ;
        sc.close() ;
        
        char [] arr = s.toCharArray() ; // turning the string into a array of char
        
        Arrays.sort(arr) ; // sorting using method
        
        for (int count = 0 ; count < arr.length ; count++) {
            
            System.out.print(arr[count]) ;
            
            /* We could use toString method
             * but this code has a definite output method
             * which has no commas and braces */
        }
        
        System.out.println() ;
    }
}