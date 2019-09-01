import java.util.* ;
public class Task01 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        String s = sc.next() ;
        sc.close() ;
        
        for (int count = 0 ; count < s.length() ; count++) {
            System.out.println(s.substring(0,count+1)) ; 
            
            /* +1 as the substring method returns from a specific index to the previous
             * of the next index */
        }
    }
}
                                   