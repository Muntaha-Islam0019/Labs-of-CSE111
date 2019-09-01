import java.util.* ;
public class Task05 {
    public static void main ( String[] args ) {
        
        Scanner sc = new Scanner ( System.in ) ;
        
        System.out.println ( "Please enter voltage." ) ;
        double v = sc.nextDouble() ;
        
        System.out.println ( "Please enter resistance." ) ;
        double r = sc.nextDouble() ;
        
        System.out.println ( "Please enter inductance." ) ;
        double l = sc.nextDouble() ;
        
        System.out.println ( "Please enter capacitance." ) ;
        double c = sc.nextDouble() ;
        
        System.out.println ( "Please enter frequency." ) ;
        double f = sc.nextDouble() ;
        
        sc.close() ;
        
        // the portion of math separately 
        
        double x = 2 * Math.PI * f * l ;
        double y = 2 * Math.PI * f * c ;
        double z = x - (1/y) ;
        double m = (r*r) - (z*z) ;
        
        double i = v /( Math.sqrt(m) ) ;
        
        System.out.printf ( "The value of current is : %.4f\n" , i ) ;
        
    }
}