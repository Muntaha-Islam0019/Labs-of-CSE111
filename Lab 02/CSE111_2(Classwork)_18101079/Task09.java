import java.util.*;
public class Task09 {
    public static void main ( String[] args ) {
        
        Scanner sc = new Scanner (System.in) ;
        
        // Taking the numbers
        Integer [] arr = new Integer [10] ;
        System.out.println ( "Enter the numbers. " ) ;
        for (int count = 0 ; count < arr.length ; count++ ) {
            arr[count] = sc.nextInt() ;
        }
        
        // asking for a string input to choose the path
        System.out.println ( "How do you want to sort the number?" ) ;
        System.out.println ( "Enter 'a' if you want to sort only numbers at odd positions." ) ;
        System.out.println ( "Enter 'b' if you want to sort only numbers at even positions." ) ;
        System.out.println ( "Enter 'c' if you want to sort all the numbers." ) ;
        
        String choice = sc.next() ;
        
        if ( choice.equals("a") ) {
            
            for (int count = 0 ; count < arr.length ; count++ ) {
                for (int count2 = count ; count2 < arr.length ; count2++ ) {
                    
                    if ( count % 2 != 0 && count2 % 2 != 0 ) { // odd
                        
                        if ( arr[count] > arr[count2] ) {
                            int temp = arr[count2] ;
                            arr[count2] = arr[count] ;
                            arr[count] = temp ;
                        }
                    }
                }
            }
        } else if ( choice.equals("b") ) {
            
            for (int count = 0 ; count < arr.length ; count++ ) {
                for (int count2 = count ; count2 < arr.length ; count2++ ) {
                    
                    if ( count % 2 == 0 && count2 % 2 == 0 ) { // even
                        
                        if ( arr[count] > arr[count2] ) {
                            int temp = arr[count2] ;
                            arr[count2] = arr[count] ;
                            arr[count] = temp ;
                        }
                    }
                }
            }
        } else if ( choice.equals("c") ) {
            
            for (int count = 0 ; count < arr.length ; count++ ) {
                for (int count2 = count ; count2 < arr.length ; count2++ ) {
                    
                    if ( arr[count] > arr[count2] ) { // all
                        int temp = arr[count2] ;
                        arr[count2] = arr[count] ;
                        arr[count] = temp ;
                    }
                }
            }
        }
        
        for (int count = 0 ; count < arr.length ; count++ ) { // printing the whole array
            System.out.print ( arr[count] + " " ) ;
        }
        
        System.out.println () ;
    }
}