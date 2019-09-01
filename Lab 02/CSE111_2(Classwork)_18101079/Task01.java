import java.util.Scanner ;

public class Task01 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        int [] arr = new int [10] ; // Declaring an array
        
        for (int count = 0 ; count < arr.length ; count++) { // taking inputs
            System.out.printf ( "Enter an element : ") ;
            arr [count] = sc.nextInt() ;
        }
        
        for (int count = arr.length - 1 ; count >= 0 ; count--) { // printing it in reverse order
            System.out.printf ( "%d " , arr [count] ) ;
        }
        
        /* we could use collections.reverse method too*/ 
        System.out.println() ;
        sc.close() ;
    }
}